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
		<a href="main.do"><img src="images/nueva/izquierdaCab.jpg"   alt="Cabecera La Clave" width="419px" height="82px" /></a>
		<img src="images/2015/MariaPolo.jpg"      alt="Cabecera La Clave" width="130px"  height="82px" />
		<img src="images/2015/ValeriaGaube.jpg"	alt="Cabecera La Clave" width="130px"  height="82px" />
		<img src="images/2015/Carolina.jpg" 	    alt="Cabecera La Clave" width="130px"  height="82px" />
		<img src="images/nueva/TodosEscena2.bmp" 	alt="Cabecera La Clave" width="135px"  height="82px" />
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
<button id="playMusic" onclick="playVid()" type="button">Música</button>
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
		<span class="icon"> <a href="mapa.do"><img
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

<script language="JavaScript" type="text/javascript">
<!--

var mp3snd = "media/WebMisteriosa.mp3";

document.write('<audio id="musicBG">');
document.write('<source src="'+mp3snd+'" type="audio/mpeg">');
document.write('<!--[if lt IE 9]>');
document.write('<bgsound src="'+mp3snd+'" loop="1">');
document.write('<![endif]-->');
document.write('</audio>');

var vid = document.getElementById("musicBG"); 
var playMusic = document.getElementById("playMusic");
if (sessionStorage.getItem("playing")==null) {
	sessionStorage.setItem("playing", "true");
}
if (sessionStorage.getItem("playing")=="true") {
	vid.play();
	playMusic.innerHTML='Parar música';
} else {
	vid.pause();
	playMusic.innerHTML='Escuchar música';
}
function playVid() { 
	if (sessionStorage.getItem("playing")=="false") {
		vid.play();
		sessionStorage.setItem("playing", "true");
		playMusic.innerHTML='Parar música';
	} else {
		vid.pause();
		sessionStorage.setItem("playing", "false");
		playMusic.innerHTML='Escuchar música';
	}	
} 

//-->
</script>