<%@page import= "java.io.*"%>
<%@page import= "java.util.*"%>
<%
String qno = request.getParameter("questionno");
session.setAttribute("QN",qno);
%>
<jsp:forward page="frame_d.jsp" />