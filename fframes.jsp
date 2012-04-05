
<html>
<head>
<script language="javascript">
      window.history.forward(1);
</script>
</head>
<%
String name=request.getParameter("name");
session.setAttribute( "theSName", name ); %>

<frameset cols="20%,80%">
   <frame src="fframe_a.jsp" name="fframe_a">
   <frame src="fframe_b.jsp" name="fframe_b"> 
</frameset>
</html>