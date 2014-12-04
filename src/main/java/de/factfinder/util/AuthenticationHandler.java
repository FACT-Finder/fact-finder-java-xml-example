package de.factfinder.util;

import org.apache.commons.codec.digest.DigestUtils;

import de.factfinder.properties.PropertiesHandler;
import de.factfinder.properties.PropertiesNames;

/**
 * 
 * Creates the authentication parameters.
 *
 * @author gt
 */
public final class AuthenticationHandler implements Constants {
	private final boolean	advanced;
	private final String	username;
	private final String	hashedPassword;
	private String			prefix	= null;
	private String			suffix	= null;

	private AuthenticationHandler() {
		final PropertiesHandler propertiesHandler = PropertiesHandler.getHandler();
		this.advanced = propertiesHandler.getBooleanProperty(PropertiesNames.useAdvancedHash.name());
		this.username = propertiesHandler.getProperty(PropertiesNames.username.name());
		this.hashedPassword = propertiesHandler.getProperty(PropertiesNames.hashedPassword.name());
		if (advanced) {
			this.prefix = propertiesHandler.getProperty(PropertiesNames.hashPrefix.name());
			this.suffix = propertiesHandler.getProperty(PropertiesNames.hashSuffix.name());
		}
	}

	public String getAuthenticationToken() {
		final StringBuilder token = new StringBuilder();
		token.append(Parameters.username.name()).append(EQUALS).append(username);
		if (advanced) {
			final String timestamp = String.valueOf(System.currentTimeMillis());
			final String advancedHash = DigestUtils.md5Hex(prefix + timestamp + hashedPassword + suffix);
			token.append(AND).append(Parameters.timestamp.name()).append(EQUALS).append(timestamp).append(AND).append(Parameters.password.name())
					.append(EQUALS).append(advancedHash);
		} else {
			token.append(AND).append(Parameters.password.name()).append(EQUALS).append(hashedPassword);
		}
		return token.toString();
	}

	public static AuthenticationHandler getInstance() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final AuthenticationHandler	INSTANCE	= new AuthenticationHandler();
	}

}
