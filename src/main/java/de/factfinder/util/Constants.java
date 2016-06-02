package de.factfinder.util;

import java.util.regex.Pattern;

public interface Constants {
	public static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");
	public static final String AND = "&";
	public static final String EQUALS = "=";
	public static final String QUERY_STRING_PREFIX = "?";
	public static final String SERVER_URL_ENCODING = "UTF-8";
	public static final String COMPRESSION_TYPE = "gzip";
	public static final String REQUEST_HEADER_SESSION_ID = "sid";
	public static final String REQUEST_HEADER_CONTENT_ENCODING = "Accept-Encoding";
	public static final String BASE_URL_SUFFIX = ".ff" + QUERY_STRING_PREFIX;
	public static final String ORIG_POS_FIELD = "__ORIG_POSITION__";
}
