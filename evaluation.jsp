<%@ page import="java.sql.*" %>
<html>
<body>
<%!
Connection con;
%>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");

Statement statement = con.createStatement() ;
ResultSet resultset = 
    statement.executeQuery("select * from marks") ;
%>
<TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                
            </TR>
            <% while(resultset.next()){
            	
            %>
            <TR>
                <TD><a href="fframes.jsp?name=<%= resultset.getString(1) %>"><%= resultset.getString(1) %></a></td>
                
            </TR>
            
            <% } %>
        </TABLE>
<h3>Recheck Requests</h3>
<%
resultset = statement.executeQuery("select * from recheck") ;
%>
<TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                
            </TR>
            <% while(resultset.next()){
            %>
            <TR>
                <TD><a href="fframes.jsp?name=<%= resultset.getString(1) %>"><%= resultset.getString(1)%>
                </a></td>
                
            </TR>
            
            <% } %>
        </TABLE>
        </body>
</html>