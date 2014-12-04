<%@page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@page import="de.factfinder.properties.PropertiesNames"%>
<%@page import="de.factfinder.properties.PropertiesHandler"%>
<%@page import="de.factfinder.xml610.search.Product"%>
<%@page import="de.factfinder.xml610.search.Question"%>
<%@page import="de.factfinder.xml610.search.Campaign"%>
<%@page import="de.factfinder.xml610.search.Campaigns"%>
<%@page import="de.factfinder.xml610.search.Answer"%>
<%@page import="de.factfinder.xml610.search.Text"%>
<%@page import="de.factfinder.xml610.similarrecords.SimilarRecords"%>
<%@page import="de.factfinder.xml610.recommender.Record"%>
<%@page import="de.factfinder.xml610.recommender.Field"%>
<%@page import="de.factfinder.xml610.recommender.Results"%>
<%@page import="de.factfinder.xml610.recommender.Ff"%>
<%@page import="de.factfinder.xml610.handler.ProductCampaignsHandler"%>
<%@page import="de.factfinder.xml610.handler.SimilarRecordsHandler"%>
<%@page import="de.factfinder.xml610.handler.RecommenderHandler"%>
<%@page import="de.factfinder.xml610.handler.FACTFinderServices"%>
<%@page import="de.factfinder.util.ConnectionHandler"%>
<%@page import="de.factfinder.util.UrlHandler"%>
<%@page import="de.factfinder.util.Parameters"%>
<%@page import="de.factfinder.util.Constants"%>
<%@page import="org.apache.commons.lang3.StringEscapeUtils"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URL"%>
<!DOCTYPE html>
<%

	final PropertiesHandler propertiesHandler = PropertiesHandler.getHandler();
	String idField = propertiesHandler.getProperty(PropertiesNames.idField.name());
	String masterIdField = propertiesHandler.getProperty(PropertiesNames.masterIdField.name());
	String productNumberField = propertiesHandler.getProperty(PropertiesNames.productNumberField.name());
	String nameField = propertiesHandler.getProperty(PropertiesNames.nameField.name());
	String imageField = propertiesHandler.getProperty(PropertiesNames.imageField.name());
	String priceField = propertiesHandler.getProperty(PropertiesNames.priceField.name());
	
	String id = request.getParameter(Parameters.id.name());
	String mid = request.getParameter(Parameters.mid.name());
	String p = request.getParameter(Parameters.price.name());
	String productNo = request.getParameter(Parameters.productNumber.name());
	String query = request.getParameter(Parameters.query.name());
	if (query != null){
		query = StringEscapeUtils.escapeEcmaScript(query);
	}
	String currentPage = request.getParameter(Parameters.page.name());
	String origPageSize = request.getParameter(Parameters.origPageSize.name());
	String pos = request.getParameter(Parameters.pos.name());
	String origPos = request.getParameter(Parameters.origPos.name());
	
	String sessionId = request.getSession().getId();
	
	
	Ff recommendations = null;
	de.factfinder.xml610.similarrecords.Ff similarRecords = null;
	Campaigns campaigns = null;
	if (propertiesHandler.getBooleanProperty(PropertiesNames.useRecommendations.name())){
		URL recommendationsRequestUrl = UrlHandler.getInstance().getRequestUrl(FACTFinderServices.Recommender.name(), request);
		InputStream inputStream = ConnectionHandler.getInstance().getInputStream(recommendationsRequestUrl, request);
		recommendations = RecommenderHandler.getInstance().getRecommendations(inputStream);
	}
	if (propertiesHandler.getBooleanProperty(PropertiesNames.useSimilarRecords.name())){
		URL similarRecordsRequestUrl = UrlHandler.getInstance().getRequestUrl(FACTFinderServices.SimilarRecords.name(), request);
		InputStream inputStream = ConnectionHandler.getInstance().getInputStream(similarRecordsRequestUrl, request);
		similarRecords = SimilarRecordsHandler.getInstance().getSimilarRecords(inputStream);
	}	
	if (propertiesHandler.getBooleanProperty(PropertiesNames.useProductCampaigns.name())){
		URL productCampaignsRequestUrl = UrlHandler.getInstance().getRequestUrl(FACTFinderServices.ProductCampaign.name(), request);
		InputStream inputStream = ConnectionHandler.getInstance().getInputStream(productCampaignsRequestUrl, request);
		campaigns = ProductCampaignsHandler.getInstance().getCampaigns(inputStream);
		if (campaigns != null){
			for (Campaign campaign : campaigns.getCampaign()){
				if (campaign.getTarget() != null && campaign.getTarget().getDestination() != null && !campaign.getTarget().getDestination().isEmpty()){
					response.sendRedirect(campaign.getTarget().getDestination());
				}
			}
		}
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8" />
<title>web shop</title>
<script type="text/javascript" src="jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="tracking.js"></script>
<style type="text/css">
a:link { text-decoration:none; font-weight:bold; color:#000000; }
a:visited { text-decoration:none; font-weight:bold; color:#000000; }
a:hover { text-decoration:none; font-weight:bold;color:#000000; background-color:#FFFFFF; }
a:active { text-decoration:none; font-weight:bold;color:#000000; background-color:#FFFFFF; }
a:focus { text-decoration:none; font-weight:bold;color:#000000; background-color:#FFFFFF; }
		* {font-size: 12px; font-family: Verdana;}
</style>
</head>
<body>
<script type="text/javascript">
		function resizePicture(img, maxWidth, maxHeight){
			$(img).show();
			var ratio = img.width / img.height;		
			if(img.height > maxHeight){
				img.height = maxHeight;
				img.width =  ratio * maxHeight;
			}
			if(img.width > maxWidth){ 
				img.width = maxWidth;
				img.height =  maxWidth / ratio;
			}
		}
		<% if (query != null) {%>
			$(document).ready( function() {
				tracking.click(
						'<%=UrlHandler.getInstance().getChannel()%>',
						'<%=sessionId%>',
						'<%=id %>',
						'<% if (masterIdField != null){out.print(mid);} %>',
						'<% if (query != null){out.print(query);} %>', 
						'<% if (pos != null){out.print(pos);} %>',
						'<% if (origPos != null){out.print(origPos);} %>',
						'<% if (currentPage != null){out.print(currentPage);} %>',
						'<% if (origPageSize != null){out.print(origPageSize);} %>'
				);
			});
		<%}%>
</script>
<div style="float:left">
	article details<br>
	ID: <%=id %><br/>
	Master-ID: <% if (masterIdField != null){out.print(mid);} %><br/>
	Product-Number: <%=productNo %><br/>
	Price: <%=p %>&euro;<br/>	
    <br/>
	<a onclick="javascript: tracking.cart(
		'<%=UrlHandler.getInstance().getChannel()%>',
		'<%=sessionId%>',
		'<%=id %>',
		'<% if (masterIdField != null){out.print(mid);} %>',
		'1',
		'<%=p%>'
         );false;">Track Cart</a>         
    <br/>
	<a onclick="javascript: tracking.checkout(
		'<%=UrlHandler.getInstance().getChannel()%>',
		'<%=sessionId%>',
		'<%=id %>',
		'<% if (masterIdField != null){out.print(mid);} %>',
		'1',
		'<%=p%>'
         );false;">Track Checkout</a> 
	<br/>
	<%if (recommendations != null && recommendations.getResults().getRecord().size() > 0){ %>
		<div style="float:left; width: 25%">
			<h3>recommendations</h3>
			<%
				for (Record record : recommendations.getResults().getRecord()){
					String number = "";
					String masterNumber = "";
					String productNumber = "";
					String name = "";
					String imageUrl = "";
					String price = "";
					for (final Field field : record.getField()){
						if (field.getName().equals(idField)){
							number = field.getContent();
						}
						if (field.getName().equals(masterIdField)){
							masterNumber = field.getContent();
						}
						if (field.getName().equals(productNumberField)){
							productNumber = field.getContent();
						}
						if (field.getName().equals(nameField)){
							name= field.getContent();
						}
						if (field.getName().equals(imageField)){
							imageUrl = field.getContent();
						}
						if (field.getName().equals(priceField)){
							price= field.getContent();
						}
					}

					String productUrl = UrlHandler.getDetailPageUrl(number, masterNumber, productNumber, price);
			%>
				<div style="clear: both; float: left">
					<a href="<%=productUrl%>"><%=name %> (Art-No.: <%=number %>) <%=price %>&euro;</a><br />
					<a href="<%=productUrl%>"><img onload="resizePicture(this, 200, 100);" title="<%=name%>" src="<%=imageUrl%>" /></a>
				</div>
			<% } %>
		</div>	
	<%}
	if (similarRecords != null && similarRecords.getSimilarRecords().getRecord().size() > 0){ %>
	<div style="float:left; width: 25%">
		<h3>similar records</h3>
		<% for (de.factfinder.xml610.similarrecords.Record record : similarRecords.getSimilarRecords().getRecord()){
			String number = "";
			String masterNumber = "";
			String productNumber = "";
			String name = "";
			String imageUrl = "";
			String price = "";
			for (final de.factfinder.xml610.similarrecords.Field field : record.getField()){
				if (field.getName().equals(idField)){
					number = field.getContent();
				}
				if (field.getName().equals(masterIdField)){
					masterNumber = field.getContent();
				}
				if (field.getName().equals(productNumberField)){
					productNumber = field.getContent();
				}
				if (field.getName().equals(nameField)){
					name= field.getContent();
				}
				if (field.getName().equals(imageField)){
					imageUrl = field.getContent();
				}
				if (field.getName().equals(priceField)){
					price= field.getContent();
				}
			}

			String productUrl = UrlHandler.getDetailPageUrl(number, masterNumber, productNumber, price);
			%>
			<div style="clear: both; float: left">
				<p> 
					<a href="<%=productUrl%>"><%=name %> (Art-No.: <%=number %>) <%=price %>&euro;</a><br />
					<a href="<%=productUrl%>"><img onload="resizePicture(this, 200, 100);" title="<%=name%>" src="<%=imageUrl%>" /></a>
				</p>
			</div>
		<% }%>
	</div>
	<%}%>	

	<% if (campaigns != null && campaigns.getCampaign().size() > 0){ %>
	<div style="float:left; width: 25%">
		<h3>campaigns</h3>
				<% for (Campaign campaign : campaigns.getCampaign()){ 
					if (campaign.getFlavour().equals("FEEDBACK")){
						if (campaign.getFeedback() != null){
							for (Text feedbackText : campaign.getFeedback().getText()){
								out.print(feedbackText.getValue() + "<br/>");	
							}
						}
						if (campaign.getPushedProducts() != null){ %>
						<% for (Product record : campaign.getPushedProducts().getProduct()){
								String number = "";
								String masterNumber = "";
								String productNumber = "";
								String name = "";
								String imageUrl = "";
								String price = "";
								for (final de.factfinder.xml610.search.Field field : record.getField()){
									if (field.getName().equals(idField)){
										number = field.getContent();
									}
									if (field.getName().equals(masterIdField)){
										masterNumber = field.getContent();
									}
									if (field.getName().equals(productNumberField)){
										productNumber = field.getContent();
									}
									if (field.getName().equals(nameField)){
										name= field.getContent();
									}
									if (field.getName().equals(imageField)){
										imageUrl = field.getContent();
									}
									if (field.getName().equals(priceField)){
										price= field.getContent();
									}
								}
								String productUrl = UrlHandler.getDetailPageUrl(number, masterNumber, productNumber, price);
								%>
								<div style="clear: both; float: left">
									<a href="<%=productUrl%>"><%=name %> (Art-No.: <%=number %>) <%=price %>&euro;</a><br />
									<a href="<%=productUrl%>"><img onload="resizePicture(this, 200, 100);" title="<%=name%>" src="<%=imageUrl%>" /></a>
								</div>
							<% }
							}
						}
					} %>
							
			</div>
		<% }  %>
</div>
</body>
</html>