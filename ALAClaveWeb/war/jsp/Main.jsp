<%@include file="cabecera.jsp"%>

<script type="text/javascript" language="javascript"
	src="alaclaveweb/alaclaveweb.nocache.js"></script>

<div class="portal-decorator-left-lateral"></div>

<div id="content-detail">


<table cellspacing="0" cellpadding="0" width="98%" height="100%" border="0">
    <tr>
		<td colspan="2" align="right" class="contentOptions"></td>
	</tr>
	<tr height="100px">
		<td width="50px" align="right">
			&nbsp;
		</td>
		<td>

			<table cellspacing="0" cellpadding="8" width="100%" border="0">
			<tr>
				<td colspan="2" align="center">
					<div id="portada_menos_destacado">
					<p>LA ACADEMIA ESPECIALIZADA EN LA ENSEÑANZA DE <a href="metodo.do" title="Método piano">PIANO</a> Y DE <a href="metodo2.do" title="Método canto">CANTO</a></p>
					<p>La de <a href="metodo.do" title="Método piano">PIANO</a>, en forma clásica y profesional para ingreso en CONSERVATORIOS, o cultura
						musical de alto nivel y en segundo lugar PARA OCIO Y ENTRETENIMIENTO, de forma práctica y
						objetiva, para aquellos que no dispongan de tiempo o por edad.</p>
						<p>TODAS LAS CLASES SON INDIVIDUALES. UN PROFESOR POR CADA ALUMNO.INTENSAS Y MUY
						PROGRESIVAS.</p>
						<p>POSIBLES SOLUCIONES A LOS QUE NO DISPONGAN DE PIANO</p> 
						<p>La música, el canto, te ayudan a tener alegría y a sentirte mejor.<br> ¡¡ NO LO DUDES !!</p>
 			 		</div>
 			 	</td>
			</tr>	
			</table>
		</td>
		<td align="center">
			
			<p id="parrafoSocial"><strong>Síguenos en:</strong></p> 
 			<p id="parrafoSocial"><a href="http://www.facebook.com/pages/Academia-La-Clave/285992308983?sk=wall" target="_blank">
 				<img src="icons/social/icon-faceook.gif" border="0" height="25px"
						alt="Síguenos en Facebbok" /></a>&nbsp;
			<a href="http://twitter.com/laclavelegaza" target="_blank"><img
						src="icons/social/icon-twitter.gif" border="0" height="25px"
						alt="Síguenos en Twitter" /></a>&nbsp;			
 			<a href="http://ellocomusicaldelacolina.blogspot.com" target="_blank"><img
						src="icons/social/icon-blogger.gif" border="0" height="25px"
						alt="Síguenos en Blogger" /></a></p>

			<p id="parrafoSocial"><strong>Compartir en:</strong>
	 			&nbsp;&nbsp;&nbsp;
	 			<!-- AddThis Button BEGIN -->
				<div class="addthis_toolbox addthis_default_style">
					<a class="addthis_button_preferred_1"></a>
					<a class="addthis_button_preferred_2"></a>
					<a class="addthis_button_preferred_3"></a>
					<a class="addthis_button_preferred_4"></a>
					<a class="addthis_button_compact"></a>
					<a class="addthis_counter addthis_bubble_style"></a>
				</div>
     		
     			<script>var addthis_language = "es";</script>
				<script type="text/javascript" src="http://s7.addthis.com/js/250/addthis_widget.js#pubid=xa-4dccde4820e195aa"></script>
			</p>			
		</td>
	</tr>
	<tr height="20px">
		<td colspan="3"></td>
	</tr>
	<tr height="100%">
		<td colspan="2" valign="top">
			<div align="center"><img src="images/portada_nueva_20090930.jpg"
				border="0" alt="Portada La Clave" width="630" height="670"/></div>
		</td>
		<td align="right" valign="top" width="180px">
			<img src="images/ninos1.jpg" border="0" width="170px" alt="Niños 1" />
			<img src="images/ninos2.jpg" border="0" width="170px" alt="Niños 2" />
			<img src="images/ninos3.jpg" border="0" width="170px" alt="Niños 3" />
			<img src="images/ninos4.jpg" border="0" width="170px" alt="Niños 4" />
			<img src="images/ninos5.jpg" border="0" width="170px" alt="Niños 5" />
		</td>
	</tr>
</table>

<%@include file="pieMain.jsp"%>

<style type="text/css">
	body {background:url(../images/bg1.gif) repeat-y top center #eaeaea; color:#3a3a3a; margin:0 auto; padding:0; font:76% Verdana,Tahoma,Arial,sans-serif;	font-size: 11px;font-style: normal;font-variant: inherit;text-decoration: none;text-transform: none;width:auto;}
</style>

<script>
var llevoParpadeado=0;
var capa1=document.getElementById("parpadeo1");
var capa2=document.getElementById("parpadeo2");
var color1 = capa1.style.color
var color2 = capa2.style.color
function parpadea(veces, t, paron) {        //1 vez al segundo
    //alert("parpadea ha sido llamado");
    if(llevoParpadeado<veces) {
    	capa1.style.color="white";
    	capa2.style.color="white";
        //alert("ejecuto un parpadeo, dentro de t en negro y dentro de 2t ejecutare un parpadea");
        setTimeout("capa1.style.color=color1", t);
        setTimeout("capa2.style.color=color2", t);
        setTimeout("parpadea("+veces+", "+t+", "+paron+")", t*2);
        llevoParpadeado++;
        //alert("cambio llevoParpadeando, ahora es "+llevoParpadeado);
    }
    else {
        //alert("hemos hecho todos los parpadeos, dentro de paron ("+paron+") ejecutare otra vez parpadea");
        llevoParpadeado=0;
        setTimeout("parpadea("+veces+", "+t+", "+paron+")", paron);
    }
}

parpadea(22, 500, 10000);

</script>

