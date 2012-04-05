<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.lang.Integer" %>
<%!
Connection con;
PreparedStatement ps;
ResultSet rs;
%>

<link rel="stylesheet" type="text/css" href="compre.css">
<% 
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
%>
<%
String sql,name= (String) session.getAttribute("theSName");
System.out.println(name+"sdf");
int marks[];
marks=new int[8];
for(int i=1;i<=7;i=i+1)
{
%>
<br>
<% 
marks[i]=Integer.parseInt(request.getParameter("marks"+i));}

sql = "UPDATE marks set m1=?,m2=?,m3=?,m4=?,m5=?,m6=?,m7=?,total=? where username='" + name+"'";

// con is Connection object

ps = con.prepareStatement(sql);
ps.setInt(1,marks[1]);
ps.setInt(2,marks[2]);
ps.setInt(3,marks[3]);
ps.setInt(4,marks[4]);
ps.setInt(5,marks[5]);
ps.setInt(6,marks[6]);
ps.setInt(7,marks[7]);
ps.setInt(8,0);


ps.executeUpdate();
%>
<%
String sql1 = "Delete from recheck where username ='"+ name+"'";
ps = con.prepareStatement(sql1);
ps.executeQuery();
%>
<script type="text/javascript">
window.top.location.href="evaluation.jsp"; 
</script>


