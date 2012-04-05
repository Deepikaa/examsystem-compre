<%@page import= "java.io.*"%>
<%@page import= "java.util.*"%>
<% 
String filename=request.getParameter("address");
System.out.println(filename);
out.println(request.getParameter("paper"));
filename = filename.substring(0,18);
String str = request.getParameter("paper");
//always give the path from root. This way it almost always works.
try {   
    PrintWriter pw = new PrintWriter(new FileOutputStream(filename));
    pw.println(str);
    //clean up
    pw.close();
} catch(IOException e) {
   out.println(e.getMessage());
}

%>
<jsp:forward page="frame_d.jsp" />
