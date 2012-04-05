package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
      out.write('\r');
      out.write('\n');

Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//con=DriverManager.getConnection("Jdbc:Odbc:sarthak","scott","tiger");
String name = request.getParameter("firstname");
String name1 = request.getParameter("password");
ps=con.prepareStatement("select * from login where username=? and password=?");
ps.setString(1,name);
ps.setString(2,name1);
rs=ps.executeQuery();
if (rs.next()) {

	session.setAttribute( "theName", name );


//rs=ps.executeQuery("select * from login");
//while(rs.next())
//{
//if(name.equals(rs.getString("username")) && name1.equals(rs.getString("password")))
//		{		

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("frames.html");
        return;
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

//		}

} else {
	out.println("Please enter correct username and password");

	out.println("<a href='studentlogin.jsp'><br>Login again</a>");

	out.println(name);
}
ps.close();
rs.close();
con.close();





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
