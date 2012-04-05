package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class concatenate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
      out.write("concatenate!!!\r\n");

String name= (String) session.getAttribute( "theName" );


      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

try{

	//PrintWriter pw = new PrintWriter(new FileOutputStream("c:\\out1.txt"));
    BufferedWriter outa = new BufferedWriter(new FileWriter("c://" + name +".txt"));

for(int i=1;i<=7;i++)
{
	String filename="c:\\answer"+ name + i +".txt" ;
try {
	FileInputStream fis = new FileInputStream(filename);
	char current;
	outa.write("##"+i+" ");
	while (fis.available() > 0) {
	current = (char) fis.read();
	outa.write(current);
	//out.println(current);
	//pw.println(current);
    }
	outa.newLine();
	fis.close();
	}
catch (IOException e)
{
	e.printStackTrace();
}

}
outa.close();
}catch (Exception e){//Catch exception if any
    System.err.println("Error: " + e.getMessage());
  }


      out.write('\r');
      out.write('\n');
 
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");

      out.write('\r');
      out.write('\n');

String sql;
System.out.println(name);

sql = "INSERT INTO marks (username,m1,m2,m3,m4,m5,m6,m7,total) VALUES (?,?,?,?,?,?,?,?,?)";

// con is Connection object

ps = con.prepareStatement(sql);
ps.setString(1,name);
ps.setInt(2,-1);
ps.setInt(3,-1);
ps.setInt(4,-1);
ps.setInt(5,-1);
ps.setInt(6,-1);
ps.setInt(7,-1);
ps.setInt(8,-1);
ps.setInt(9,-1);
//ps.setInt(10,0);

ps.executeUpdate();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("top.close();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

for(int i=1;i<=7;i++)	
{
File f=new File("c:\\answer"+ name + i +".txt");
f.delete();
}

      out.write('\r');
      out.write('\n');

session.invalidate();
response.setHeader("Cache-Control","no-cache"); 
response.setHeader("Cache-Control","no-store"); 
response.setDateHeader("Expires", 0); 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
