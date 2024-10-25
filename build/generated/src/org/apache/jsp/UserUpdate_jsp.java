package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class UserUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>User Update</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            max-width: 500px;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            background-color: #28a745;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #218838;\n");
      out.write("        }\n");
      out.write("        .error-message {\n");
      out.write("            color: red;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>User Update</h2>\n");
      out.write("    <center>\n");
      out.write("        ");

            try {
                // Get the 'username' parameter from the request
                String username = request.getParameter("username");

                // Check if the username is not null or empty
                if (username != null && !username.isEmpty()) {
                    // Load the MySQL JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    // Establish a connection to the database
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");
                    
                    // Create a statement object
                    Statement st = con.createStatement();
                    
                    // Execute a SQL query to get user data for the provided username
                    String sql = "SELECT * FROM users WHERE username = '" + username + "'";
                    ResultSet rs = st.executeQuery(sql);
                    
                    // Check if the result set has data
                    if (rs.next()) {
        
      out.write("\n");
      out.write("        <h2>Update User Data</h2>\n");
      out.write("        <form action=\"FinalUpdate.jsp\" method=\"post\">\n");
      out.write("            <!-- Display user data in the form fields -->\n");
      out.write("            <label for=\"Name\">Name:</label>\n");
      out.write("            <input type=\"text\" id=\"Name\" name=\"Name\" value=\"");
      out.print(rs.getString("name"));
      out.write("\" required />\n");
      out.write("            \n");
      out.write("            <label for=\"Address\">Address:</label>\n");
      out.write("            <input type=\"text\" id=\"Address\" name=\"Address\" value=\"");
      out.print(rs.getString("address"));
      out.write("\" required />\n");
      out.write("            \n");
      out.write("            <label for=\"Mobileno\">Mobile No:</label>\n");
      out.write("            <input type=\"text\" id=\"Mobileno\" name=\"Mobileno\" value=\"");
      out.print(rs.getString("mobile_no"));
      out.write("\" required />\n");
      out.write("            \n");
      out.write("            <label for=\"Email\">Email:</label>\n");
      out.write("            <input type=\"text\" id=\"Email\" name=\"Email\" value=\"");
      out.print(rs.getString("email"));
      out.write("\" required />\n");
      out.write("            \n");
      out.write("            <label for=\"Username\">Username:</label>\n");
      out.write("            <input type=\"text\" id=\"Username\" name=\"Username\" value=\"");
      out.print(rs.getString("username"));
      out.write("\" readonly />\n");
      out.write("            \n");
      out.write("            <label for=\"Password\">Password:</label>\n");
      out.write("            <input type=\"text\" id=\"Password\" name=\"Password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\" required />\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Update\" />\n");
      out.write("        </form>\n");
      out.write("        ");

                    } else {
                        out.println("<h3 class='error-message'>No user found with the given username.</h3>");
                    }
                    
                    // Close the connection
                    con.close();
                } else {
                    out.println("<h3 class='error-message'>Invalid or missing username.</h3>");
                }
            } catch (Exception e) {
                out.println("<h3 class='error-message'>Error: " + e.getMessage() + "</h3>");
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("    </center>\n");
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
