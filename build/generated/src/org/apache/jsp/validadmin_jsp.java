package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class validadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Dashboard - Toy Library</title>\n");
      out.write("    <style>\n");
      out.write("        /* General body and font settings */\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            min-height: 100vh;\n");
      out.write("            overflow-y: auto;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Header styles */\n");
      out.write("        header {\n");
      out.write("            background-color: orange;\n");
      out.write("            color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header h1 {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Main content */\n");
      out.write("        main {\n");
      out.write("            padding: 20px;\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        main h2 {\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Description about the Toy Library */\n");
      out.write("        .description {\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 20px 0;\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #555;\n");
      out.write("            max-width: 800px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Box styles */\n");
      out.write("        .box {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            width: 300px;\n");
      out.write("            text-align: center;\n");
      out.write("            transition: transform 0.2s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .box:hover {\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Button styles */\n");
      out.write("        .btn {\n");
      out.write("            background-color: yellow;\n");
      out.write("            color: black;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: #e6e600;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Logout button */\n");
      out.write("        .logout-btn {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 20px;\n");
      out.write("            right: 20px;\n");
      out.write("            background-color: red;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logout-btn:hover {\n");
      out.write("            background-color: darkred;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Footer */\n");
      out.write("        footer {\n");
      out.write("            background-color: pink;\n");
      out.write("            color: #333;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px 0;\n");
      out.write("            position: fixed;\n");
      out.write("            width: 100%;\n");
      out.write("            bottom: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Flexbox for layout */\n");
      out.write("        .box-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Responsive Design */\n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            .box-container {\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .box {\n");
      out.write("                width: 80%; /* Responsive width for small screens */\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Welcome to Toy Library</h1>\n");
      out.write("        <a href=\"index.jsp\" class=\"logout-btn\">Logout</a> <!-- Logout button -->\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <div class=\"description\">\n");
      out.write("            <p>Welcome to the Toy Library! Here, you can manage toys efficiently, add new toys for rental, and view customer data. Enjoy a seamless experience in managing our extensive toy collection!</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"box-container\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <h2>Add Toy</h2>\n");
      out.write("                <p>Quickly add new toys to the library.</p>\n");
      out.write("                <a href=\"AdminAddToy.html\" class=\"btn\">Go to Add Toy</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <h2>View Toy</h2>\n");
      out.write("                <p>View and manage all toys in the library.</p>\n");
      out.write("                <a href=\"ViewToy.jsp\" class=\"btn\">Go to View Toy</a>\n");
      out.write("            </div>\n");
      out.write("<!--            <div class=\"box\">\n");
      out.write("                <h2>All User Data</h2>\n");
      out.write("                <p>Access data for all registered users.</p>\n");
      out.write("                <a href=\"AllCustomer.jsp\" class=\"btn\">View Users</a>\n");
      out.write("            </div>-->\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <p>Explore our wide range of toys and enjoy your rentals!</p>\n");
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
