package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.lang.Integer;

public final class summation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
 
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");

      out.write('\r');
      out.write('\n');

String sql,name= (String) session.getAttribute("theSName");
System.out.println(name+"sdf");
int marks[];
marks=new int[8];
for(int i=1;i<=7;i=i+1)
{

      out.write("\r\n");
      out.write("<br>\r\n");
 
marks[i]=Integer.parseInt(request.getParameter("marks"+i));}

sql = "UPDATE marks set m1=?,m2=?,m3=?,m4=?,m5=?,m6=?,m7=?,total=? where username='" + name+"'";

// con is Connection object

ps = con.prepareStatement(sql);
ps.setInt(1,marks[1]);
ps.setInt(2,marks[2]);
ps.setInt(3,marks[3]);
ps.setInt(4,marks[4]);
ps.setInt(5,marks[5]);
ps.setInt(6,marks[6]);
ps.setInt(7,marks[7]);
ps.setInt(8,0);


ps.executeUpdate();

      out.write('\r');
      out.write('\n');

String sql1 = "Delete from recheck where username ='"+ name+"'";
ps = con.prepareStatement(sql1);
ps.executeQuery();

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.top.location.href=\"evaluation.jsp\"; \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
