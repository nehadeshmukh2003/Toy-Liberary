package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;

public final class GenerateReceipt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Receipt - Toy Library</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        h1, h3 {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        table, th, td {\n");
      out.write("            border: 1px solid #000;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        .terms {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Toy Library Receipt</h1>\n");
      out.write("\n");
      out.write("    ");

        // Database connection setup
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String email = (String) session.getAttribute("email");

        try {
            // Load MySQL JDBC driver (adjust according to your DB setup)
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establish connection (replace with your own connection details)
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");
            
            // Query to fetch user details using email as the primary key
            String query = "SELECT name, address, email, mobile_no FROM users WHERE username = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            rs = pst.executeQuery();

            String name = "", address = "", mobileNo = "";
            if (rs.next()) {
                name = rs.getString("name");
                address = rs.getString("address");
                mobileNo = rs.getString("mobile_no");
            }
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (pst != null) try { pst.close(); } catch (SQLException e) {}
            if (con != null) try { con.close(); } catch (SQLException e) {}
        }

        // Retrieve cart and toy prices
        String[] cart = (String[]) session.getAttribute("cart");
         Map<String, Integer> toyPrices = new HashMap<String, Integer>();
        toyPrices.put("Teddy Bear", 1500);
        toyPrices.put("Jeep", 3000);
        toyPrices.put("Electric cell car set", 2000);
        toyPrices.put("Helicopter", 1500);
        toyPrices.put("Robot set", 1000);
        toyPrices.put("Barbie House", 2300);
        toyPrices.put("Remote Control Car", 670);
        toyPrices.put("Hot Wheels", 900);

        int totalAmount = 0;
    
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Display customer details -->\n");
      out.write("    <h3>Customer Details</h3>\n");
      out.write("    <p>Name: ");
      out.print(rs.getString("name"));
      out.write("</p>\n");
      out.write("    <p>Address: ");
      out.print(rs.getString("address"));
      out.write("</p>\n");
      out.write("    <p>Email: ");
      out.print(rs.getString("email"));
      out.write("</p>\n");
      out.write("    <p>Mobile No: ");
      out.print(rs.getString("mobile_no"));
      out.write("</p>\n");
      out.write("\n");
      out.write("    <!-- Display cart and calculate total -->\n");
      out.write("    <h3>Toys in Your Cart</h3>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Toy Name</th>\n");
      out.write("            <th>Price</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            for (int i = 0; i < cart.length; i++) {
                if (cart[i] != null) {
                    totalAmount += toyPrices.get(cart[i]);
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( cart[i] );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( toyPrices.get(cart[i]) );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <!-- Display total amount -->\n");
      out.write("    <h3>Total Amount: ");
      out.print( totalAmount );
      out.write(" </h3>\n");
      out.write("\n");
      out.write("    <!-- Footer with terms and conditions -->\n");
      out.write("    <div class=\"terms\">\n");
      out.write("        <p>Thank you for using Toy Library! Please make the payment at the counter.</p>\n");
      out.write("    </div>\n");
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
