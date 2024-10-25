package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerHomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Homepage - Toy Library</title>\n");
      out.write("\n");
      out.write("        <!-- Embedded CSS -->\n");
      out.write("        <style>\n");
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
      out.write("            /* Search bar styles */\n");
      out.write("            #search-bar {\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #search-bar input[type=\"text\"] {\n");
      out.write("                width: 300px;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #search-bar button {\n");
      out.write("                padding: 10px 15px;\n");
      out.write("                background-color: yellow;\n");
      out.write("                border: none;\n");
      out.write("                color: black;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #search-bar button:hover {\n");
      out.write("                background-color: #e6e600;\n");
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
      out.write("            main h1 {\n");
      out.write("                color: #4CAF50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Box styles */\n");
      out.write("            .box {\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin: 20px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("                width: 300px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Different colors for each box */\n");
      out.write("            #subscription-section {\n");
      out.write("                background-color: #e3f2fd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #browse-toys {\n");
      out.write("                background-color: #e3f2fd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #rental-history {\n");
      out.write("                background-color: #e3f2fd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Button styles */\n");
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
      out.write("\n");
      out.write("            /* Responsive Design */\n");
      out.write("            @media (max-width: 768px) {\n");
      out.write("                nav ul li {\n");
      out.write("                    display: block;\n");
      out.write("                    margin: 10px 0;\n");
      out.write("                }\n");
      out.write("                main {\n");
      out.write("                    flex-direction: column;\n");
      out.write("                    align-items: center;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Flexbox for layout */\n");
      out.write("            .box-container {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-around;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Toy image styles */\n");
      out.write("            .toy-box {\n");
      out.write("                background-color: #fff;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin: 10px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);\n");
      out.write("                width: 250px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .toy-box img {\n");
      out.write("                max-width: 60%;\n");
      out.write("                height: 50%;\n");
      out.write("                border-radius: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .toy-box h3 {\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .toy-box p {\n");
      out.write("                color: #777;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <h1>Welcome to Toy Library</h1>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                \n");
      out.write("                <li><a href=\"AddToCart.jsp\">Add to Cart</a></li>\n");
      out.write("                <li><a href=\"Subscription.jsp\">Subscription</a></li>\n");
      out.write("                <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        \n");
      out.write("       <main>\n");
      out.write("            <section id=\"welcome-section\">\n");
      out.write("                <h1><center>Hello Users!!!</center><br>for get rented the toys first register <br></h1>\n");
      out.write("               \n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- Toys section -->\n");
      out.write("            <section id=\"toy-section\">\n");
      out.write("                <center><h2>Available Toys</h2></center>\n");
      out.write("                <div class=\"box-container\">\n");
      out.write("                    <!-- Toy 1 -->\n");
      out.write("                    <div class=\"toy-box\">\n");
      out.write("                        <img src=\"image/toy1.jpg\" alt=\"toy 1\"><br><br>\n");
      out.write("                        <h3>Teddy Bear</h3>\n");
      out.write("                         <p>Price: 1000</p>\n");
      out.write("                        <a href=\"AddToCart.jsp?toyName=Teddy Bear\" class=\"btn\" ");
 if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { 
      out.write(" \n");
      out.write("    disabled \n");
 } 
      out.write(">Add to cart</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Toy 2 -->\n");
      out.write("                    <div class=\"toy-box\">\n");
      out.write("                        <img src=\"image/toy2.jpg\" alt=\"toy 2\"><br><br>\n");
      out.write("                        <h3>Jeep</h3>\n");
      out.write("                         <p>Price: 3000</p>\n");
      out.write("                      \n");
      out.write("                       <a href=\"AddToCart.jsp?toyName=Jeep\" class=\"btn\" ");
 if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { 
      out.write(" \n");
      out.write("                        disabled \n");
      out.write("                     ");
 } 
      out.write(">Add to cart</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Toy 3 -->\n");
      out.write("                    <div class=\"toy-box\">\n");
      out.write("                        <img src=\"image/toy3.jpg\" alt=\"toy 3\"><br><br>\n");
      out.write("                        <h3>Electric cell car set</h3>\n");
      out.write("                        <p>Price: 2000</p>\n");
      out.write("                        <a href=\"AddToCart.jsp?toyName=Electric cell car set\" class=\"btn\" ");
 if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { 
      out.write(" \n");
      out.write("    disabled \n");
 } 
      out.write(">Add to cart</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Toy 4 -->\n");
      out.write("                   <div class=\"toy-box\">\n");
      out.write("                        <img src=\"image/toy4.jpg\" alt=\"toy 4\"><br><br>\n");
      out.write("                        <h3>Helicopter </h3>\n");
      out.write("                         <p>Price: 1500</p>\n");
      out.write("                        <a href=\"AddToCart.jsp?toyName=Helicopter\" class=\"btn\" ");
 if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { 
      out.write(" \n");
      out.write("    disabled \n");
 } 
      out.write(">Add to cart</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Toy 5 -->\n");
      out.write("                    <div class=\"toy-box\">\n");
      out.write("                        <img src=\"image/toy5.jpg\" alt=\"Toy 5\">\n");
      out.write("                        <h3>Robot set</h3><br>\n");
      out.write("                        <p>Price: 1000</p>\n");
      out.write("                        <a href=\"AddToCart.jsp?toyName=Robot set\" class=\"btn\" ");
 if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { 
      out.write(" \n");
      out.write("    disabled \n");
 } 
      out.write(">Add to cart</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Toy 6 -->\n");
      out.write("                    <div class=\"toy-box\">\n");
      out.write("                        <img src=\"image/toy6.jpg\" alt=\"toy 6\">\n");
      out.write("                        <h3>Barbie House</h3><br>\n");
      out.write("                         <p>Price: 2300</p>\n");
      out.write("                        <a href=\"AddToCart.jsp?toyName=Barbie House\" class=\"btn\" ");
 if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { 
      out.write(" \n");
      out.write("    disabled \n");
 } 
      out.write(">Add to cart</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Toy 7 -->\n");
      out.write("                    <div class=\"toy-box\">\n");
      out.write("                        <img src=\"image/toy7.jpg\" alt=\"toy 7\">\n");
      out.write("                        <h3>Remote Control Car</h3><br>\n");
      out.write("                        <p>Price: 670</p>\n");
      out.write("                        <a href=\"AddToCart.jsp?toyName=Remote Control Car\" class=\"btn\" ");
 if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { 
      out.write(" \n");
      out.write("    disabled \n");
 } 
      out.write(">Add to cart</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Toy 8 -->\n");
      out.write("                    <div class=\"toy-box\">\n");
      out.write("                        <img src=\"image/toy8.jpg\" alt=\"toy 8\"><br>\n");
      out.write("                        <h3>Hot Wheels</h3><br>\n");
      out.write("                        <p>Price: 900</p>\n");
      out.write("                        <a href=\"AddToCart.jsp?toyName=Hot Wheels\" class=\"btn\" ");
 if (session.getAttribute("isSubscribed") == null || !((Boolean) session.getAttribute("isSubscribed"))) { 
      out.write(" \n");
      out.write("    disabled \n");
 } 
      out.write(">Add to cart</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("                    <!-- Add more toy boxes as needed -->\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <p>\n");
      out.write("                <br><br><br><br>\n");
      out.write("                \n");
      out.write("            </p>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <p>Explore our wide range of toys and enjoy your rentals!!</p>\n");
      out.write("        </footer>\n");
      out.write("        <script>\n");
      out.write("        // JavaScript to retrieve session values and populate the spans\n");
      out.write("        document.getElementById(\"nameSpan\").innerText = \"");
      out.print( session.getAttribute("name") );
      out.write("\";\n");
      out.write("        document.getElementById(\"addressSpan\").innerText = \"");
      out.print( session.getAttribute("address") );
      out.write("\";\n");
      out.write("        document.getElementById(\"emailSpan\").innerText = \"");
      out.print( session.getAttribute("email") );
      out.write("\";\n");
      out.write("        document.getElementById(\"mobileSpan\").innerText = \"");
      out.print( session.getAttribute("mobileno") );
      out.write("\";\n");
      out.write("        document.getElementById(\"usernameSpan\").innerText = \"");
      out.print( session.getAttribute("username") );
      out.write("\";\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

        session.setAttribute("name", request.getParameter("name"));
        session.setAttribute("address", request.getParameter("address"));
        session.setAttribute("email", request.getParameter("email"));
        session.setAttribute("mobileno", request.getParameter("mobileno"));
        session.setAttribute("username", request.getParameter("username"));
        session.setAttribute("password", request.getParameter("password")); 
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
