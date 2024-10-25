package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class DeleteRecord_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Delete Student Record</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("    <h2>Delete Student Record</h2>\n");

    try
{
 int rollno=Integer.parseInt(request.getParameter("rollno"));
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
Statement st=con.createStatement();
ResultSet rs=null;
String sql="select * from student where Sroll="+rollno;
rs=st.executeQuery(sql);

        

      out.write('\n');

  
while(rs.next())
{

      out.write("\n");
      out.write("            <center>\n");
      out.write("<h2> Students Data</h2>\n");
      out.write("<form action=\"finalDelete.jsp\" method=\"post\">\n");
      out.write("    Name: <input type=\"text\" name=\"Sname\" value=\" ");
      out.print(rs.getString("Sname"));
      out.write("\"/><br>\n");
      out.write("    <input type=\"hidden\" name=\"Sroll1\" value=\"");
      out.print(rs.getInt("Sroll"));
      out.write("\" /><br>\n");
      out.write("    RollNo: <input type=\"text\" name=\"Sroll2\" value=\"");
      out.print(rs.getInt("Sroll"));
      out.write("\" /><br>\n");
      out.write("    Marks: <input type=\"text\" name=\"Smarks\" value=\" ");
      out.print(rs.getString("Smarks"));
      out.write("\"/> <br>\n");
      out.write("     <input type=\"submit\" value=\"Update\" />\n");

}

      out.write("\n");
      out.write("</form>\n");

con.close();
}
catch(Exception e)
{
System.out.print(e);
} 
      out.write("\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
