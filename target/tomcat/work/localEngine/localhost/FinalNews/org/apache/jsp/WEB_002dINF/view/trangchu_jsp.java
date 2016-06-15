package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trangchu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"jquery/jquery-1.7.2.min.js\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- tham khảo chèn video http://www.yan.vn/ly-nha-ky-long-lay-truoc-gio-chia-tay-tham-do-cannes-92817.html -->\r\n");
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
      out.write("\t\t\t<div id=\"menu_item\">Hướng nghiệp</div>\r\n");
      out.write("\t\t\t<div id=\"menu_item\">Góc nhìn chuyên gia</div>\r\n");
      out.write("\t\t\t<div id=\"menu_item\">Tâm lý</div>\r\n");
      out.write("\t\t\t<div id=\"menu_item\">Đồng hành cùng con</div>\r\n");
      out.write("\t\t\t<div id=\"login\">\r\n");
      out.write("\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\thref=\"http://localhost:8080/WebTinGiaoDuc/trangcon_user.jsp\">Đăng\r\n");
      out.write("\t\t\t\t\tnhập</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end menu-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"search_bar\">\r\n");
      out.write("\t\t\t<div class=\"text_run\">\r\n");
      out.write("\t\t\t\t<marquee> Giáo dục - ươm mầm tri thức Việt </marquee>\r\n");
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
      out.write("\t\t\t<!--top left-->\r\n");
      out.write("\t\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t\t<div id=\"item_topimag\">\r\n");
      out.write("\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Tin mới đăng</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"imag\">\r\n");
      out.write("\t\t\t\t\t\t<a a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/trangchu/duhoc1.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 340px; height: 260px;\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"top_content\">\r\n");
      out.write("\t\t\t\t\t\t<h4 style=\"margin-top: 0px;\">Người Việt đến Nhật du học tăng\r\n");
      out.write("\t\t\t\t\t\t\tmạnh</h4>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"tomtat_tin\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>Vừa được Tổ chức Hỗ trợ sinh viên Nhật Bản (JASSO) công\r\n");
      out.write("\t\t\t\t\t\t\t\tbố, cho thấy lượng học viên, sinh viên Việt đứng thứ 2 về du học\r\n");
      out.write("\t\t\t\t\t\t\t\tsinh ở Nhật, chỉ sau Trung Quốc (94.111, gần như không thay đổi\r\n");
      out.write("\t\t\t\t\t\t\t\tso với năm trước), theo Kyodo News. Số liệu trên cho thấy số du\r\n");
      out.write("\t\t\t\t\t\t\t\thọc sinh Việt tại Nhật lần đầu tiên vượt qua con số tương ứng ở\r\n");
      out.write("\t\t\t\t\t\t\t\tMỹ... Vừa được Tổ chức Hỗ trợ sinh viên Nhật Bản (JASSO) công\r\n");
      out.write("\t\t\t\t\t\t\t\tbố, cho thấy lượng học viên, sinh viên Việt đứng thứ 2 về du học\r\n");
      out.write("\t\t\t\t\t\t\t\tVừa được Tổ chức Hỗ trợ sinh viên Nhật Bản (JASSO) công bố, cho\r\n");
      out.write("\t\t\t\t\t\t\t\tthấy lượng học viên, sinh viên Việt đứng thứ 2 về du học.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"readmore\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"tinchitiet.jsp\"><strong>Read more</strong></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--end top left-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--midle1-->\r\n");
      out.write("\t\t\t<div id=\"midle1\">\r\n");
      out.write("\t\t\t\t<div id=\"blognews\">\r\n");
      out.write("\t\t\t\t\t<div id=\"newitem\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"image_item\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/trangchu/grid/tuvan.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 190px; height: 125px;\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"text_item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><p>Tư vấn truyền hình trực tuyến: Nộp hồ sơ\r\n");
      out.write("\t\t\t\t\t\t\t\t\tđể trúng tuyển ngay nguyện vọng 1</p></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!---2 item khÃ¡c-->\r\n");
      out.write("\t\t\t\t\t<div id=\"newitem\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"image_item\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/trangchu/grid/thi1.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 190px; height: 125px;\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"text_item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><p>Học nghề, đường đời rộng mở </p></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						for (int i = 0; i < 3; i++) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"newitem\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"image_item\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/trangchu/grid/tuyensinh.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 190px; height: 125px;\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"text_item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><p>Tuyển sinh lớp 10 TP.HCM: Chọn trường nào\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcho phù hợp?</p></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						};
					
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--midle2-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"midle2\">\r\n");
      out.write("\t\t\t\t<div id=\"midle2_left\">\r\n");
      out.write("\t\t\t\t\t<div id=\"midle2_row1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row11\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tendanhmuc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"imgdanhmuc\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>TUYỂN SINH</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"tinmoi_tuyensinh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"anh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/tuyensinh/ts1.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 340px; height: 180px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"tinchitiet.jsp\"><h6>Tư vấn thông tin mới nhất\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvề tuyển sinh lớp 10</h6></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 style=\"margin-top: -30px;\">(Ngày đăng: 19/5/2016)</h6>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"link_tuyensinh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong> Tài liệu Những điều\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcần biết về tuyển sinh ĐH, CĐ 2015</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--thamkhao: http://www.huongnghiepviet.com/v3/tin-huong-nghiep-tuyen-sinh -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Thông tin xét tuyển\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcủa 440 trường ĐH,CĐ trong cả nước 2016</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Chỉ tiêu tuyển sinh\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t2016 của các trường CĐ, TC công an</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tendanhmuc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"imgdanhmuc\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>DU HỌC</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"tinmoi_duhoc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"anh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/duhoc/duhoc2.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 340px; height: 180px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><h6>Học ngành gì ở Mỹ dễ xin việc nhất?</h6></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 style=\"margin-top: -30px;\">(Ngày đăng: 19/5/2016)</h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"link_duhoc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Điều kiện, cách tính\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tđiểm XT vào ĐH Bách khoa Hà Nội 2016</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Hướng dẫn đăng ký học\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tbổ túc cấp 2, cấp 3</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--thamkhao: http://www.huongnghiepviet.com/v3/ -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Điều kiện, cách tính\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tđiểm xét tuyển vào ĐH Bách khoa Hà Nội</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"midle2_row2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row11\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tendanhmuc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"imgdanhmuc\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>DẠY CON</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"tinmoi_daycon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"anh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/daycon/daycon1.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 340px; height: 180px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><h6>Tư vấn \"Dạy con tuổi teen tự lập\"</h6></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 style=\"margin-top: -30px;\">(Ngày đăng: 19/5/2016)</h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"link_daycon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Dạy con biết cảm thông\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tđể sống hạnh phúc hơn</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Làm sao để dạy con\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tthói quen lịch sự</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Dạy con những bài học\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tđầu tiên</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tendanhmuc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"imgdanhmuc\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 style=\"margin-left: 59px;\">HƯỚNG NGHIỆP</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"tinmoi_huongnghiep\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"anh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/huongnghiep/nganh-quan-ly-giao-duc.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 340px; height: 180px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><h6>Những câu hỏi đặt ra khi chọn nghề?</h6></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 style=\"margin-top: -30px;\">(Ngày đăng: 19/5/2016)</h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"link_huongnghiep\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Điều kiện, cách tính\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tđiểm xét tuyển vào ĐH Bách khoa Hà Nội</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Hướng dẫn đăng ký học\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tbổ túc cấp 2, cấp 3</strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--thamkhao: http://www.huongnghiepviet.com/v3/ -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\"><strong>Điều kiện, cách tính\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tđiểm xét tuyển vào ĐH Bách khoa Hà Nội<strong></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"midle2_row3_video\">\r\n");
      out.write("\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"font-weight: bold; color: #000; text-decoration: none;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h5\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"text-align: left; margin-bottom: 15px; margin-left: 15px; color: #027087;\">VIDEO</h5>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"playvideo\" style=\"width: 132%;\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								for (int i = 0; i < 4; i++) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<iframe width=\"234\" height=\"200\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://www.youtube.com/embed/AsTUqE9wkGs\" frameborder=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tallowfullscreen=\"\" style=\"margin-right: 15px;\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--end tin liên quan-->\r\n");
      out.write("\t\t\t\t<!--radio và quảng cáo-->\r\n");
      out.write("\t\t\t\t<!--midle2_right-->\r\n");
      out.write("\t\t\t\t<div id=\"midle2_right\" style=\"margin-top: 25px;\">\r\n");
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
      out.write("/resources/img/mp3/giaoduc120215.mp3\" controls\r\n");
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
      out.write("/resources/img/image_hinhanh/qc1.jpg\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"quangcao\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/qc2.jpg\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--end 2 banner quảng cáo-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--end midle2_right-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--end center-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--footer-->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"footer1\">\r\n");
      out.write("\t\t\t\t<form id=\"form_datcauhoi\" action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/iconthu.png\"\r\n");
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
      out.write("\t\t\t\t<p style=\"color: #032730; font-size: 16px;\">CHỊU TRÁCH NHIỆM BÀI\r\n");
      out.write("\t\t\t\t\tVIẾT:</p>\r\n");
      out.write("\t\t\t\t<p style=\"font-size: 14px;\">Nguyễn Thị Bích Thiệt</p>\r\n");
      out.write("\t\t\t\t<p style=\"font-size: 14px;\">Nguyễn Thị Thu Trúc</p>\r\n");
      out.write("\t\t\t\t<p style=\"font-size: 14px;\">Đỗ Thị Thu Thủy</p>\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/templatemo_menu_hover2.png\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 25px; height: 25px;\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/templatemo_menu_hover.png\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 30px; height: 25px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--kết thúc footer-->\r\n");
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
