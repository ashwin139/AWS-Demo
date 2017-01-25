package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("      <title>Sample Demo Project For AWS Testing </title>\r\n");
      out.write("<body>\r\n");
      out.write("      <h1> <center> Sample Demo Project For AWS Testing V1 </center> </h1>\r\n");
      out.write("      <b> Mathematics</b>\r\n");
      out.write("      <hr>\r\n");
      out.write("      <form method=\"post\" action=\"Result.jsp\">\r\n");
      out.write("<font size=5 face=\"Times New Roman\">\r\n");
      out.write("      <input type=\"radio\" name=\"a1\" value=\"add\" checked>Addition</input><br>\r\n");
      out.write("      <input type=\"radio\" name=\"a1\" value=\"mul\" >Multiplication</input><br>\r\n");
      out.write("      <input type=\"radio\" name=\"a1\" value=\"div\" >Division</input><br>\r\n");
      out.write("</font>\r\n");
      out.write("<br><br>\r\n");
      out.write("Enter first Value &nbsp &nbsp &nbsp<input type=\"text\" name=\"t1\" value=\"\"><br>\r\n");
      out.write("Enter second Value &nbsp<input type=\"text\" name=\"t2\" value=\"\"><br>\r\n");
      out.write("<input type=\"submit\" name=\"result\">\r\n");
      out.write("      </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
