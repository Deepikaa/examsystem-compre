<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.*"%>
<%!
Connection con;
PreparedStatement ps;
ResultSet rs;
%>

<%
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
String recheck= request.getParameter("recheck");
String studentname= (String)session.getAttribute("theRName");
String sql="insert into recheck( username) values (?)";
ps = con.prepareStatement(sql);
ps.setString(1,studentname);
ps.executeUpdate();
long position=0;
RandomAccessFile file = null;
try {
  file = new RandomAccessFile ("c://"+studentname + ".txt", "rw");
}
catch (FileNotFoundException ffe) {
  System.out.println("File not found. Will create it.");
}

try {

  // Append if position beyond the end of the file.
   
    position = file.length ();
  

  // Move to the desired position and write the number.
   file.seek (position);
file.writeChars("RECHECK : ");
   file.writeChars(recheck);
}
catch (IOException ioe) {
  System.out.println ("IO Exception = " + ioe);
}
%>
<script type="text/javascript">
window.alert("recheck request has been submitted");
window.close();
</script>