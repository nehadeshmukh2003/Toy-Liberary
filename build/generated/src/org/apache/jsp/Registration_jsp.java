package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>User Registration</title>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        h1 {\n");
      out.write("            color: #4CAF50; /* Green color for heading */\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            background-color: #FF69B4; /* Pink color for button */\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px 32px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        button a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            background-color: #FF1493; /* Darker pink on hover */\n");
      out.write("        }\n");
      out.write("        .logo {\n");
      out.write("            display: block;\n");
      out.write("            margin: 20px auto; /* Centers the image */\n");
      out.write("            max-width: 100%; /* Responsive image */\n");
      out.write("            height: auto; /* Maintain aspect ratio */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>     \n");
      out.write("    ");

        // Server-side: Inserting registration data into the 'users' table in 'toydb'
        
        // Check if form fields are not null (in case of validation bypass)
        try {
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String mobileno = request.getParameter("mobileno");
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toydb", "root", "");
            Statement st = con.createStatement();
            String sql = "INSERT INTO users(name, address, mobile_no, email, username, password) VALUES('" + name + "', '" + address + "', '" + mobileno + "', '" + email + "', '" + username + "', '" + password + "')";
            
            st.executeUpdate(sql);
            
            // Store values in session attributes
            session.setAttribute("name", name);
            session.setAttribute("address", address);
            session.setAttribute("email", email);
            session.setAttribute("mobileno", mobileno);
            session.setAttribute("username", username);

            out.print("Data inserted successfully!!!!");
            con.close();
        } catch (Exception e) {
            out.print("<br> Exception: " + e);
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <center>\n");
      out.write("        <h1>Welcome to Toy's Library</h1>\n");
      out.write("        <button><a href=\"CustomerHomepage.jsp\">Homepage</a></button>\n");
      out.write("        <img src=\"Web Pages/image/img11.jpg\" alt=\"Toy Library Logo\" class=\"logo\"> <!-- Replace with your logo's path -->\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    <!-- User details are stored in session attributes here -->\n");
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
