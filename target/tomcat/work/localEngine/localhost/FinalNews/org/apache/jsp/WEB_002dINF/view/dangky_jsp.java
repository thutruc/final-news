package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangky_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Đăng ký</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style_pagedif.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style_form.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
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
      out.write("                                \r\n");
      out.write("                          \r\n");
      out.write("                            </script>\r\n");
      out.write("                            <!-- start xuly thong tin dang ky-->\r\n");
      out.write("                            <!--  script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkmk() {\r\n");
      out.write("\t\t$.get(\"XuLy?pass=\" + $(\"#matkhau\").val() + \"&re_pass=\"\r\n");
      out.write("\t\t\t\t+ $(\"#remk\").val(), function(data, status) {\r\n");
      out.write("\t\t\tif (data.indexOf(\"true\") != -1) {\r\n");
      out.write("\t\t\t\t$(\"#thongbao\").html(\"Mật khẩu nhập lại không khớp\");\r\n");
      out.write("\t\t\t\t$(\"#thongbao\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#thongbao\").html(\" \");\r\n");
      out.write("\t\t\t\t$(\"#thongbao\").css(\"color\", \"red\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkmail() {\r\n");
      out.write("\t\t$.get(\"XuLyMail?email=\" + $(\"#email\").val(), function(data, status) {\r\n");
      out.write("\t\t\tif (data.indexOf(\"tontai\") != -1) {\r\n");
      out.write("\t\t\t\t$(\"#thongbao\").html(\"Mail đã tồn tại\");\r\n");
      out.write("\t\t\t\t$(\"#thongbao\").css(\"color\", \"red\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction cancel() {\r\n");
      out.write("\t\twindow.location.replace(\"http://google.com\");\r\n");
      out.write("\t}\r\n");
      out.write("</script-->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("            randomCaptcha();\r\n");
      out.write("            function randomCaptcha() {\r\n");
      out.write("                var a = Math.ceil(Math.random() * 10);\r\n");
      out.write("                var b = Math.ceil(Math.random() * 10);\r\n");
      out.write("                var c = a + b;\r\n");
      out.write("                $(\".hd_result\").val(c + \"\");\r\n");
      out.write("                $(\".capt_cha\").val(a + \" + \" + b);\r\n");
      out.write("                console.log(a);\r\n");
      out.write("                console.log(\"truc\"+b);\r\n");
      out.write("               \t\r\n");
      out.write("            }\r\n");
      out.write("           \r\n");
      out.write("        </script>\r\n");
      out.write("                            <!-- end xuly thong tin dang ky -->\r\n");
      out.write("                    </div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  <!--start center-->\r\n");
      out.write("  <div id=\"center\">\r\n");
      out.write("  <!--form  action=\"#\" method=\"post\">\r\n");
      out.write("  <div id=\"Dk_title\">\r\n");
      out.write("  <div id=\"text\">ĐĂNG KÝ</div>\r\n");
      out.write("  <div id=\"email\">Email: <input id=\"input\" name=\"email\" type=\"email\" size=\"35px\"  placeholder=\"xxx@gmail.com\"/></div>\r\n");
      out.write("  <div id=\"email\">Tên: <input id=\"input\" name=\"name\" type=\"text\" size=\"35px\"  placeholder=\"Nguyen Van A\"/></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("     </form-->\r\n");
      out.write("     <!--start form dang ky -->\r\n");
      out.write("    <form id=\"form\"  method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<h1 align=\"center\">THÔNG TIN ĐĂNG KÝ</h1>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr id=\"thongbao\"></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Email đăng nhập<font style=\"color: #F00\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input id=\"email\" name=\"email\" type=\"email\" size=\"40\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ip\" placeholder=\"Email đăng nhập\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonblur=\"checkmail()\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\" id=\"mk\">Mật khẩu<font style=\"color: #F00\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input id=\"matkhau\" name=\"pass\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsize=\"40\" class=\"ip\" placeholder=\"Mật khẩu\" required></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Nhập lại mật khẩu<font\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: #F00\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input id=\"remk\" name=\"re_pass\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsize=\"40\" class=\"ip\" placeholder=\"Nhập lại mật khẩu\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired=\"required\" onblur=\"checkmk()\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<!--tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Giới tính</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"radio\" name=\"sex\" value=\"Nam\" checked>Nam<input type=\"radio\" name=\"sex\" value=\"Nữ\">Nữ</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr-->\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Họ và tên<font\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: #F00\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input name=\"hoten\" type=\"text\" size=\"40\" class=\"ip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Họ và tên\" required></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Địa chỉ<font style=\"color: #F00\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input name=\"diachi\" type=\"text\" id=\"textfield\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsize=\"40\" class=\"ip\" placeholder=\"Địa chỉ nhà\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired=\"required\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Số điện thoại</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"tel\" name=\"sdt\" size=\"40\" class=\"ip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Mẫu: 0123456789\" \r\n");
      out.write("\t       required size=\"50\" pattern=\"([0-9]{1}([0-9]{3})([0-9]{3})([0-9]{3,4}))\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr-->\r\n");
      out.write("\t\t\t\t\t\t\t<!--tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Ngày sinh</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"date\" name=\"ngaySinh\" class=\"ip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired=\"required\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr-->\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Mã kiểm tra:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"capt_cha\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"title\">Nhập mã kiểm tra:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input name=\"macaptcha\" type=\"text\" size=\"40\" class=\"ip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Nhập mã kiểm tra tại đây!\" required></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input name=\"submit\" type=\"submit\" class=\"actiongui\" value=\"Gửi\">\r\n");
      out.write("\t\t\t\t\t   <input type=\"reset\" name=\"cancel\" value=\"Hủy bỏ\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"actionhuy\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t   </form>\r\n");
      out.write("\t\t\t\t   <input type=\"hidden\" value=\"\" class=\"hd_result\">\r\n");
      out.write("                    <!-- end form dang ky -->\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!--end center--> \r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!--footer-->\r\n");
      out.write("  <div id=\"footer\">\r\n");
      out.write("  <nav id=\"social\">\r\n");
      out.write("  <a class=\"facebook\" href=\"#\" target=\"_blank\">\r\n");
      out.write("  <i class=\"mangxahoi facebook\" >\r\n");
      out.write("  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/tw.png\">\r\n");
      out.write("  </i>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"facebook\" href=\"#\" target=\"_blank\">\r\n");
      out.write("  <i class=\"mangxahoi facebook\" >\r\n");
      out.write("  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/g.png\">\r\n");
      out.write("  </i>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"facebook\" href=\"#\" target=\"_blank\">\r\n");
      out.write("  <i class=\"mangxahoi facebook\" >\r\n");
      out.write("  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/tw.png\">\r\n");
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
      out.write("  <div id=\"back_to_top\" title=\"Go top\" style=\"display: block;\"></div>\r\n");
      out.write("</div>\r\n");
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
