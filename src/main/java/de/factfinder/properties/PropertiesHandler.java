package de.factfinder.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import de.factfinder.util.Constants;

/**
 * 
 * Provides the configuration.
 *
 * @author gt
 */
public final class PropertiesHandler {
	private Properties	properties	= null;

	private PropertiesHandler() {
		InputStream inputStream = null;
		try {
			inputStream = this.getClass().getClassLoader().getResourceAsStream("/de/factfinder/properties/FACT-Finder.properties");
			this.properties = new Properties();
			properties.load(inputStream);
		} catch (final IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (final Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public String getProperty(final String name) {
		String value = "";
		if (properties != null) {
			value = this.properties.getProperty(name);
		}
		return value;
	}

	public Integer getIntProperty(final String name) {
		int intValue = Short.MAX_VALUE;
		if (properties != null) {
			final String value = getProperty(name);
			if (Constants.NUMBER_PATTERN.matcher(value).matches()) {
				intValue = Integer.parseInt(value);
			}
		}
		return intValue;
	}

	public Short getShortProperty(final String name) {
		short shortValue = Byte.MAX_VALUE;
		if (properties != null) {
			final String value = getProperty(name);
			if (Constants.NUMBER_PATTERN.matcher(value).matches()) {
				shortValue = Short.parseShort(value);
			}
		}
		return shortValue;
	}

	public Boolean getBooleanProperty(final String name) {
		boolean booleanValue = false;
		if (properties != null) {
			booleanValue = Boolean.parseBoolean(getProperty(name));
		}
		return booleanValue;
	}

	public static PropertiesHandler getHandler() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final PropertiesHandler	INSTANCE	= new PropertiesHandler();
	}

}
