package de.factfinder.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

import javax.servlet.http.HttpServletRequest;

import de.factfinder.properties.PropertiesHandler;
import de.factfinder.properties.PropertiesNames;

/**
 * 
 * Makes the requests and provides the response stream.
 *
 * @author gt
 */
public final class ConnectionHandler implements Constants {
	private final Boolean usePersonalisation;
	private final Integer connectionTimeout;
	private final Integer connectionReadTimeout;

	private ConnectionHandler() {
		final PropertiesHandler propertiesHandler = PropertiesHandler.getHandler();
		this.usePersonalisation = propertiesHandler.getBooleanProperty(PropertiesNames.usePersonalisation.name());
		this.connectionTimeout = propertiesHandler.getIntProperty(PropertiesNames.connectionTimeout.name());
		this.connectionReadTimeout = propertiesHandler.getIntProperty(PropertiesNames.connectionReadTimeout.name());
	}

	public InputStream getInputStream(final URL url, final HttpServletRequest request) {
		InputStream inputStream = null;
		try {
			final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(connectionTimeout);
			connection.setReadTimeout(connectionReadTimeout);
			connection.setRequestProperty(REQUEST_HEADER_CONTENT_ENCODING, COMPRESSION_TYPE);
			if (usePersonalisation) {
				connection.setRequestProperty(REQUEST_HEADER_SESSION_ID, request.getSession(true).getId());
			}
			connection.connect();
			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				System.out.println(url.toString());
				if (COMPRESSION_TYPE.equals(connection.getContentEncoding())) {
					inputStream = new GZIPInputStream(connection.getInputStream());
				} else {
					inputStream = connection.getInputStream();
				}
			} else {
				System.err.println(url.toString());
			}
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return inputStream;
	}

	public static ConnectionHandler getInstance() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final ConnectionHandler INSTANCE = new ConnectionHandler();
	}

}
