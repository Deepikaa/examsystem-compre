package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class fframe_005fa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');

String name= (String) session.getAttribute("theSName");
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
ps=con.prepareStatement("select * from marks where username=?");
ps.setString(1,name);
rs=ps.executeQuery();
if (rs.next()) {
	
	
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
      out.write("<form action=\"summation.jsp\">\r\n");
      out.write("1<input type=\"text\" name=\"marks1\" size=1 value=\"");
out.println(rs.getInt(2));
      out.write("\"/><hr>\r\n");
      out.write("2<input type=\"text\" name=\"marks2\" size=1 value=\"");
out.println(rs.getInt(3));
      out.write("\"/><hr>\r\n");
      out.write("3<input type=\"text\" name=\"marks3\" size=1 value=\"");
out.println(rs.getInt(4));
      out.write("\"/><hr>\r\n");
      out.write("4<input type=\"text\" name=\"marks4\" size=1 value=\"");
out.println(rs.getInt(5));
      out.write("\"/><hr>\r\n");
      out.write("5<input type=\"text\" name=\"marks5\" size=1 value=\"");
out.println(rs.getInt(6));
      out.write("\"/><hr>\r\n");
      out.write("6<input type=\"text\" name=\"marks6\" size=1 value=\"");
out.println(rs.getInt(7));
      out.write("\"/><hr>\r\n");
      out.write("7<input type=\"text\" name=\"marks7\" size=1 value=\"");
out.println(rs.getInt(8));
      out.write("\"/><hr>\r\n");
      out.write("<input type=\"submit\" value=\"FINISH EVALUTION\" name=\"button\"></form>\r\n");
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
