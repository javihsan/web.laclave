<% 
String querySearch = (String)request.getAttribute("querySearch");
if (querySearch==null) querySearch = "";
%>

<%@include file="cabecera.jsp"%>

<script type="text/javascript" language="javascript"
	src="websearch/websearch.nocache.js"></script>

<div id="hiddenQuerySearch" value="<%=querySearch%>" align="center">
<table align="center" cellspacing="0" cellpadding="0" width="98%" height="100%" border="0">
	<tr>
	   <td width="50px">&nbsp;</td>
	   <td align="left" id="searchClave"></td>
	</tr>
</table>
</div>

<%@include file="pie.jsp"%>

<style type="text/css">
	body {background:url(../images/bg1.gif) repeat-y top center #eaeaea; color:#3a3a3a; margin:0 auto; padding:0; font:76% Verdana,Tahoma,Arial,sans-serif;	font-size: 11px;font-style: normal;font-variant: inherit;text-decoration: none;text-transform: none;width:auto;}
</style>