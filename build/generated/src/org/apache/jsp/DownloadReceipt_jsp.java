package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DownloadReceipt_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    // Get toyName and price from the request parameters
    String toyName = request.getParameter("toyName");
    String price = request.getParameter("price");

    // Set the response headers to prompt download
    response.setContentType("application/octet-stream");
    response.setHeader("Content-Disposition", "attachment; filename=ToyLibraryReceipt.txt");

    // Generate the receipt content
    StringBuilder receiptContent = new StringBuilder();
    receiptContent.append("Toy Library Receipt\n");
    receiptContent.append("----------------------------\n");
    receiptContent.append("Toy Name: ").append(toyName).append("\n");
    receiptContent.append("Price: $").append(price).append("\n");
    receiptContent.append("Date: ").append(new java.util.Date()).append("\n");
    receiptContent.append("\nTerms and Conditions:\n");
    receiptContent.append("1. The toy must be returned before end of the subscription\n");
    receiptContent.append("2. Late return charges of the toy per day will apply.\n");
    receiptContent.append("3. Damaged toys may incur additional charges.\n");
    receiptContent.append("4. Contact customer support for issues.\n");

    // Write the receipt content to the response output stream
    response.getOutputStream().write(receiptContent.toString().getBytes());
    response.getOutputStream().flush();
    response.getOutputStream().close();

      out.write('\n');
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
