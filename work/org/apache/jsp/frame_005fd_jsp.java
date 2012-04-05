package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.io.*;
import java.util.*;

public final class frame_005fd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
try {
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

 //String question=request.getParameter("questionno");
String question=(String) session.getAttribute("QN");
if(question == null)
	question="1";
String name= (String) session.getAttribute( "theName" );

String filename = "c://answer"+ name + question + ".txt";
System.out.println(filename);
System.out.println(filename.length());

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"savefile.jsp\">\r\n");
      out.write("<input type=\"submit\" value=\"save\" />\r\n");
      out.write("<textarea name=\"paper\" rows=\"50\" cols=\"100\" >\r\n");
String p=request.getParameter("paper");

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

      out.write("\r\n");
      out.write("</textarea>\r\n");
      out.write("<input type=\"hidden\" name=\"address\" value=\"");
out.println(filename); 
      out.write("\">\r\n");
      out.write("</form>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
