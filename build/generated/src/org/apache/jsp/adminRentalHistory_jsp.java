package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class adminRentalHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    // Check if admin is logged in
    String admin = (String) session.getAttribute("admin");
    if (admin == null) {
        response.sendRedirect("adminLogin.jsp"); // Redirect if not authenticated
        return;
    }

    // Initialize a list to store toy registration history
    List<Map<String, Object>> toyHistory = new ArrayList<>();

    // Fetch toy registration history from the database
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/toystore", "root", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
            "SELECT id, name, category, price, registration_date " +
            "FROM toys ORDER BY registration_date DESC"
        );

        while (rs.next()) {
            Map<String, Object> toy = new HashMap<>();
            toy.put("id", rs.getInt("id"));
            toy.put("name", rs.getString("name"));
            toy.put("category", rs.getString("category"));
            toy.put("price", rs.getDouble("price"));
            toy.put("registration_date", rs.getDate("registration_date"));
            toyHistory.add(toy);
        }
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Admin - Toy Registration History</title>\n");
      out.write("    <style>\n");
      out.write("        body { font-family: Arial, sans-serif; margin: 40px; }\n");
      out.write("        h2 { text-align: center; }\n");
      out.write("        table { width: 100%; border-collapse: collapse; margin-top: 20px; }\n");
      out.write("        th, td { border: 1px solid #ddd; padding: 10px; text-align: center; }\n");
      out.write("        th { background-color: #f2f2f2; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Toy Registration History</h2>\n");
      out.write("    <div style=\"overflow-x:auto;\">\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Category</th>\n");
      out.write("                    <th>Price (USD)</th>\n");
      out.write("                    <th>Registration Date</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    if (toyHistory.isEmpty()) {
                
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"5\">No toys registered yet.</td>\n");
      out.write("                    </tr>\n");
      out.write("                ");

                    } else {
                        for (Map<String, Object> toy : toyHistory) {
                
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( toy.get("id") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( toy.get("name") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( toy.get("category") );
      out.write("</td>\n");
      out.write("                        <td>$");
      out.print( toy.get("price") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( toy.get("registration_date") );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
