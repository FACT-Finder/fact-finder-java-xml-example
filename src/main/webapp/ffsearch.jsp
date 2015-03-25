<%@page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@page import="de.factfinder.properties.PropertiesNames"%>
<%@page import="de.factfinder.properties.PropertiesHandler"%>
<%@page import="de.factfinder.xml611.tagcloud.TagCloud"%>
<%@page import="de.factfinder.xml611.tagcloud.Entry"%>
<%@page import="de.factfinder.xml611.search.Product"%>
<%@page import="de.factfinder.xml611.search.PushedProducts"%>
<%@page import="de.factfinder.xml611.search.Text"%>
<%@page import="de.factfinder.xml611.search.Feedback"%>
<%@page import="de.factfinder.xml611.search.Answer"%>
<%@page import="de.factfinder.xml611.search.Question"%>
<%@page import="de.factfinder.xml611.search.Campaign"%>
<%@page import="de.factfinder.xml611.search.Field"%>
<%@page import="de.factfinder.xml611.search.Record"%>
<%@page import="de.factfinder.xml611.search.Ff.ProductsPerPageOptions.Option"%>
<%@page import="de.factfinder.xml611.search.Ff.ProductsPerPageOptions"%>
<%@page import="de.factfinder.xml611.search.Element"%>
<%@page import="de.factfinder.xml611.search.Group"%>
<%@page import="de.factfinder.xml611.search.BreadCrumbTrailItem"%>
<%@page import="de.factfinder.xml611.search.Sort"%>
<%@page import="de.factfinder.xml611.search.Ff"%>
<%@page import="de.factfinder.xml611.handler.SearchHandler"%>
<%@page import="de.factfinder.xml611.handler.TagCloudHandler"%>
<%@page import="de.factfinder.xml611.handler.FACTFinderServices"%>
<%@page import="de.factfinder.util.Parameters"%>
<%@page import="de.factfinder.util.UrlHandler"%>
<%@page import="de.factfinder.util.ConnectionHandler"%>
<%@page import="de.factfinder.util.Constants"%>
<%@page import="org.apache.commons.lang3.StringEscapeUtils"%>
<%@page import="java.math.BigInteger"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URL"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%> 
<!DOCTYPE html>
<%
	final PropertiesHandler propertiesHandler = PropertiesHandler.getHandler();
	String idField = propertiesHandler.getProperty(PropertiesNames.idField.name());
	String masterIdField = propertiesHandler.getProperty(PropertiesNames.masterIdField.name());
	String productNumberField = propertiesHandler.getProperty(PropertiesNames.productNumberField.name());
	String nameField = propertiesHandler.getProperty(PropertiesNames.nameField.name());
	String imageField = propertiesHandler.getProperty(PropertiesNames.imageField.name());
	String priceField = propertiesHandler.getProperty(PropertiesNames.priceField.name());

	String sessionId = request.getSession().getId();
	URL requestUrl = UrlHandler.getInstance().getRequestUrl(FACTFinderServices.Search.name(), request);
	InputStream searchInputStream = ConnectionHandler.getInstance().getInputStream(requestUrl, request);
	Ff result = SearchHandler.getInstance().getResult(searchInputStream);
	TagCloud tagCloud = null;
	
	String escapedQuery = request.getParameter(Parameters.query.name());
	escapedQuery = escapedQuery != null ? StringEscapeUtils.escapeEcmaScript(escapedQuery) : "*";
	
	List<Group> sliderGroups = new ArrayList<Group>();
	if (result != null){
		if (result.getCampaigns() != null){
			for (Campaign campaign : result.getCampaigns().getCampaign()){
				if (campaign.getTarget() != null && campaign.getTarget().getDestination() != null && !campaign.getTarget().getDestination().isEmpty()){
					response.sendRedirect(campaign.getTarget().getDestination());
				}
			}
		}
		if (result.getAsn() != null){
			for (Group group : result.getAsn().getGroup()){
				if (group.getStyle().equals("SLIDER")){
					sliderGroups.add(group);
				}
			}
		}
		if (propertiesHandler.getBooleanProperty(PropertiesNames.useTagCloud.name()) && result.getResults().getCount() == 0){
			URL tagCloudRequestUrl = UrlHandler.getInstance().getRequestUrl(FACTFinderServices.TagCloud.name(), request, true);
			InputStream tagCloudInputStream = ConnectionHandler.getInstance().getInputStream(tagCloudRequestUrl, request);
			tagCloud = TagCloudHandler.getInstance().getTagCloud(tagCloudInputStream);
		}
	}
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8" />
<title>web shop</title>
<link rel="stylesheet" type="text/css" href="suggest.css">
<script type="text/javascript" src="jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="http://static.express.fact-finder.com/onetouchslider-1.0/de.factfinder.asn.slider.OneTouchSlider.nocache.js"></script>
<script type="text/javascript" src="ffsuggest.block.jquery.json.js"></script>
<script type="text/javascript" src="tracking.js"></script>
<style type="text/css">
a:link { text-decoration:none; font-weight:bold; color:#000000; }
a:visited { text-decoration:none; font-weight:bold; color:#000000; }
a:hover { text-decoration:none; font-weight:bold;color:#000000; background-color:#FFFFFF; }
a:active { text-decoration:none; font-weight:bold;color:#000000; background-color:#FFFFFF; }
a:focus { text-decoration:none; font-weight:bold;color:#000000; background-color:#FFFFFF; }
		* {font-size: 12px; font-family: Verdana;}
</style>
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
		<% if (!sliderGroups.isEmpty()){%>
			function oneTouchSliderOnLoad() {
				<% for (int i=0; i<sliderGroups.size(); i++){
					Group group = sliderGroups.get(i);
					Element element = group.getElement().get(0);
					%>
					oneTouchSlider.addSlider({
					hostElementId:'<%=element.getField()%>',
					leftBorder:<%=element.getAbsoluteMin()%>,
					rightBorder:<%=element.getAbsoluteMax()%>,
					currentLeft:<%=element.getSelectedMin()%>,
					currentRight:<%=element.getSelectedMax()%>,
					stepSize:1,
					width:200,
					unit:'<%=(group.getUnit() != null) ? group.getUnit() : ""%>',
					callback:callback<%=i%>SliderSelect
					});
				<%}%>
			}
			<% for (int i=0; i<sliderGroups.size(); i++){
				Group group = sliderGroups.get(i);
				Element element = group.getElement().get(0);
				%>
				function callback<%=i%>SliderSelect(left, right) {
					var parameters = '<%=UrlHandler.getQueryString(element.getSearchParams()).substring(1)%>'.split("&");
					var filterParam = 'filter' + '<%=element.getField()%>';
					var queryString = "?";
					for (var i=0;i<parameters.length;i++) {
			            var param = parameters[i].split("=");
			            if (i > 0){
							queryString += "&";
			            }
			            var decodedParamName = decodeURIComponent(param[0]);
						if(decodedParamName== filterParam){
							queryString += param[0];
							queryString += "=";
							queryString += left;
							queryString += "+-+";
							queryString += right;
						}else {
							queryString += param[0];
							queryString += "=";
							queryString += param[1];
						}
					}  
					
					location.href = queryString;					
				}
			<%}%>
		<%}%>

</script>
</head>
<body>
<form action="" name="find" id="find" method="get">
	<div>
			<input type="text" id="query" name="query" value="" autocomplete="off" />
			<input type="submit" value="Suchen"/><br/>
			<% if (propertiesHandler.getBooleanProperty(PropertiesNames.useSuggest.name())){ %>
			<script type="text/javascript">
			<!--
					var suggest				= new FFSuggest();
					var searchURL			= 'proxy.jsp';
					var formname			= 'find';
					var queryParamName		= '<%=Parameters.query.name()%>';
					var channelParamName	= '<%=Parameters.channel.name()%>';
					var channel				= '<%=UrlHandler.getInstance().getChannel()%>';
					var divLayername		= 'suggestLayer';
					var instanceName		= 'suggest';
					var debugMode			= false;
					var showImages 			= true;
					suggest.init(searchURL, formname, queryParamName, divLayername, instanceName, debugMode, channelParamName, channel, showImages);
					document.onmousedown = suggest.hideLayerOutsideCall;
			// -->
			</script>
			<div style="position:absolute;">
				<div id="suggestLayer" class="suggestLayer"></div>
			</div>
			<%} %>
	</div>
	<div>
	<div style="float:left; width:250px">
		<% if (result != null){ %>
			<% if (result.getBreadCrumbTrail() != null){ %>
				<div>
					<p>bread crumb trail</p>
					<% for (BreadCrumbTrailItem item : result.getBreadCrumbTrail().getItem()) {
						out.print(item.getType()+"&nbsp;");
					%>
						<a href="<%=UrlHandler.getQueryString( item.getSearchParams())%>"><%=StringEscapeUtils.escapeHtml4(item.getValue())%></a>
						<br/>
					<% } %>
				</div> 
			<%}
			 if (result.getAsn() != null){ %>
				<div>
					<p>groups</p>
					<% for (Group group : result.getAsn().getGroup()) {			
						out.print("<div><h4>" + group.getName() ); 
						if(group.getUnit() != null && !group.getUnit().isEmpty()){
							out.print("&nbsp;("+group.getUnit()+")");
					    }
						out.print("</h4>");
						for (int i=0; i<group.getElement().size(); i++) {
							  Element element = group.getElement().get(i);					  
							  if (i < group.getDetailedLinks()){
								if (group.getStyle().equals("TREE") || group.getStyle().equals("DEFAULT")){
									if (group.getStyle().equals("TREE")){
										for (int l=0; l<=element.getClusterLevel(); l++){ 
											if (element.isSelected() && l>0){
												out.print("&nbsp;");
											}else if (!element.isSelected()){
												out.print("&rsaquo;");							
											}
										}							
									}
									out.print("<a href=\"" + UrlHandler.getQueryString( element.getSearchParams())+ "\">");
									if(element.isSelected()){
										out.print("x "); 
									}
									out.print(element.getName());
									if(element.getCount()>0){
										out.print("&nbsp;("+element.getCount()+")");
									}
									out.print("</a>");
								}else if(group.getStyle().equals("MULTISELECT")){
									String id = group.getName() + "_" + element.getName(); 
									out.print("<input id=\"" + id + "\" onchange=\"javascript:location.href=this.value;\" value=\"" + UrlHandler.getQueryString( element.getSearchParams())+ "\"");
									if(element.isSelected()){
										out.print(" checked=\"checked\""); 
									}
									if (group.getSelectionType() != null && "singleShowUnselected".equals(group.getSelectionType())){
										out.print(" type=\"radio\" />");	
									}else{
										out.print(" type=\"checkbox\" />");
									}
									out.print("<label for=\"" + id + "\">");
									if(element.getCount()>0){
										out.print(element.getName() + "&nbsp;("+element.getCount()+")");
									}else{
										out.print(element.getName());
									}
								 	out.print("</label>");
								}else if (group.getStyle().equals("SLIDER")){
									out.print("<div style=\"width: 200px;padding:0px\" id=\"" + group.getElement().get(0).getField() + "\"></div>");
								}
								out.print("<br>");
						      } else{
									if (i == group.getDetailedLinks()){
										out.print("<select style=\"width:250px\" onchange=\"javascript:location.href=this.value;\">");
									}
									out.print("<option value=\"" + UrlHandler.getQueryString(element.getSearchParams())+ "\"");
									if (element.isSelected()){
										out.print(" selected=\"selected\">");
									}else{
										out.print(">");
									}
									out.print(element.getName() + "</option>");
									
									if (i == group.getElement().size()-1){
										out.print("</select>");
									}							
								}
					 	}
						out.print("</div");
					}%>
				</div>
			<% }
			if (result.getSorting() != null){ %>
				<div>
					<p>sorting</p>
					<select style="width:250px" onchange="javascript:location.href=this.value;">
						<% for (final Sort sort: result.getSorting().getSort()){ %>
							<option <% if (sort.isSelected()) {%> selected="selected" <% } %> value="<%=UrlHandler.getQueryString(sort.getSearchParams())%>">
								<%=sort.getDescription()%>
							</option>
						<% } %>
					</select>
				</div>
			<% } 
			if (result.getProductsPerPageOptions() != null && result.getResults() != null && result.getResults().getCount() > 0){ %>
				<div>
					<p>page size<p>
					<select style="width:250px" onchange="javascript:location.href=this.value;">
						<% for (final Option option: result.getProductsPerPageOptions().getOption()){ %>
							<option <% if (result.getSearchParams().getProductsPerPage() != null && option.getValue().intValue() == result.getSearchParams().getProductsPerPage()) {%> selected="selected" <% } %> value="<%=UrlHandler.getQueryString(option.getSearchParams())%>">
								<%=option.getValue()%>
							</option>
						<% } %>
					</select>
				</div>
			<%}%>
		</div>
	</div>
	<div style="float:left; padding:10px; width: 50%">
		<div>
			<div style="float: left">
				<% if (result != null){ %>
					<strong>We found '<%=result.getResults().getCount() %>' product for "<%=StringEscapeUtils.escapeHtml4(result.getSearchParams().getSearchPhrase())%>".</strong>
				<% } %>
			</div>
			<%if (result.getPaging() != null && result.getResults().getCount() > 0){ %>
				 <div style="clear:both;float:right;">	
				 	Page&nbsp;
				 	<% for (int i=1; i<=result.getPaging().getPageCount(); i++){
				 		if (i < (result.getPaging().getCurrentPage() - result.getPaging().getSettings().getLinkCount()/2)){
				 			continue;			 			
				 		}
				 		if (i > (result.getPaging().getCurrentPage() + result.getPaging().getSettings().getLinkCount()/2)){
				 			break;
				 		}
				 		if (result.getPaging().getCurrentPage() == i){
				 			out.print("<strong>&nbsp;" + i + "&nbsp;</strong>");
				 		}else{
							out.print("<a href=\"" + UrlHandler.getQueryString( result.getPaging().getSearchParams()) + i + "\">&nbsp;" + i + "&nbsp;</a>");
				 		}
					   } %>
				 </div>
				<% }%>
			</div>
			<% if (result.getResults() != null && result.getResults().getCount() > 0){ %>
				<div style="clear:both; float:left; width: 50%">
					<% 
					String query = result.getSearchParams().getSearchPhrase();
					int currentPage = result.getPaging().getCurrentPage();
					int origPageSize = result.getProductsPerPageOptions().getDefault().intValue();
						for (Record record : result.getResults().getRecord()){
						
						int pos = result.getProductsPerPageOptions().getSelected().intValue() * (currentPage-1) + record.getNr() + 1;
						String origPosField = "";
						String number = "";
						String masterNumber = "";
						String productNumber = "";
						String name = "";
						String description = "";
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
							if (field.getName().equals(Constants.ORIG_POS_FIELD)){
								origPosField= field.getContent();
							}
						}
						int origPos = -1;
						if (!origPosField.isEmpty()){
							origPos = Integer.parseInt(origPosField);
						}
						String productUrl = null;
						if (origPos > -1){
							productUrl = UrlHandler.getDetailPageUrl(number, masterNumber, productNumber, price, query, pos, origPos, currentPage, origPageSize);
						}else{
							productUrl = UrlHandler.getDetailPageUrl(number, masterNumber, productNumber, price);
						}
						%>
						    
						<div>
							<p> 
								<a href="<%=productUrl%>"><%=name %> (Art-No.: <%=number %>) <%=price %>&euro;</a><br />
								<br/>
								<a onclick="javascript: tracking.directCart(
								'<%=UrlHandler.getInstance().getChannel()%>',
								'<%=sessionId%>',
								'<%=number%>',
								'<% if (!masterNumber.isEmpty()){out.print(masterNumber);} %>',						
								'<%=escapedQuery%>', 
								'<%=pos%>',
								'<%=origPos%>',
								'<%=currentPage%>',
								'<%=origPageSize%>',
								'1',
								'<%=price%>'
								       );false;">Track Direct-To-Cart</a>    						
								<a href="<%=productUrl%>"><img onload="resizePicture(this, 200, 100);" title="<%=name%>" src="<%=imageUrl%>" /></a> 
							</p>
						</div>
					<% } %>
				</div>
				<%if (result.getPaging() != null && result.getResults().getCount() > 0){ %>
				 <div style="clear:both;float:right;">	
				 	Page&nbsp;
				 	<% for (int i=1; i<=result.getPaging().getPageCount(); i++){
				 		if (i < (result.getPaging().getCurrentPage() - result.getPaging().getSettings().getLinkCount()/2)){
				 			continue;			 			
				 		}
				 		if (i > (result.getPaging().getCurrentPage() + result.getPaging().getSettings().getLinkCount()/2)){
				 			break;
				 		}
				 		if (result.getPaging().getCurrentPage() == i){
				 			out.print("<strong>&nbsp;" + i + "&nbsp;</strong>");
				 		}else{
							out.print("<a href=\"" + UrlHandler.getQueryString(result.getPaging().getSearchParams()) + i + "\">&nbsp;" + i + "&nbsp;</a>");
				 		}
					   } %>
				 </div>
				<% }
			} %> 
			</div>
			<div style="float:left; width: 25%">
				<% if (result.getCampaigns() != null && result.getCampaigns().getCampaign().size() > 0){ %>
					<div>
						<p>campaigns</p>
						<% for (Campaign campaign : result.getCampaigns().getCampaign()){ 
							if (campaign.getFlavour().equals("ADVISOR") && campaign.getAdvisor().getActiveQuestions() != null){
								for (Question question : campaign.getAdvisor().getActiveQuestions().getQuestion()){
									out.print("<h5>" + question.getText() + "</h5>");
									out.print("<ul>");
									for (final Answer answer : question.getAnswer()){
										out.print("<li><a href=\"" + UrlHandler.getQueryString(answer.getParams()) + "\">");
										out.print(answer.getText());
										out.print("</a></li>");
									}
									out.print("</ul>");
								}					
							} else if (campaign.getFlavour().equals("FEEDBACK")){
								if (campaign.getFeedback() != null){
									for (Text feedbackText : campaign.getFeedback().getText()){
										out.print(feedbackText.getValue() + "<br/>");
									}
								}
								if (campaign.getPushedProducts() != null){ %>
								<div style="width: 50%">
									<% for (Product record : campaign.getPushedProducts().getProduct()){
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
										<div>
											<p> 
												<a href="<%=productUrl%>"><%=name %> (Art-No.: <%=number %>) <%=price %>&euro;</a><br />
												<a href="<%=productUrl%>"><img onload="resizePicture(this, 200, 100);" title="<%=name%>" src="<%=imageUrl%>" /></a>
											</p>
										</div>
									<% } %>
								</div>
							<% } 
							}
							%>
						<% } %>
					</div>
				<% } 
				if (tagCloud != null && tagCloud.getEntry() != null && tagCloud.getEntry().size() > 0){ %>
				<div>
					<p>tag cloud</p>
					<%
					int minFontSize = 10;
					int maxFontSize = 20;
					for (Entry tagCloudEntry: tagCloud.getEntry()){
		                int searchCount = tagCloudEntry.getSearchCount();
		                int fontSize = (int) ((int) minFontSize + Math.round((maxFontSize - minFontSize) * tagCloudEntry.getWeight()));
		                out.print("<a href=\"" + UrlHandler.getQueryString(tagCloudEntry.getContent(), true) + "\"");
		                out.print(" style=\"font-size: " + fontSize + "px;margin:3px\">");
		                out.print(tagCloudEntry.getContent());
		                out.print("</a>");
		            } 				
					%>
				</div>
				<% } %>
		<% } %>
	</div>
</form>
</body>
</html>