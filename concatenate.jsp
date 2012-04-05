<%@page import= "java.io.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<link rel="stylesheet" type="text/css" href="compre.css">
concatenate!!!
<%
String name= (String) session.getAttribute( "theName" );

%>
<%!
Connection con;
PreparedStatement ps;
ResultSet rs;
%>
<%
try{

	//PrintWriter pw = new PrintWriter(new FileOutputStream("c:\\out1.txt"));
    BufferedWriter outa = new BufferedWriter(new FileWriter("c://" + name +".txt"));

for(int i=1;i<=7;i++)
{
	String filename="c:\\answer"+ name + i +".txt" ;
try {
	FileInputStream fis = new FileInputStream(filename);
	char current;
	outa.write("##"+i+" ");
	while (fis.available() > 0) {
	current = (char) fis.read();
	outa.write(current);
	//out.println(current);
	//pw.println(current);
    }
	outa.newLine();
	fis.close();
	}
catch (IOException e)
{
	e.printStackTrace();
}

}
outa.close();
}catch (Exception e){//Catch exception if any
    System.err.println("Error: " + e.getMessage());
  }

%>
<% 
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
%>
<%
String sql;
System.out.println(name);

sql = "INSERT INTO marks (username,m1,m2,m3,m4,m5,m6,m7,total) VALUES (?,?,?,?,?,?,?,?,?)";

// con is Connection object

ps = con.prepareStatement(sql);
ps.setString(1,name);
ps.setInt(2,-1);
ps.setInt(3,-1);
ps.setInt(4,-1);
ps.setInt(5,-1);
ps.setInt(6,-1);
ps.setInt(7,-1);
ps.setInt(8,-1);
ps.setInt(9,-1);
//ps.setInt(10,0);

ps.executeUpdate();
%>

<script type="text/javascript">
top.close();
</script>

<%
for(int i=1;i<=7;i++)	
{
File f=new File("c:\\answer"+ name + i +".txt");
f.delete();
}
%>
<%
session.invalidate();
response.setHeader("Cache-Control","no-cache"); 
response.setHeader("Cache-Control","no-store"); 
response.setDateHeader("Expires", 0); 
%>




