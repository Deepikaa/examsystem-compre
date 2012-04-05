<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import=" java.io.*"%>
<%@page import= "java.util.*"%>
<link rel="stylesheet" type="text/css" href="compre.css">
<%!
Connection con;
PreparedStatement ps;
ResultSet rs;
%>
<%
String name= (String) session.getAttribute("theRName");
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
ps=con.prepareStatement("select * from marks where username=?");
ps.setString(1,name);
rs=ps.executeQuery();
if (rs.next()) {
	
	
}
%>
<%
String marks[];
marks=new String[8];
int flag=0;
int sum=0;
for(int i=2;i<=8;i++)
{
	if(rs.getInt(i)==-1)
	{
		marks[i-1]="Not Evaluated";
		flag=1;
	}
	else
	{
	marks[i-1]=String.valueOf(rs.getInt(i));
	}
}

if (flag==0)
{
	
	for(int i=1;i<=7;i++)
	{
	  sum+=Integer.parseInt(marks[i]); 
	}
String	sql = "UPDATE marks set total=? where username='" + name+"'";
	ps = con.prepareStatement(sql);
	ps.setInt(1,sum);


	ps.executeUpdate();
	
}
%>



<html>
<%
out.println("You are "+name);
%>
<link rel="stylesheet" type="text/css" href="compre.css">
<table border=1>
<th>
<tr>
<td>
Question No
</td>
<td>

Marks
</td>
</th>
</tr>
<tr><td>1  </td><td><%out.println(marks[1]);%></td></tr>
<tr><td>2  </td><td><%out.println(marks[2]);%></td></tr>
<tr><td>3  </td><td><%out.println(marks[3]);%></td></tr>
<tr><td>4  </td><td><%out.println(marks[4]);%></td></tr>
<tr><td>5  </td><td><%out.println(marks[5]);%></td></tr>
<tr><td>6  </td><td><%out.println(marks[6]);%></td></tr>
<tr><td>7  </td><td><%out.println(marks[7]);%></td></tr>
<%
if(flag==0)
{
%>
<tr><td>total  </td><td><%out.println(sum);%></td></tr>
<%
}
else
{
	%>
	<tr><td>total  </td><td><%out.println("Not Evaluated");%></td></tr>
	<%
}

%>
</table>
<%out.println("lite!!"); %>

<form action="recheckrequestsave.jsp">
<textarea name="recheck" rows="5" cols="50" >
</textarea>
<input type="submit" value="recheck"/>
</form>

<%
System.out.println(name);
name= name.substring(0,3);

try {
	FileInputStream fis = new FileInputStream("c://"+name+".txt");
char current;
char prev;
	while (fis.available() > 0) 
	{ 
	  prev = (char) fis.read();
	  if(prev=='#')
	  {	
		
	  	current = (char) fis.read();
  		if(current=='#')
		  {	
			%>
			<br>
			<br>
					
			<%
			}
  		else
  		{
  			out.print(prev);
  			out.print(current);
  		}
	
  		
   	}
  	else
		  out.print(prev);
	}
	}
catch (IOException e)
{
	e.printStackTrace();
}

%>
</html>
