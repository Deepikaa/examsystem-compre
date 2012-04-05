<html>
<head>
<title>This page passes parameters</title>
</head>
<body>
<!-- header from include-->
<jsp:include page="variable.jsp">
  <jsp:param name="department" value="Electrical"/>
</jsp:include>
Above text is from includeFileNeedingAParameter.jsp.
</body>
</html>