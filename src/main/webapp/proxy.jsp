<%@page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@page import="de.factfinder.util.ConnectionHandler"%>
<%@page import="de.factfinder.util.UrlHandler"%>
<%@page import="de.factfinder.util.Constants"%>
<%@page import="de.factfinder.util.Parameters"%> 
<%@page import="de.factfinder.xml610.handler.FACTFinderServices"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%
boolean isTracking = request.getParameter("event") != null;

BufferedReader br = null;
try {
	URL requestUrl = UrlHandler.getInstance().getRequestUrl(isTracking ? FACTFinderServices.Tracking.name(): FACTFinderServices.Suggest.name(), request);
	InputStream inputStream = ConnectionHandler.getInstance().getInputStream(requestUrl, request);
	if (inputStream != null){		
		br = new BufferedReader(new InputStreamReader(inputStream, Constants.SERVER_URL_ENCODING));
	
		String line = br.readLine();
		while (line != null) {
			if (line != null){
				line = line.trim();
				if (line.length() > 0){
					pageContext.getOut().write(line);
				}
			}
			line = br.readLine();
		}
	}
} catch (Exception e) {
	pageContext.getOut().write(e.getMessage());
} finally {
	if (br != null){
		br.close();
	}
}
%>