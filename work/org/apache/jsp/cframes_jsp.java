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

public final class cframes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
      out.write('\r');
      out.write('\n');

String name= (String) session.getAttribute("theRName");
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:cdc","scott","tiger");
ps=con.prepareStatement("select * from marks where username=?");
ps.setString(1,name);
rs=ps.executeQuery();
if (rs.next()) {
	
	
}

      out.write('\r');
      out.write('\n');

String marks[];
marks=new String[8];
int flag=0;
int sum=0;
for(int i=2;i<=8;i++)
{
	if(rs.getInt(i)==-1)
	{
		marks[i-1]="Not Evaluated";
		flag=1;
	}
	else
	{
	marks[i-1]=String.valueOf(rs.getInt(i));
	}
}

if (flag==0)
{
	
	for(int i=1;i<=7;i++)
	{
	  sum+=Integer.parseInt(marks[i]); 
	}
String	sql = "UPDATE marks set total=? where username='" + name+"'";
	ps = con.prepareStatement(sql);
	ps.setInt(1,sum);


	ps.executeUpdate();
	
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");

out.println("You are "+name);

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"compre.css\">\r\n");
      out.write("<table border=1>\r\n");
      out.write("<th>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("Question No\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("\r\n");
      out.write("Marks\r\n");
      out.write("</td>\r\n");
      out.write("</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td>1  </td><td>");
out.println(marks[1]);
      out.write("</td></tr>\r\n");
      out.write("<tr><td>2  </td><td>");
out.println(marks[2]);
      out.write("</td></tr>\r\n");
      out.write("<tr><td>3  </td><td>");
out.println(marks[3]);
      out.write("</td></tr>\r\n");
      out.write("<tr><td>4  </td><td>");
out.println(marks[4]);
      out.write("</td></tr>\r\n");
      out.write("<tr><td>5  </td><td>");
out.println(marks[5]);
      out.write("</td></tr>\r\n");
      out.write("<tr><td>6  </td><td>");
out.println(marks[6]);
      out.write("</td></tr>\r\n");
      out.write("<tr><td>7  </td><td>");
out.println(marks[7]);
      out.write("</td></tr>\r\n");

if(flag==0)
{

      out.write("\r\n");
      out.write("<tr><td>total  </td><td>");
out.println(sum);
      out.write("</td></tr>\r\n");

}
else
{
	
      out.write("\r\n");
      out.write("\t<tr><td>total  </td><td>");
out.println("Not Evaluated");
      out.write("</td></tr>\r\n");
      out.write("\t");

}


      out.write("\r\n");
      out.write("</table>\r\n");
out.println("lite!!"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"recheckrequestsave.jsp\">\r\n");
      out.write("<textarea name=\"recheck\" rows=\"5\" cols=\"50\" >\r\n");
      out.write("</textarea>\r\n");
      out.write("<input type=\"submit\" value=\"recheck\"/>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

System.out.println(name);
name= name.substring(0,3);

try {
	FileInputStream fis = new FileInputStream("c://"+name+".txt");
char current;
char prev;
	while (fis.available() > 0) 
	{ 
	  prev = (char) fis.read();
	  if(prev=='#')
	  {	
		
	  	current = (char) fis.read();
  		if(current=='#')
		  {	
			
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t");

			}
  		else
  		{
  			out.print(prev);
  			out.print(current);
  		}
	
  		
   	}
  	else
		  out.print(prev);
	}
	}
catch (IOException e)
{
	e.printStackTrace();
}


      out.write("\r\n");
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
