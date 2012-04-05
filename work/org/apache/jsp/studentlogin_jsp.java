package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
      out.write("<head>\r\n");
      out.write("<h1>\r\n");
      out.write("Login Page\r\n");
      out.write("</h1>\r\n");
      out.write("</head>\r\n");
      out.write("<hr>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=studentlogin action=\"student.jsp\" method = 'post'>\r\n");
      out.write("User ID: \r\n");
 out.println("   ");
      out.write(" \r\n");
      out.write("<input type=\"text\" name=\"firstname\" align=\"center\" />\r\n");
      out.write("<br/>\r\n");
      out.write("Password:  \r\n");
 out.println("   ");
      out.write(" \r\n");
      out.write("<input type=\"password\" name=\"password\" /><br/><br/>\r\n");
      out.write("<input type=\"submit\" value=\"Submit\" />\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body> \r\n");
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
