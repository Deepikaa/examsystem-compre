
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<link rel="stylesheet" type="text/css" href="compre.css">
<%@page import=" java.io.*"%>
<%@page import= "java.util.*"%>
<html>
<%try {
FileInputStream fis = new FileInputStream("C://test.txt");
char current;
char questionno = '0'; String question=(String) session.getAttribute("QN");
if(question == null)
question="1";
questionno= question.charAt(0);
while (fis.available() > 0) {
  current = (char) fis.read();
  if(current=='#')
  {	
   current = (char) fis.read();
  if(current=='#')
  {	
	  current = (char) fis.read();	
	  if(current== questionno){
		  
	 while(current!='#')
		  
	 {
		 out.print(current);
	  current = (char) fis.read();
	 }
	  } 
  }}}
  }
catch (IOException e)
{
	e.printStackTrace();
}
%><% //String question=request.getParameter("questionno");
String question=(String) session.getAttribute("QN");
if(question == null)
	question="1";
String name= (String) session.getAttribute( "theName" );

String filename = "c://answer"+ name + question + ".txt";
System.out.println(filename);
System.out.println(filename.length());
%>

<form action="savefile.jsp">
<input type="submit" value="save" />
<textarea name="paper" rows="50" cols="100" >
<%String p=request.getParameter("paper");

session.setAttribute("Paper",p);
char c;
try {
	
	FileInputStream fis = new FileInputStream(filename);
	char current;
	current = (char) fis.read();
	while (fis.available()>0) {
		out.print(current);
		current = (char) fis.read();
		
	}
	

	
}
catch (IOException e)
{
	e.printStackTrace();
}
%>
</textarea>
<input type="hidden" name="address" value="<%out.println(filename); %>">
</form>
</html>