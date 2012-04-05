
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%!
Connection con;
PreparedStatement ps;
ResultSet rs;
%>
<%
String name= (String) session.getAttribute("theSName");
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
ps=con.prepareStatement("select * from marks where username=?");
ps.setString(1,name);
rs=ps.executeQuery();
if (rs.next()) {
	
	
}
%>


<html>
<link rel="stylesheet" type="text/css" href="compre.css">
<form action="summation.jsp">
1<input type="text" name="marks1" size=1 value="<%out.println(rs.getInt(2));%>"/><hr>
2<input type="text" name="marks2" size=1 value="<%out.println(rs.getInt(3));%>"/><hr>
3<input type="text" name="marks3" size=1 value="<%out.println(rs.getInt(4));%>"/><hr>
4<input type="text" name="marks4" size=1 value="<%out.println(rs.getInt(5));%>"/><hr>
5<input type="text" name="marks5" size=1 value="<%out.println(rs.getInt(6));%>"/><hr>
6<input type="text" name="marks6" size=1 value="<%out.println(rs.getInt(7));%>"/><hr>
7<input type="text" name="marks7" size=1 value="<%out.println(rs.getInt(8));%>"/><hr>
<input type="submit" value="FINISH EVALUTION" name="button"></form>
</html>