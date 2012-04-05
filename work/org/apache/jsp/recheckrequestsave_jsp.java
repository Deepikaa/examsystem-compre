package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;

public final class recheckrequestsave_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


Connection con;
PreparedStatement ps;
ResultSet rs;

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
      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.alert(\"recheck request has been submitted\");\r\n");
      out.write("window.close();\r\n");
      out.write("</script>");
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
