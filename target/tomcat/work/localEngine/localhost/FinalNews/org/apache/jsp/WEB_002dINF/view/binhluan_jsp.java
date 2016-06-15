package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class binhluan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- begin wwww.htmlcommentbox.com -->\r\n");
      out.write("\t\t\t\t\t<div id=\"HCB_comment_box\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"http://www.htmlcommentbox.com\">Widget</a> is loading\r\n");
      out.write("\t\t\t\t\t\tcomments...\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\t\t\t\t\t\thref=\"//www.htmlcommentbox.com/static/skins/bootstrap/twitter-bootstrap.css?v=0\" />\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\" id=\"hcb\">\r\n");
      out.write("\t\t\t\t\t\t/*<!--*/\r\n");
      out.write("\t\t\t\t\t\tif (!window.hcb_user) {\r\n");
      out.write("\t\t\t\t\t\t\thcb_user = {};\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t(function() {\r\n");
      out.write("\t\t\t\t\t\t\tvar s = document.createElement(\"script\"), l = hcb_user.PAGE\r\n");
      out.write("\t\t\t\t\t\t\t\t\t|| (\"\" + window.location).replace(/'/g,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"%27\"), h = \"//www.htmlcommentbox.com\";\r\n");
      out.write("\t\t\t\t\t\t\ts.setAttribute(\"type\", \"text/javascript\");\r\n");
      out.write("\t\t\t\t\t\t\ts.setAttribute(\"src\", h + \"/jread?page=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ encodeURIComponent(l).replace(\"+\", \"%2B\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"&opts=16862&num=5&ts=1465231771918\");\r\n");
      out.write("\t\t\t\t\t\t\tif (typeof s != \"undefined\")\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.getElementsByTagName(\"head\")[0]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.appendChild(s);\r\n");
      out.write("\t\t\t\t\t\t})(); /*-->*/\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t<!-- end www.htmlcommentbox.com -->");
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
