package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangnhap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Đăng nhập</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style_dangnhap.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style_formdn.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!--start jquery demo-->\r\n");
      out.write("<!--script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script-->\r\n");
      out.write("<!--end jquery demo-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("  <div id=\"logo\"></div>\r\n");
      out.write("  <div id=\"slogan\">\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("  <!-- menu -->\r\n");
      out.write("  <div id=\"menu\">\r\n");
      out.write("  <div id=\"trangchu\"><div id=\"icon_home\"></div><span><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/trangchu\">Trang chủ</a></span></div>\r\n");
      out.write("  <div id=\"menu_item\">Hướng ngiệp</div>\r\n");
      out.write("  <div id=\"menu_item\">Góc nhìn chuyên gia</div>\r\n");
      out.write("  <div id=\"menu_item\">Tâm lý</div>\r\n");
      out.write("   <div id=\"menu_item\">Đồng hành cùng con</div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- end menu-->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"search_bar\">                    \r\n");
      out.write("                        <div class=\"text_run\">\r\n");
      out.write("                        <marquee>\r\n");
      out.write("                        Giáo dục - ươm mầm tri thức Việt!  \r\n");
      out.write("                        </marquee>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <div class=\"NavigatorBoxSearch\">\r\n");
      out.write("                    \r\n");
      out.write("                        <input type=\"hidden\" value=\"013319808617213044252:4shogcrnrhu\" name=\"cx\">\r\n");
      out.write("                        <input type=\"hidden\" value=\"UTF-8\" name=\"ie\">\r\n");
      out.write("                    \r\n");
      out.write("                        <input type=\"text\" name=\"Search\" onKeyPress=\"return trapEnterKey(event)\" id=\"txtSearch\" class=\"inputSearch\">\r\n");
      out.write("                        <input type=\"submit\" value=\"GO\" class=\"submit\" id=\"searchsubmit\" style=\"display:none\">\r\n");
      out.write("                        <a href=\"#\" name=\"btnSearch\" id=\"btnSearch\" class=\"inputSearchheader\" onClick=\"aSearch()\">\r\n");
      out.write("                            Tìm kiếm</a>\r\n");
      out.write("                      <script type=\"text/javascript\">\r\n");
      out.write("                                function gotosearch()\r\n");
      out.write("                                {\r\n");
      out.write("                                    window.location.href = 'http://www.google.com/cse?cx=013319808617213044252:4shogcrnrhu&ie=UTF-8&q=abc#gsc.tab=0&gsc.q='+ $(\"#txtSearch\").val() +'&gsc.page=1';\r\n");
      out.write("                                }\r\n");
      out.write("                            </script>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("</div>\r\n");
      out.write("  <!--start center-->\r\n");
      out.write("  <div id=\"center\">\r\n");
      out.write("  <!-- demo\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  $(document).ready(function() {\r\n");
      out.write("    $('a.login-window').click(function() {\r\n");
      out.write("        //lấy giá trị thuộc tính href - chính là phần tử \"#login-box\"\r\n");
      out.write("        var loginBox = $(this).attr('href');\r\n");
      out.write(" \r\n");
      out.write("        //cho hiện hộp đăng nhập trong 300ms\r\n");
      out.write("        $(loginBox).fadeIn(300);\r\n");
      out.write(" \r\n");
      out.write("        // thêm phần tử id=\"over\" vào sau body\r\n");
      out.write("        $('body').append('<div id=\"over\">');\r\n");
      out.write("        $('#over').fadeIn(300);\r\n");
      out.write(" \r\n");
      out.write("        return false;\r\n");
      out.write(" });\r\n");
      out.write(" \r\n");
      out.write(" // khi click đóng hộp thoại\r\n");
      out.write(" $(document).on('click', \"a.close, #over\", function() {\r\n");
      out.write("       $('#over, .login').fadeOut(300 , function() {\r\n");
      out.write("           $('#over').remove();\r\n");
      out.write("       });\r\n");
      out.write("      return false;\r\n");
      out.write(" });\r\n");
      out.write("});</script>\r\n");
      out.write("  <div class=\"login\" id=\"login-box\">Đăng nhập\r\n");
      out.write(" \r\n");
      out.write(" <a class=\"close\" href=\"#\"><img class=\"img-close\" title=\"Close Window\" alt=\"Close\" src=\"close.png\" /></a>\r\n");
      out.write("<form class=\"login-content\" action=\"#\" method=\"post\"><label class=\"username\">\r\n");
      out.write(" <span>Tên hoặc email</span>\r\n");
      out.write(" <input id=\"username\" type=\"text\" autocomplete=\"on\" name=\"username\" placeholder=\"Username\" value=\"\" />\r\n");
      out.write(" </label>\r\n");
      out.write(" <label class=\"password\">\r\n");
      out.write(" <span>Mật khẩu</span>\r\n");
      out.write(" <input id=\"password\" type=\"password\" name=\"password\" placeholder=\"Password\" value=\"\" />\r\n");
      out.write(" </label>\r\n");
      out.write(" <button class=\"button submit-button\" type=\"button\">Đăng nhập</button>\r\n");
      out.write("  <a class=\"close button\" href=\"#login-box\">Close</a>\r\n");
      out.write(" \r\n");
      out.write(" <a class=\"forgot\" href=\"#\">Quên mật khẩu?</a></form></div>\r\n");
      out.write("  <!--end demo-->\r\n");
      out.write("  \r\n");
      out.write(" <form id = \"form\" action=\"XuLyDangNhap\" method=\"post\" >\r\n");
      out.write("<div id =\"bth\" ><h2>ĐĂNG NHẬP</h2></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"173\" id = \"left\">Tên đăng nhập</td>\r\n");
      out.write("<td width=\"200\"><input type = \"text\" name = \"nameDN\" maxlength=\"50\" placeholder=\"tên đăng nhập\" class = \"in\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td id = \"left\">Mật khẩu</td>\r\n");
      out.write("<td><input type = \"password\" name = \"pass\" placeholder=\"mật khẩu\" class = \"in\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <td colspan=\"2\">   <a target=\"_blank\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/dangky\" > Đăng ký</a><a href=\"#\">Quên mật khẩu?</a></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><input type =\"submit\" name=\"submit\" value=\"OK\" id=\"action\"></td>\r\n");
      out.write("<td><input type = \"button\" name = \"cancel\" value = \"Cancel\" id = \"action\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr >\r\n");
      out.write("  <td>&nbsp;</td>\r\n");
      out.write("  <td>&nbsp;</td>\r\n");
      out.write("  <td></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("  <!--end center--> \r\n");
      out.write("<!--footer-->\r\n");
      out.write("  <div id=\"footer\">\r\n");
      out.write("  <nav id=\"social\">\r\n");
      out.write("  <a class=\"facebook\" href=\"#\" target=\"_blank\">\r\n");
      out.write("  <i class=\"mangxahoi facebook\" >\r\n");
      out.write("  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/face.png\">\r\n");
      out.write("  </i>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"facebook\" href=\"#\" target=\"_blank\">\r\n");
      out.write("  <i class=\"mangxahoi facebook\" >\r\n");
      out.write("  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/face.png\">\r\n");
      out.write("  </i>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"facebook\" href=\"#\" target=\"_blank\">\r\n");
      out.write("  <i class=\"mangxahoi facebook\" >\r\n");
      out.write("  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/face.png\">\r\n");
      out.write("  </i>\r\n");
      out.write("  </a>\r\n");
      out.write("  </nav>\r\n");
      out.write("    <p>Báo điển tử</p>\r\n");
      out.write("    <p>Bản quyền thuộc về CLB Tin Học Khoa Công nghệ Thông tin</p>\r\n");
      out.write("    <p>Trường ĐH Nông Lâm</p>\r\n");
      out.write("    <p>Hotline: 083888888S</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!--kết thúc footer-->\r\n");
      out.write("  \r\n");
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
