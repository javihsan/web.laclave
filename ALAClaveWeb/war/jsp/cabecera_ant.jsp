<%@page import="com.alaclave.negocio.Utils"%>
<% 
String main = (String)request.getAttribute("main");
String bodyClass = "portal-body";
if (main!=null) bodyClass = "HOME";
String trace = (String)request.getAttribute("trace");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<HEAD>

<meta http-equiv="content-type" content="text/html;charset=ISO-8859-1">
<meta name="Robots" content="ALL">
<meta name="Author" content="Academia de Música La Clave" lang="es_ES">
<meta name="Copyright" content="&copy; 2011,Academia de Música La Clave" lang="es_ES">
<meta name="Description" contents="Academia La Clave, aprenda piano, violín y canto de forma personalizada con nuestro exclusivo metodo. Venta y distribución de pianos" lang="es_ES" />
<meta name="Title" contents="Academia La Clave" lang="es_ES" />
<meta name="Keywords" contents="piano violín canto collado villalba academia escuela madrid sierra tienda distribución venta pianos violines" />
<meta name="google-site-verification" content="86WXbZ6TLqtx_rcOtorY8RGIXVFVixCfxeGU3Cumi_0" />

<link id="portal_css" rel="Stylesheet" type="text/css" href="css/marino.css" media="screen">
<link id="portal_css_print" rel="Stylesheet" type="text/css" href="css/marino_print.css" media="print">

<title>Academia de Música La Clave</title>

</HEAD>

<BODY class="<%=bodyClass%>">

<div id="wrap">
<div id="logo_clickable" onfocus="document.location.href =('Main');"></div>
<div id="header">





<div class="headerContent">


<div id="content-detail">


<table cellspacing="0" cellpadding="0" width="98%" height="100%" border="0">
	<tr>
		<td class="contentOptions"></td>
	</tr>
	<tr height="100%">
		<td align="left" valign="top"><!-- <h1 class="cabecera">Cabecera</h1> -->
			<a href="main.do">
			<img src="images/cabecera.jpg" 	border="0" alt="Cabecera La Clave" width="959" height="80" /></a>
		</td>
	</tr>
</table>
</div>

</div>


<script type="text/JavaScript">
	function validar() {
		var cadena = document.getElementById('querySearch');
		if (cadena.value.length > 0)
			return true;
		else {
			alert("Por favor, escriba el texto a buscar");
			cadena.focus();
			return false;
		}

	}
</script> 
<div id="GlobalSearcher">
<form style="margin: 0px; padding: 0px;" name="GlobalSearchForm"
	method="post" onsubmit="return validar()" action="busqueda.do">
<span class="searchLabel"><label for="querySearch">Búsqueda</label></span> 
<span><input id="querySearch" class="searchInput" name="querySearch" type="text"
	value="&nbsp;" size="10" onfocus="this.value=''" /></span> 
<span><input style="border: 0px;" class="searchIcon" type="image"
	onfocus="return validar();"
	src="images/lupa.jpg"
	alt="Búsqueda" />
</span>
</form>
</div> 






<div id="LangSelector"></div>
<div id="portal-toolbar"></div>
<div class="portal-locator">
<div class="portal-locator-first-item"><a href="main.do">La Clave</a></div>

<% 
if (main==null){
	
%>
<div class="portal-locator-separator"></div>
<div class="portal-locator-last-item">
	<b><%=trace%></b>
</div>

<% 
}
%>
</div>


	<div id="Webmap">
		<dfn title="Mapa del web. Acceda desde aquí­ a todos los puntos del portal.">
			<span class="label"> <a href="mapa.do">Mapa web</a></span>
		</dfn> 
		<span class="icon"> <a href="srv.html"><img
			src="/images/webmap.gif"
			alt='Mapa del web. Acceda desde aquí a todos los puntos del portal.'
			border="0" /></a> 
		</span>
	</div>
	
	<div id="datetime"><%=Utils.getFechaActual()%></div>
</div>
<%@include file="cabeceraMenu.jsp"%>


<div class="portal-decorator-portlet-container">
<div class="portal-decorator-header">
<div class="portal-decorator-title"><%=trace%></div>
</div>