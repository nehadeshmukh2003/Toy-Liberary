package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class AllCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>All Customer Data</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            h2 {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            th {\n");
      out.write("                background-color: #28a745;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("            tr:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("            a {\n");
      out.write("                color: #007bff;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                max-width: 800px;\n");
      out.write("                margin: auto;\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");

            try {
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM users";
                rs = st.executeQuery(sql);
            
      out.write("\n");
      out.write("            \n");
      out.write("            <h2>User Data</h2>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>Mobile No</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Username</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th>Update Record</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                    while (rs.next()) {
                    
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( rs.getString("name") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("address") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("mobile_no") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("email") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("username") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( rs.getString("password") );
      out.write("</td>\n");
      out.write("                            <td><a href=\"UserUpdate.jsp?username=");
      out.print( rs.getString("username") );
      out.write("\">Update Info</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            ");

                con.close();
            } catch (Exception e) {
                System.out.print(e);
            }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
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
