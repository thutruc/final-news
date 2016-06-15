package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.news.model.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody.release();
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>admin</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/styletrangcon.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/ckfinder/ckfinder.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/ckeditor/ckeditor.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#quanly {\r\n");
      out.write("\t\r\n");
      out.write("\tclear: right;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 25%;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#tindang {\r\n");
      out.write("\twidth: 72%;\r\n");
      out.write("\tbackground-color:red ;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- start quanly -->\r\n");
      out.write("\t<div id=\"quanly\">\r\n");
      out.write("\t\r\n");
      out.write("\t <!-- start quan tri vien -->\r\n");
      out.write("    <div id=\"ql_tin\">\r\n");
      out.write("    <div id=\"text_qtri\" >Quản trị viên</div>\r\n");
      out.write("    <div id=\"qtrivien\">\r\n");
      out.write("    <li> Tên admin: Admin</li>\r\n");
      out.write("    <li><a href=\"#\">Hồ sơ cá nhân</a></li>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end quan tri vien -->\r\n");
      out.write("    \r\n");
      out.write("     <!-- start ql_tin -->\r\n");
      out.write("    <div id=\"ql_tin\">\r\n");
      out.write("    <div id=\"text\">Quản lý </div>\r\n");
      out.write("   <ul style=\"list-style-type:none\">\r\n");
      out.write("   <li> Quản lý tin\r\n");
      out.write("   <ul>\r\n");
      out.write("   <li><a href=\"#\">Đăng tin</a></li>\r\n");
      out.write("   <li><a href=\"#\">Xóa tin</a></li>\r\n");
      out.write("   <li><a href=\"#\">Sửa tin</a></li>\r\n");
      out.write("   </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("   <li> Quản lý chuyên mục \r\n");
      out.write("   <ul>\r\n");
      out.write("   <li><a href=\"#\">Thêm modul</a></li>\r\n");
      out.write("   <li><a href=\"#\">Xóa modul</a></li>\r\n");
      out.write("   <li><a href=\"#\">Sửa modul</a></li>\r\n");
      out.write("   </ul></li>\r\n");
      out.write("    \r\n");
      out.write("   <li> Quản lý  bình luận\r\n");
      out.write("   <ul>\r\n");
      out.write("   <li><a href=\"#\">Duyệt bình luận</a> </li>\r\n");
      out.write("   <li><a href=\"#\">Xóa bình luận</a></li>\r\n");
      out.write("   </ul></li>\r\n");
      out.write("    \r\n");
      out.write("   <li> <a href=\"#\" style=\"color: #000;text-decoration: none;\">Thống kê số lượt truy cập</a></li>\r\n");
      out.write("   <li> <a href=\"#\"style=\"color: #000;text-decoration: none;\">Trả lời câu hỏi</a></li>\r\n");
      out.write("   </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end ql tin -->\r\n");
      out.write("   \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end quanly -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- start tindang -->\r\n");
      out.write("\t<div id=\"tindang\">\r\n");
      out.write("\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end tindang -->\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/view/admin.jsp(83,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/addNews", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/admin.jsp(83,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/view/admin.jsp(83,1) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("new");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t <input type=\"submit\" value=\"Lưu\"/>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/admin.jsp(84,1) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("content");
    // /WEB-INF/view/admin.jsp(84,1) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "class", new String("ckeditor"));
    // /WEB-INF/view/admin.jsp(84,1) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setId("editor1");
    // /WEB-INF/view/admin.jsp(84,1) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "name", new String("editor1"));
    // /WEB-INF/view/admin.jsp(84,1) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setRows("33");
    // /WEB-INF/view/admin.jsp(84,1) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setCols("136");
    int[] _jspx_push_body_count_form_005ftextarea_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f0 = _jspx_th_form_005ftextarea_005f0.doStartTag();
      if (_jspx_th_form_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }
}
