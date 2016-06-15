package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listtin_005fchuyenmuc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style_trangcon.css\">\r\n");
      out.write("<script src=\"jquery/jquery-1.7.2.min.js\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#xemthem {\r\n");
      out.write("\tborder-radius: 50%;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\theight: 1px;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tmargin-top: 40px;\r\n");
      out.write("\tbackground-color: #032730;\r\n");
      out.write("\tfont-family: Georgia, \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#xemthem:hover {\r\n");
      out.write("\tbox-shadow: 0 2px 10px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0\r\n");
      out.write("\t\trgba(0, 0, 0, 0.12);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#news {\r\n");
      out.write("\twidth: 75%;\r\n");
      out.write("\theight: 1035px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tpadding-left: 2px;\r\n");
      out.write("\tpadding-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#news #news_item {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 150px;\r\n");
      out.write("\tmargin-bottom: 25px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tbackground-color: #F3f3f3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#news #news_item #hinhanh {\r\n");
      out.write("\tclear: right;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\twidth: 33%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#news #news_item #noidung_tomtat {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\twidth: 65%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- tin liên quan-->\r\n");
      out.write("\t<!--tiêu đề-->\r\n");
      out.write("\t<div class=\"tendanhmuc\"\r\n");
      out.write("\t\tstyle=\"width: 777px; margin-top: -10px; margin-bottom: 15px;\">\r\n");
      out.write("\t\t<div class=\"imgdanhmuc\"></div>\r\n");
      out.write("\t\t<h5>TIN NỔI BẬT</h5>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--hết tiêu đề-->\r\n");
      out.write("\t<!--tin-->\r\n");
      out.write("\t<div id=\"news\">\r\n");
      out.write("\t\t<!---thamkhao  http://www.marrybaby.vn/con-dang-lon/be-tu-4-den-6-tuoi/8-chieu-giup-me-day-tre-biet-nghe-loi-->\r\n");
      out.write("\t\t");

			for (int i = 0; i < 5; i++) {
		
      out.write("\r\n");
      out.write("\t\t<div id=\"news_item\">\r\n");
      out.write("\t\t\t<div id=\"hinhanh\">\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_hinhanh/donghanhcungcon/mot-nam-hoc-thanh-cong-1.jpg\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: 150px; width: 250px;\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"noidung_tomtat\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><h4>Cùng con học tập cũng là một \"sự nghiệp\"</h4></a>\r\n");
      out.write("\t\t\t\t<p>Dạy con học gây không ít căng thẳng cho các bậc phụ huynh.\r\n");
      out.write("\t\t\t\t\tViệc này không hề đơn giản mà có thể coi là cả một \"sự nghiệp\" của\r\n");
      out.write("\t\t\t\t\tcác bậc làm cha, làm mẹ. Bên cạnh kiến thức còn đòi hỏi nhiều tình\r\n");
      out.write("\t\t\t\t\tyêu thương, sự kiên nhẫn và phương pháp khoa học.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t<!--http://dantri.com.vn/dien-dan/cung-con-hoc-tap-cung-la-mot-su-nghiep-1349202941.htm-->\r\n");
      out.write("\t\t<!-- <div id=\"news_item\">\r\n");
      out.write("\t\t\t<div id=\"hinhanh\">\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"img/image_hinhanh/donghanhcungcon/mot-nam-hoc-thanh-cong-1.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"noidung_tomtat\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><h4>Cùng con bước vào một năm thành công</h4></a>\r\n");
      out.write("\t\t\t\t<p>Sau một mùa hè nghỉ ngơi, thư giãn, các bạn nhỏ đã bước vào\r\n");
      out.write("\t\t\t\t\tnhững ngày đầu tiên của năm học mới thì bắt đầu lại việc học theo\r\n");
      out.write("\t\t\t\t\tquy củ nền nếp, chắc chắn sẽ có nhiều em chưa quen nên thiếu tập\r\n");
      out.write("\t\t\t\t\ttrung, thiếu chăm chỉ hay không có hứng thú với việc tự học tại\r\n");
      out.write("\t\t\t\t\tnhà...</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"news_item\">\r\n");
      out.write("\t\t\t<div id=\"hinhanh\">\r\n");
      out.write("\t\t\t\t<img src=\"img/image_hinhanh/donghanhcungcon/vuihoccungcon.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"noidung_tomtat\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><h4>Những điều tốt nhất bạn có thể làm cho con</h4></a>\r\n");
      out.write("\t\t\t\t<p>Mọi bậc cha mẹ đều mong muốn mang đến cho con những điều tốt\r\n");
      out.write("\t\t\t\t\tnhất. Trong số đó, đừng quên:</p>\r\n");
      out.write("\t\t\t\t<p>Dạy con qua những câu chuyện kể, dạy con qua thực tế, biết\r\n");
      out.write("\t\t\t\t\tchấp nhận mọi người, bữa tối là thời điểm quây quần, dạy con giao\r\n");
      out.write("\t\t\t\t\ttiếp tốt,...</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"news_item\">\r\n");
      out.write("\t\t\t<div id=\"hinhanh\">\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"img/image_hinhanh/donghanhcungcon/12006105_891015520934358_3337669638942998704_n.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"noidung_tomtat\">\r\n");
      out.write("\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t<h4>Hội thảo cha mẹ thấu hiểu và đồng hành cũng con. Rèn trí\r\n");
      out.write("\t\t\t\t\t\tluyện tài tạo dựng tương lai</h4>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<p>Con cái là tài sản lớn nhất của Bố Mẹ! Con cái cũng là điều\r\n");
      out.write("\t\t\t\t\tBố Mẹ bận tâm nhất,dành trọn trái tim và cả cuộc đời để chăm lo, để\r\n");
      out.write("\t\t\t\t\tdõi theo. Con dù lớn – vẫn là con của Bố mẹ. Nhưng để xây dựng một\r\n");
      out.write("\t\t\t\t\ttương lai tố đẹp cho con...</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"news_item\">\r\n");
      out.write("\t\t\t<div id=\"hinhanh\">\r\n");
      out.write("\t\t\t\t<img src=\"img/image_hinhanh/donghanhcungcon/qc3.jpg\".jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"noidung_tomtat\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><h4>Cùng con học tập cũng là một \"sự nghiệp\"</h4></a>\r\n");
      out.write("\t\t\t\t<p>Dạy con học gây không ít căng thẳng cho các bậc phụ huynh.\r\n");
      out.write("\t\t\t\t\tViệc này không hề đơn giản mà có thể coi là cả một \"sự nghiệp\" của\r\n");
      out.write("\t\t\t\t\tcác bậc làm cha, làm mẹ. Bên cạnh kiến thức còn đòi hỏi nhiều tình\r\n");
      out.write("\t\t\t\t\tyêu thương, sự kiên nhẫn và phương pháp khoa học.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<!-- het tin -->\r\n");
      out.write("\t\t<!---chuyển trang--->\r\n");
      out.write("\t\t<div id=\"xemthem\">\r\n");
      out.write("\t\t\t<button id=\"xemthem\" type=\"submit\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 100px; height: 40px; margin-top: -13px; margin-left: 343px;\">Xem\r\n");
      out.write("\t\t\t\tthêm</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!---hết chuyển trang--->\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
