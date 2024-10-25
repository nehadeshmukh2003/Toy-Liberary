package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class Adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login Result</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   ");

        try {
            // Retrieve form parameters from the Adminlogin.html form
            String username = request.getParameter("ANAME");
            String password = request.getParameter("PASS");

            // Ensure both username and password are provided
            if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {

                // Load MySQL JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                // Establish connection to the database
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");

                // SQL query to retrieve the admin record from the 'ad' table
                String sql = "SELECT adminname, adminpass FROM ad WHERE adminname=? AND adminpass=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, username); // Bind the username parameter
                pst.setString(2, password); // Bind the password parameter

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    // If username and password match an existing admin record, redirect to validadmin.jsp
                    response.sendRedirect("validadmin.jsp");
                } else {
                    // If invalid credentials, redirect to invalidlogin.jsp
                    response.sendRedirect("invalidadmin.jsp");
                }

                // Close all resources
                rs.close();
                pst.close();
                con.close();
            } else {
                out.print("Please provide both username and password.");
            }
        } catch (Exception e) {
            out.print("Error: " + e.getMessage());
        }
    
      out.write("\n");
      out.write("    </body>\n");
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
