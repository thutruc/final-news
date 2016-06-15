package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trangcon_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>web tin giáo dục</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style_trangcon.css\">\r\n");
      out.write("<script src=\"jquery/jquery-1.7.2.min.js\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"logo\"></div>\r\n");
      out.write("\t\t\t<div id=\"slogan\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- menu -->\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<div id=\"trangchu\">\r\n");
      out.write("\t\t\t\t<div id=\"icon_home\"></div>\r\n");
      out.write("\t\t\t\t<span>Trang chủ</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"menu_item\">Hướng ngiệp</div>\r\n");
      out.write("\t\t\t<div id=\"menu_item\">Góc nhìn chuyên gia</div>\r\n");
      out.write("\t\t\t<div id=\"menu_item\">Tâm lý</div>\r\n");
      out.write("\t\t\t<div id=\"menu_item\">Đồng hành cùng con</div>\r\n");
      out.write("\t\t\t<div id=\"login\">\r\n");
      out.write("\t\t\t\t<a href=\"#\">Đăng nhập</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end menu-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"search_bar\">\r\n");
      out.write("\t\t\t<div class=\"text_run\">\r\n");
      out.write("\t\t\t\t<marquee> Giáo dục - ươm mầm tri thức Việt! </marquee>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"NavigatorBoxSearch\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"013319808617213044252:4shogcrnrhu\"\r\n");
      out.write("\t\t\t\t\tname=\"cx\"> <input type=\"hidden\" value=\"UTF-8\" name=\"ie\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"Search\"\r\n");
      out.write("\t\t\t\t\tonKeyPress=\"return trapEnterKey(event)\" id=\"txtSearch\"\r\n");
      out.write("\t\t\t\t\tclass=\"inputSearch\"> <input type=\"submit\" value=\"GO\"\r\n");
      out.write("\t\t\t\t\tclass=\"submit\" id=\"searchsubmit\" style=\"display: none\"> <a\r\n");
      out.write("\t\t\t\t\thref=\"#\" name=\"btnSearch\" id=\"btnSearch\" class=\"inputSearchheader\"\r\n");
      out.write("\t\t\t\t\tonClick=\"aSearch()\"> Tìm kiếm</a>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\tfunction gotosearch() {\r\n");
      out.write("\t\t\t\t\t\twindow.location.href = 'http://www.google.com/cse?cx=013319808617213044252:4shogcrnrhu&ie=UTF-8&q=abc#gsc.tab=0&gsc.q='\r\n");
      out.write("\t\t\t\t\t\t\t\t+ $(\"#txtSearch\").val() + '&gsc.page=1';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"center\">\r\n");
      out.write("\t\t\t<div id=\"toptin\" style=\"height: 365px;\">\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "user_trangchuyenmuc.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--end muc_admin nếu có-->\r\n");
      out.write("\t\t\t<div id=\"bangtin_chinh\">\r\n");
      out.write("\t\t\t\t<!-- tin liên quan-->\r\n");
      out.write("\t\t\t\t<div id=\"tin_lienquan\">\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "listtin_chuyenmuc.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--end tin liên quan-->\r\n");
      out.write("\t\t\t\t<!--midle2_rights-->\r\n");
      out.write("\t\t\t\t<div id=\"midle2_rights\">\r\n");
      out.write("\t\t\t\t\t<div id=\"midle2_radio\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tendanhmuc\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 200px; margin-left: -2px; margin-top: -54px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"imgdanhmuc\" style=\"margin-left: 16px;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<h5 style=\"margin-left: 18px;\">RADIO</h5>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"listradio\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"playradio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<audio src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reources/img/mp3/giaoduc120215.mp3\" controls\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 186px; margin-left: 1px;\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<marquee>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"noidung_play\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong style=\"font-size: 18px; color: #ffffff;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tRadio đang phát - Tư vấn chọn trường học Tiếng Anh</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</marquee>\r\n");
      out.write("\t\t\t\t\t\t\t<!--link MP3-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								for (int i = 0; i < 3; i++) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"itemradio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" style=\"color: #000; font-weight: bold;\">Tư vấn\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdu học</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--end midle2_radio-->\r\n");
      out.write("\t\t\t\t\t<!--2 banner quảng cáo-->\r\n");
      out.write("\t\t\t\t\t<div id=\"quangcao\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reources/img/image_hinhanh/qc1.jpg\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"quangcao\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reources/img/image_hinhanh/qc2.jpg\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--end 2 banner quảng cáo-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--end midle2_rights-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--end center-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--end bangtin_chinh-->\r\n");
      out.write("\t\t<!--footer-->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"footer1\">\r\n");
      out.write("\t\t\t\t<form id=\"form_datcauhoi\" action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reources/img/image_interface/iconthu.png\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 40px; height: 40px; float: left; margin: 0px 0 -26px 10px;\">\r\n");
      out.write("\t\t\t\t\t<p style=\"margin-bottom: -16px;text-align: center;\">Hộp thư tư vấn</p>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"email\" maxlength=\"50\" placeholder=\"Email\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"in\">\r\n");
      out.write("\t\t\t\t\t<textarea id=\"noidung\" rows=\"33\" cols=\"136\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Nội dung câu hỏi\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 83%; height: 55%; margin-top: 5px; margin-left: 18px;\"></textarea>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" name=\"submit\" value=\"Gửi\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"action\" style=\"width: 50px; margin-top: -6px;\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"footer1\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 35%; text-align: left; font-size: 0px;\">\r\n");
      out.write("\t\t\t\t<p style=\"font-size: 14px;\">© Địa chỉ liên hệ: Lạc Tánh-Tánh\r\n");
      out.write("\t\t\t\t\tLinh- Bình Thuận</p>\r\n");
      out.write("\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t<p style=\"margin-left: 17px; font-size: 14px;\">Số điện thoại:\r\n");
      out.write("\t\t\t\t\t(0623)880 924</p>\r\n");
      out.write("\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t<p style=\"margin-left: 17px; font-size: 14px;\">Email:\r\n");
      out.write("\t\t\t\t\tbichthietnguyen93@gmail.com</p>\r\n");
      out.write("\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t<p style=\"margin-left: 17px; font-size: 14px;\">Hotline:\r\n");
      out.write("\t\t\t\t\t0962968534</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"footer1\">\r\n");
      out.write("\t\t\t\t<p style=\"color: #032730; font-size: 16px;\">CHỊU\r\n");
      out.write("\t\t\t\t\tTRÁCH NHIỆM BÀI VIẾT:</p>\r\n");
      out.write("\t\t\t\t<p style=\"font-size: 14px;\">Nguyễn Thị Bích Thiệt</p>\r\n");
      out.write("\t\t\t\t<p style=\"font-size: 14px;\">Nguyễn Thị Thu Trúc</p>\r\n");
      out.write("\t\t\t\t<p style=\"font-size: 14px;\">Đỗ Thị Thu Thủy</p>\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reources/img/image_interface/templatemo_menu_hover2.png\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 25px; height: 25px;\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reources/img/image_interface/templatemo_menu_hover.png\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 30px; height: 25px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--kết thúc footer-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--gotop -->\r\n");
      out.write("\t\t<div id=\"go_top\" title=\"Go top\" style=\"display: block;\">\r\n");
      out.write("\t\t\t<a href=\"#\" id=\"go_top\" style=\"display: inline;\"> </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t(function() {\r\n");
      out.write("\t\t\t\t// Ẩn hiện icon go-top\r\n");
      out.write("\t\t\t\t$(window).scroll(function() {\r\n");
      out.write("\t\t\t\t\tif ($(window).scrollTop() == 0) {\r\n");
      out.write("\t\t\t\t\t\t$('#go_top').stop(false, true).fadeOut(600);\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$('#go_top').stop(false, true).fadeIn(600);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// Cuộn trang lên với scrollTop\r\n");
      out.write("\t\t\t\t$('#go_top').click(function() {\r\n");
      out.write("\t\t\t\t\t$('body,html').animate({\r\n");
      out.write("\t\t\t\t\t\tscrollTop : 0\r\n");
      out.write("\t\t\t\t\t}, 400);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t})(jQuery);\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<!--end gotop -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
