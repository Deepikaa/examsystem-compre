
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<link rel="stylesheet" type="text/css" href="compre.css">
<%@page import=" java.io.*"%>

<%@page import= "java.util.*"%>

<%
String name= (String) session.getAttribute("theSName");
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