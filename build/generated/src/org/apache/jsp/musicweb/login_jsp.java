package org.apache.jsp.musicweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #000538;\n");
      out.write("        }\n");
      out.write("        .login-form {\n");
      out.write("            max-width: 400px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        h2 { text-align: center; }\n");
      out.write("        label { display: block; margin-bottom: 5px; }\n");
      out.write("        input[type=\"text\"], input[type=\"password\"] {\n");
      out.write("            width: 100%; padding: 10px; margin-bottom: 15px;\n");
      out.write("            border: 1px solid #ccc; border-radius: 3px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            width: 100%; padding: 10px; background: #333; color: #fff;\n");
      out.write("            border: none; border-radius: 3px; cursor: pointer;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover { background: #555; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"login-form\">\n");
      out.write("        <h2>Login</h2>\n");
      out.write("        <form action=\"login.jsp\" method=\"post\">\n");
      out.write("            <label for=\"username\">Username:</label>\n");
      out.write("            <input type=\"text\" id=\"username\" name=\"username\" required>\n");
      out.write("\n");
      out.write("            <label for=\"password\">Password:</label>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            // Get login parameters
            String loginUsername = request.getParameter("username");
            String loginPassword = request.getParameter("password");

            Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                // Load MySQL JDBC Driver
                Class.forName("com.mysql.jdbc.Driver");

                // Establish connection to the database
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music web", "root", "");

                // Prepare SQL query to check credentials
                String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
                pst = con.prepareStatement(sql);
                pst.setString(1, loginUsername);
                pst.setString(2, loginPassword);

                // Execute the query
                rs = pst.executeQuery();

                // Check if user exists
                if (rs.next()) {
                    out.print("<h3>Welcome, " + rs.getString("name") + "!</h3>");
                } else {
                    out.print("<h3>Invalid username or password.</h3>");
                }
            } catch (ClassNotFoundException e) {
                out.print("<br>Driver Class Not Found Exception: " + e.getMessage());
            } catch (SQLException e) {
                out.print("<br>SQL Exception: " + e.getMessage());
            } catch (Exception e) {
                out.print("<br>Exception: " + e.getMessage());
            } finally {
                // Close resources
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace(); // Log error if closing fails
                }
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
