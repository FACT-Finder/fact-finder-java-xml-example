package de.factfinder.util;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import de.factfinder.properties.PropertiesHandler;
import de.factfinder.properties.PropertiesNames;
import de.factfinder.xml610.handler.FACTFinderServices;

/**
 *
 * Builds the request urls based on predefined response parameters or search terms. Creates also the detail link urls for this demo.
 *
 * @author gt
 */
public final class UrlHandler implements Constants {
	private static Map<String, String>	DEFAULT_PARMS		= null;
	private final String				channel;
	private final String				baseUrl;
	private short						maxRecommendations	= 0;
	private short						maxSimilarRecords	= 0;
	private short						maxTagCloudEntries	= 0;

	static {
		DEFAULT_PARMS = new HashMap<String, String>();
		DEFAULT_PARMS.put(Parameters.omitContextName.name(), "true");
		DEFAULT_PARMS.put(Parameters.format.name(), "xml");
	}

	private UrlHandler() {
		final PropertiesHandler propertiesHandler = PropertiesHandler.getHandler();
		this.baseUrl = propertiesHandler.getProperty(PropertiesNames.baseUrl.name());
		this.channel = propertiesHandler.getProperty(PropertiesNames.defaultChannel.name());
		if (propertiesHandler.getBooleanProperty(PropertiesNames.useRecommendations.name())) {
			this.maxRecommendations = propertiesHandler.getShortProperty(PropertiesNames.maxRecommendations.name());
		}
		if (propertiesHandler.getBooleanProperty(PropertiesNames.useSimilarRecords.name())) {
			this.maxSimilarRecords = propertiesHandler.getShortProperty(PropertiesNames.maxSimilarRecords.name());
		}
		if (propertiesHandler.getBooleanProperty(PropertiesNames.useTagCloud.name())) {
			this.maxTagCloudEntries = propertiesHandler.getShortProperty(PropertiesNames.maxTagCloudEntries.name());
		}
	}

	public String getChannel() {
		return channel;
	}

	public URL getRequestUrl(final String ffPath, final HttpServletRequest request) {
		return getRequestUrl(ffPath, request, false);
	}

	public URL getRequestUrl(final String ffPath, final HttpServletRequest request, final boolean ignoreQueryString) {
		URL url = null;
		final StringBuilder urlString = new StringBuilder(baseUrl);
		urlString.append(ffPath);
		switch (FACTFinderServices.valueOf(ffPath)) {
			case Search:
				urlString.append(BASE_URL_SUFFIX);
				break;
			case Recommender:
				urlString.append(BASE_URL_SUFFIX).append("do=getRecommendation").append(AND).append(Parameters.maxResults).append(EQUALS)
						.append(maxRecommendations).append(AND);
				break;
			case SimilarRecords:
				urlString.append(BASE_URL_SUFFIX).append(Parameters.maxRecordCount).append(EQUALS).append(maxSimilarRecords).append(AND);
				break;
			case ProductCampaign:
				urlString.append(BASE_URL_SUFFIX).append("do=getProductCampaigns").append(AND);
				break;
			case TagCloud:
				urlString.append(BASE_URL_SUFFIX).append("do=getTagCloud").append(AND).append(Parameters.wordCount).append(EQUALS).append(maxTagCloudEntries)
						.append(AND);
				break;
			case Tracking:
				urlString.append(BASE_URL_SUFFIX);
				break;
			case Suggest:
				urlString.append(BASE_URL_SUFFIX);
				break;
			default:
				System.err.print("Unknown service");
		}
		urlString.append(AuthenticationHandler.getInstance().getAuthenticationToken());

		if (!ignoreQueryString) {
			final String params = request.getQueryString();
			if (!ignoreQueryString && params != null && !params.isEmpty()) {
				urlString.append(AND).append(params);
			}
		}

		if (request.getParameter(Parameters.channel.name()) == null) {
			urlString.append(AND).append(Parameters.channel.name()).append(EQUALS).append(this.channel);
		}

		for (final Entry<String, String> defaultParam : DEFAULT_PARMS.entrySet()) {
			if (request.getParameter(defaultParam.getKey()) == null) {
				urlString.append(AND).append(defaultParam.getKey()).append(EQUALS).append(defaultParam.getValue());
			}
		}

		if (request.getParameter(Parameters.sid.name()) == null) {
			urlString.append(AND).append(Parameters.sid.name()).append(EQUALS).append(request.getSession().getId());
		}

		try {
			url = new URL(urlString.toString());
		} catch (final MalformedURLException e) {
			e.printStackTrace();
		}

		return url;
	}

	public static String getQueryString(final String sourceUrlOrSearchTerm, final boolean isSearchTerm) {
		final StringBuilder queryString = new StringBuilder();
		if (isSearchTerm) {
			try {
				queryString.append(QUERY_STRING_PREFIX).append(Parameters.query.name()).append(EQUALS)
						.append(URLEncoder.encode(sourceUrlOrSearchTerm, SERVER_URL_ENCODING));
			} catch (final UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		} else if (sourceUrlOrSearchTerm != null) {
			queryString.append(sourceUrlOrSearchTerm.substring(sourceUrlOrSearchTerm.indexOf(QUERY_STRING_PREFIX)));

		}
		return queryString.toString();
	}

	public static String getQueryString(final String sourceUrl) {
		return getQueryString(sourceUrl, false);
	}

	public static String getDetailPageUrl(final String id, final String mid, final String productNumber, final String price, final String query, final int pos,
			final int origPos, final int page, final int origPageSize) {
		final StringBuilder detailPageUrl = new StringBuilder("ffdetails.jsp");
		detailPageUrl.append(QUERY_STRING_PREFIX);
		if (id != null && !id.isEmpty()) {
			detailPageUrl.append(Parameters.id.name()).append(EQUALS).append(id);
			detailPageUrl.append(AND);
		}
		if (mid != null && !mid.isEmpty()) {
			detailPageUrl.append(Parameters.mid.name()).append(EQUALS).append(mid);
			detailPageUrl.append(AND);
		}
		if (productNumber != null && !productNumber.isEmpty()) {
			detailPageUrl.append(Parameters.productNumber.name()).append(EQUALS).append(productNumber);
			detailPageUrl.append(AND);
		}
		if (price != null && !price.isEmpty()) {
			detailPageUrl.append(Parameters.price.name()).append(EQUALS).append(price);
			detailPageUrl.append(AND);
		}
		if (query != null && !query.isEmpty()) {
			try {
				detailPageUrl.append(Parameters.query.name()).append(EQUALS).append(URLEncoder.encode(query, Constants.SERVER_URL_ENCODING));
				detailPageUrl.append(AND);
				if (pos > 0) {
					detailPageUrl.append(Parameters.pos.name()).append(EQUALS).append(pos);
					detailPageUrl.append(AND);
				}
				if (origPos > 0) {
					detailPageUrl.append(Parameters.origPos.name()).append(EQUALS).append(origPos);
					detailPageUrl.append(AND);
				}
				if (page > 0) {
					detailPageUrl.append(Parameters.page.name()).append(EQUALS).append(page);
					detailPageUrl.append(AND);
				}
				if (origPageSize > 0) {
					detailPageUrl.append(Parameters.origPageSize.name()).append(EQUALS).append(origPageSize);
					detailPageUrl.append(AND);
				}
			} catch (final UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return detailPageUrl.toString();
	}

	public static String getDetailPageUrl(final String id, final String mid, final String productNumber, final String price) {
		return getDetailPageUrl(id, mid, productNumber, price, null, -1, -1, -1, -1);
	}

	public static UrlHandler getInstance() {
		return Provider.INSTANCE;
	}

	private static final class Provider {
		public static final UrlHandler	INSTANCE	= new UrlHandler();
	}

}
