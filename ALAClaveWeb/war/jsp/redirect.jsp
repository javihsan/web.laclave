<% 
String viewParam = (String)request.getAttribute("viewParam");
if (viewParam==null) viewParam = "main";
%>
<script>
	document.location.href='/<%=viewParam%>.do';
</script>