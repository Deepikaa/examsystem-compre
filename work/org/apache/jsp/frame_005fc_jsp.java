package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frame_005fc_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String q=(String) session.getAttribute( "qn" );
System.out.println(q);

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
      out.write("<a href=\"savefile2.jsp?questionno=1\" target=\"frame_d\">1 </a> \r\n");
      out.write("<hr>\r\n");
      out.write("<a href=\"savefile2.jsp?questionno=2\" target=\"frame_d\">2 </a>\r\n");
      out.write("<hr>\r\n");
      out.write("<a href=\"savefile2.jsp?questionno=3\" target=\"frame_d\">3 </a>\r\n");
      out.write("<hr>\r\n");
      out.write("<a href=\"savefile2.jsp?questionno=4\" target=\"frame_d\">4 </a>\r\n");
      out.write("<hr>\r\n");
      out.write("<a href=\"savefile2.jsp?questionno=5\" target=\"frame_d\">5 </a>\r\n");
      out.write("<hr>\r\n");
      out.write("<a href=\"savefile2.jsp?questionno=6\" target=\"frame_d\">6 </a>\r\n");
      out.write("<hr>\r\n");
      out.write("<a href=\"savefile2.jsp?questionno=7\" target=\"frame_d\">7 </a>\r\n");
      out.write("<hr>\r\n");
      out.write("</html>\r\n");
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
