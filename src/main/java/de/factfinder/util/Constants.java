package de.factfinder.util;

import java.util.regex.Pattern;

public interface Constants {
	public static final String	AND								= "&";
	public static final String	EQUALS							= "=";
	public static final String	QUERY_STRING_PREFIX				= "?";
	public static final String	SERVER_URL_ENCODING				= "UTF-8";
	public static final Pattern	NUMBER_PATTERN					= Pattern.compile("\\d+");
	public static final String	COMPRESSION_TYPE				= "gzip";
	public static final String	REQUEST_HEADER_LANGUAGE			= "Accept-Language";
	public static final String	REQUEST_HEADER_CONTENT_ENCODING	= "Accept-Encoding";
	public static final String	BASE_URL_SUFFIX					= ".ff" + QUERY_STRING_PREFIX;
	public static final String	QUERY_ORIGIN_TAGCLOUD			= "tagcloud";
	public static final String	SOURCE_RECOMMENDATIONS			= "int:recommendedproducts";
	public static final String	SOURCE_SIMILARPRODUCTS			= "int:similarproducts";
	public static final String	ORIG_POS_FIELD					= "__ORIG_POSITION__";
}
