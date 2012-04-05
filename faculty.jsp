

<script language="javascript">
      window.history.forward(1);
</script>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<link rel="stylesheet" type="text/css" href="compre.css">
<%!
Connection con;
PreparedStatement ps;
ResultSet rs;
%>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//con=DriverManager.getConnection("Jdbc:Odbc:sarthak","scott","tiger");
String name = request.getParameter("firstname");
String name1 = request.getParameter("password");
ps=con.prepareStatement("select * from facultylogin where username=? and password=?");
ps.setString(1,name);
ps.setString(2,name1);
rs=ps.executeQuery();
if (rs.next()) {
out.println("correct name");

//rs=ps.executeQuery("select * from login");
//while(rs.next())
//{
//if(name.equals(rs.getString("username")) && name1.equals(rs.getString("password")))
//		{		
%>
<jsp:forward page="evaluation.jsp" />
<%
//		}

}
ps.close();
rs.close();
con.close();

out.println("Please enter correct username and password");

out.println("<a href='facultylogin.html'><br>Login again</a>");



%>