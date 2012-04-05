package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class evaluation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


Connection con;

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
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');

Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");

Statement statement = con.createStatement() ;
ResultSet resultset = 
    statement.executeQuery("select * from marks") ;

      out.write("\r\n");
      out.write("<TABLE BORDER=\"1\">\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TH>ID</TH>\r\n");
      out.write("                \r\n");
      out.write("            </TR>\r\n");
      out.write("            ");
 while(resultset.next()){
            	
            
      out.write("\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD><a href=\"fframes.jsp?name=");
      out.print( resultset.getString(1) );
      out.write('"');
      out.write('>');
      out.print( resultset.getString(1) );
      out.write("</a></td>\r\n");
      out.write("                \r\n");
      out.write("            </TR>\r\n");
      out.write("            \r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </TABLE>\r\n");
      out.write("<h3>Recheck Requests</h3>\r\n");

resultset = statement.executeQuery("select * from recheck") ;

      out.write("\r\n");
      out.write("<TABLE BORDER=\"1\">\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TH>ID</TH>\r\n");
      out.write("                \r\n");
      out.write("            </TR>\r\n");
      out.write("            ");
 while(resultset.next()){
            
      out.write("\r\n");
      out.write("            <TR>\r\n");
      out.write("                <TD><a href=\"fframes.jsp?name=");
      out.print( resultset.getString(1) );
      out.write('"');
      out.write('>');
      out.print( resultset.getString(1));
      out.write("\r\n");
      out.write("                </a></td>\r\n");
      out.write("                \r\n");
      out.write("            </TR>\r\n");
      out.write("            \r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </TABLE>\r\n");
      out.write("        </body>\r\n");
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
