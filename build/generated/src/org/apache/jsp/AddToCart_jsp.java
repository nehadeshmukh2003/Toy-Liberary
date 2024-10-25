package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddToCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Add to Cart - Toy Library</title>\n");
      out.write("    <style>\n");
      out.write("            /* General body and font settings */\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("                min-height: 100vh;\n");
      out.write("                overflow-y: auto;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Header styles */\n");
      out.write("            header {\n");
      out.write("                background-color: orange;\n");
      out.write("                color: white;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header h1 {\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Navbar styles */\n");
      out.write("            nav ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: orange;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul li {\n");
      out.write("                display: inline;\n");
      out.write("                margin: 0 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul li a {\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul li a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Main content */\n");
      out.write("            main {\n");
      out.write("                padding: 20px;\n");
      out.write("                max-width: 1200px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            main h2 {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                background-color: yellow;\n");
      out.write("                color: black;\n");
      out.write("                padding: 10px 15px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                background-color: #e6e600;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Cart table */\n");
      out.write("            table {\n");
      out.write("                width: 50%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Footer */\n");
      out.write("            footer {\n");
      out.write("                background-color: pink;\n");
      out.write("                color: #333;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px 0;\n");
      out.write("                position: fixed;\n");
      out.write("                width: 100%;\n");
      out.write("                bottom: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // JavaScript function to confirm toy removal\n");
      out.write("        function confirmRemove(toyName) {\n");
      out.write("            if (confirm('Are you sure you want to remove ' + toyName + ' from the cart?')) {\n");
      out.write("                window.location.href = 'AddToCart.jsp?removeToy=' + toyName;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Your Cart</h1>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"CustomerHomepage.jsp\">Home</a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"AddToCart.jsp\">Add to Cart</a></li>\n");
      out.write("                <li><a href=\"Subscription.jsp\">Subscription</a></li>\n");
      out.write("                <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <h2>Toy Added to Cart</h2>\n");
      out.write("\n");
      out.write("        ");

            // Initialize the cart in the session if it's not already present
            if (session.getAttribute("cart") == null) {
                session.setAttribute("cart", new String[5]);
            }

            // Retrieve the toy name from the query parameter and the cart from session
            String[] cart = (String[]) session.getAttribute("cart");
            String toyName = request.getParameter("toyName");
            String removeToy = request.getParameter("removeToy");

            // Add the toy to the cart if toyName is provided
            if (toyName != null) {
                boolean added = false;
                for (int i = 0; i < cart.length; i++) {
                    if (cart[i] == null) {
                        cart[i] = toyName;
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    out.println("<h3>Your cart is full (max 5 toys).</h3>");
                }
            }

            // Remove the toy if removeToy is provided
            if (removeToy != null) {
                for (int i = 0; i < cart.length; i++) {
                    if (removeToy.equals(cart[i])) {
                        cart[i] = null;
                        break;
                    }
                }
            }

            // Update the session with the modified cart
            session.setAttribute("cart", cart);
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Display the cart in a table -->\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Toy Name</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            ");

                boolean cartEmpty = true;
                for (int i = 0; i < cart.length; i++) {
                    if (cart[i] != null) {
                        cartEmpty = false;
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( cart[i] );
      out.write("</td>\n");
      out.write("                <td><a href=\"javascript:void(0);\" onclick=\"confirmRemove('");
      out.print( cart[i] );
      out.write("')\">Remove</a></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                }

                if (cartEmpty) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\">Your cart is empty.</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <a href=\"CustomerHomepage.jsp\" class=\"btn\">Continue Shopping</a>\n");
      out.write("         <a href=\"GenerateReceipt.jsp\" class=\"btn\">Download Receipt</a>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <p>Thank you for using Toy Library!</p>\n");
      out.write("    </footer>\n");
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
