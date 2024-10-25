package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: Bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("  background-color: green;\n");
      out.write("}\n");
      out.write(".navbar{\n");
      out.write("    display: flex;\n");
      out.write("    height: 5rem;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    align-items: center;\n");
      out.write("    padding-top: 1rem;\n");
      out.write("    border-bottom: 2px solid orange;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-menu{\n");
      out.write("    position: fixed;\n");
      out.write("    width: 94%;\n");
      out.write("    top: 6rem;\n");
      out.write("    left: 18px;\n");
      out.write("    background-color:orange;\n");
      out.write("    font-weight: 600;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".nav-menu a{\n");
      out.write("    display: block;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 5px 0;\n");
      out.write("}\n");
      out.write(".nav-menu a:hover{\n");
      out.write("    background-color: orange;\n");
      out.write("}\n");
      out.write("@media screen and (min-width:600px){\n");
      out.write("    .navbar{\n");
      out.write("        justify-content: space-around;\n");
      out.write("    }\n");
      out.write("    .nav-menu{\n");
      out.write("        display: block;\n");
      out.write("        position: static;\n");
      out.write("        width: auto;\n");
      out.write("        margin-right:20px;\n");
      out.write("        background: none;\n");
      out.write("    }\n");
      out.write("    .nav-menu a{\n");
      out.write("        display: inline-block;\n");
      out.write("        padding: 15px 20px;\n");
      out.write("    }\n");
      out.write("    .nav-menu a:hover{\n");
      out.write("        background-color:orange;\n");
      out.write("        border-radius: 5px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write(".box-container {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: space-evenly;\n");
      out.write("  align-items: center;\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  gap: 50px;\n");
      out.write("}\n");
      out.write(".box {\n");
      out.write("  height: 90px;\n");
      out.write("  width: 150px;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  box-shadow: 3px 3px 10px rgba(0, 30, 87, 0.751);\n");
      out.write("  padding: 20px;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: space-around;\n");
      out.write("  cursor: pointer;\n");
      out.write("  transition: transform 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write(".box:hover {\n");
      out.write("  transform: scale(1.08);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box:nth-child(1) {\n");
      out.write("  background-color: var(--one-use-color);\n");
      out.write("}\n");
      out.write(".box:nth-child(2) {\n");
      out.write("  background-color: var(--two-use-color);\n");
      out.write("}\n");
      out.write(".box:nth-child(3) {\n");
      out.write("  background-color: var(--one-use-color);\n");
      out.write("}\n");
      out.write(".box:nth-child(4) {\n");
      out.write("  background-color: var(--two-use-color);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box img {\n");
      out.write("  height: 50px;\n");
      out.write("}\n");
      out.write(".box .text {\n");
      out.write("    color:darkcyan;\n");
      out.write("}\n");
      out.write(".topic {\n");
      out.write("  font-size: 13px;\n");
      out.write("  font-weight: 400;\n");
      out.write("  letter-spacing: 1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topic-heading {\n");
      out.write("  font-size: 30px;\n");
      out.write("  letter-spacing: 3px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"navbar\"\n");
      out.write("    <nav>\n");
      out.write("        <div class=\"nav-menu\"\n");
      out.write("             \n");
      out.write("             <li><a href=\"UserProfile.jsp\">UserProfile</a></li>\n");
      out.write("  \n");
      out.write("      <li><a href=\"AdminCart.jsp\">AdminCart</a></li>\n");
      out.write("  <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("</div>\n");
      out.write("                 <div class=\"box box1\">\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        \n");
      out.write("                        <h2 class=\"topic-heading\">Rental History</h2>\n");
      out.write("                        <h5 class=\"topic\">Customer history </h5>\n");
      out.write("                         <button onclick=\"document.location='Rentalhistory.jsp'\">view History</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                 </div><br>\n");
      out.write("\n");
      out.write("                <div class=\"box box2\">\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        \n");
      out.write("                        <h2 class=\"topic-heading\">Added Toys</h2>\n");
      out.write("                        <h5 class=\"topic\">added toys</h5>\n");
      out.write("                         <button onclick=\"document.location='AddToy.jsp'\">view Toys</button>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    </div><br>\n");
      out.write("\n");
      out.write("                <div class=\"box box3\">\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <h2 class=\"topic-heading\">Subscription</h2>\n");
      out.write("                        <h5 class=\"topic\">Customer subscription</h5>\n");
      out.write("                        <button onclick=\"document.location='subscription.jsp'\">view suscribers</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div><br>\n");
      out.write("\n");
      out.write("                <div class=\"box box4\">\n");
      out.write("                    <div class=\"text\">\n");
      out.write("                        <h2 class=\"topic-heading\">Payment Proof</h2>\n");
      out.write("                        <h5 class=\"topic\">Payment</h5>\n");
      out.write("                        <button onclick=\"document.location='payment.jsp'\">view Payments</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div><br>\n");
      out.write("\n");
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
