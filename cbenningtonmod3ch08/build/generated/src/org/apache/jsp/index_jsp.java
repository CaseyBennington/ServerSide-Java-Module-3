package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.CookieUtil;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Murach's Java Servlets and JSP</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>List of albums</h1>\n");
      out.write("        ");

            Cookie[] cookies = request.getCookies();
        
      out.write("\n");
      out.write("        ");
 if (CookieUtil.getCookieValue(cookies, "firstNameCookie") != "") {
        
      out.write("\n");
      out.write("\n");
      out.write("        <p>Welcome back, ");
      out.print( CookieUtil.getCookieValue(cookies, "firstNameCookie"));
      out.write(".\n");
      out.write("        </p>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <p>\n");
      out.write("            <a href=\"");
      out.print(response.encodeURL("checkUser?productCode=8601"));
      out.write("\">\n");
      out.write("                86 (the band) - True Life Songs and Pictures\n");
      out.write("            </a><br>\n");
      out.write("\n");
      out.write("            <a href=\"");
      out.print(response.encodeURL("checkUser?productCode=pf01"));
      out.write("\">\n");
      out.write("                Paddlefoot - The first CD\n");
      out.write("            </a><br>\n");
      out.write("\n");
      out.write("            <a href=\"");
      out.print( response.encodeURL("checkUser?productCode=pf02"));
      out.write("\">\n");
      out.write("                Paddlefoot - The second CD\n");
      out.write("            </a><br>\n");
      out.write("\n");
      out.write("            <a href=\"");
      out.print( response.encodeURL("checkUser?productCode=jr01"));
      out.write("\">\n");
      out.write("                Joe Rut - Genuine Wood Grained Finish\n");
      out.write("            </a>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("    </body>\n");
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
