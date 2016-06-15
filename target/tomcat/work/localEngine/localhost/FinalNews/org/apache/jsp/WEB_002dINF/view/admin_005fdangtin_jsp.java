package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.news.model.*;

public final class admin_005fdangtin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>admin- đăng tin</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/styleadmin.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style_dangtin.css\">\r\n");
      out.write("<script src=\"jquery/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/ckeditor/ckeditor.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/ckfider/ckfinder.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  $(document).ready(function() {\r\n");
      out.write("    $(\"#datepicker\").datepicker();\r\n");
      out.write("  });\r\n");
      out.write("  </script>\r\n");
      out.write("<!-- css cho button của vùng textarea -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#form #button input .action {\r\n");
      out.write("\tbackground: #DDEAF3;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#form #button input .action:HOVER {\r\n");
      out.write("\tbox-shadow: 1px 1px 10px #0099ff;\r\n");
      out.write("\tbackground-color: #DDEAF3;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"quanly\">\r\n");
      out.write("\t\t<!-- start quan tri vien -->\r\n");
      out.write("\t\t<div id=\"ql_tin\">\r\n");
      out.write("\t\t\t<div id=\"text_qtri\">Quản trị viên</div>\r\n");
      out.write("\t\t\t<div id=\"qtrivien\">\r\n");
      out.write("\t\t\t\t<li>Tên admin: Admin</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"\">Hồ sơ cá nhân</a></li>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end quan tri vien -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- start ql_tin -->\r\n");
      out.write("\t\t<div id=\"ql_tin\">\r\n");
      out.write("\t\t\t<div id=\"text\">Quản lý</div>\r\n");
      out.write("\t\t\t<ul style=\"list-style-type: none\">\r\n");
      out.write("\t\t\t\t<li><img alt=\"\" style=\"width: 23px; height: 25px;\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/icontin.png\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Quản lý tin tức</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><img alt=\"\" style=\"width: 23px; height: 25px;\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/chuyenmucicon.png\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Quản lý danh mục</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><img alt=\"\" style=\"width: 23px; height: 25px;\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/commenticon.png\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Quản lý bình luận</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><img alt=\"\" style=\"width: 23px; height: 25px;\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/avataradmin.png\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<!-- ds chứa thêm xóa sửa -->\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Quản lý người dùng</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><img alt=\"\" style=\"width: 23px; height: 25px;\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/image_interface/cauhoiicon.png\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Quản lý hỏi đáp</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end ql tin -->\r\n");
      out.write("\t<div id=\"tindang\">\r\n");
      out.write("\t\t<!-- ckeditor+ ckfider -->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- het form cke & ckf -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- hết phần tin đăng// phần quản lý nội dung của admin -->\r\n");
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
    // /WEB-INF/view/admin_dangtin.jsp(95,3) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/addNews", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/admin_dangtin.jsp(95,3) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/view/admin_dangtin.jsp(95,3) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("news");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<h2 style=\"text-align: center;\">ĐĂNG TIN</h2>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<!-- ---------- -->\r\n");
          out.write("\t\t\t\t<div id=\"input_tin\" style=\"margin-bottom: 10px;\">\r\n");
          out.write("\t\t\t\t\t<label>Tiêu đề:</label>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t<label>Loại tin:</label>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t<label style=\"margin-left: 70px;\">Hình ảnh:</label>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t<label style=\"margin-left: 90px;\">Ngày đăng:</label>\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<!-- -------------- -->\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<!-- button xự kiện -->\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<div id=\"button\">\r\n");
          out.write("\t\t\t\t\t<a href=\"\"><img alt=\"\"\r\n");
          out.write("\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/resources/img/image_interface/backicon.png\"\r\n");
          out.write("\t\t\t\t\t\tstyle=\"width: 25px; height: 25px;\"></a> <input name=\"submit\"\r\n");
          out.write("\t\t\t\t\t\ttype=\"submit\" class=\"action\" value=\"Đăng tin\"> <input\r\n");
          out.write("\t\t\t\t\t\ttype=\"reset\" name=\"cancel\" value=\"Hủy\" class=\"action\">\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<!--end button xự kiện -->\r\n");
          out.write("\t\t\t");
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

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/admin_dangtin.jsp(102,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("title");
    // /WEB-INF/view/admin_dangtin.jsp(102,5) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/view/admin_dangtin.jsp(102,5) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", new String("title"));
    // /WEB-INF/view/admin_dangtin.jsp(102,5) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "value", new String(""));
    // /WEB-INF/view/admin_dangtin.jsp(102,5) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "required", new String("required"));
    // /WEB-INF/view/admin_dangtin.jsp(102,5) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "style", new String("width: 92%;"));
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/admin_dangtin.jsp(105,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("type");
    // /WEB-INF/view/admin_dangtin.jsp(105,5) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/view/admin_dangtin.jsp(105,5) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "name", new String("title"));
    // /WEB-INF/view/admin_dangtin.jsp(105,5) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "value", new String(""));
    // /WEB-INF/view/admin_dangtin.jsp(105,5) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "required", new String("required"));
    // /WEB-INF/view/admin_dangtin.jsp(105,5) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "style", new String("width: 150px; margin-right: 70px;"));
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/admin_dangtin.jsp(108,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("img");
    // /WEB-INF/view/admin_dangtin.jsp(108,5) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/view/admin_dangtin.jsp(108,5) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "name", new String("image"));
    // /WEB-INF/view/admin_dangtin.jsp(108,5) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "value", new String(""));
    // /WEB-INF/view/admin_dangtin.jsp(108,5) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "required", new String("required"));
    // /WEB-INF/view/admin_dangtin.jsp(108,5) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "style", new String("width: 150px; margin-right: 70px;"));
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fid_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/admin_dangtin.jsp(111,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setPath("date");
    // /WEB-INF/view/admin_dangtin.jsp(111,5) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/view/admin_dangtin.jsp(111,5) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "name", new String("image"));
    // /WEB-INF/view/admin_dangtin.jsp(111,5) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "value", new String(""));
    // /WEB-INF/view/admin_dangtin.jsp(111,5) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "required", new String("required"));
    // /WEB-INF/view/admin_dangtin.jsp(111,5) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "style", new String("width: 100px;"));
    // /WEB-INF/view/admin_dangtin.jsp(111,5) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setId("datepicker");
    int[] _jspx_push_body_count_form_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f3 = _jspx_th_form_005finput_005f3.doStartTag();
      if (_jspx_th_form_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005ftype_005fstyle_005frequired_005fpath_005fname_005fid_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/admin_dangtin.jsp(115,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("content");
    // /WEB-INF/view/admin_dangtin.jsp(115,4) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "class", new String("ckeditor"));
    // /WEB-INF/view/admin_dangtin.jsp(115,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setId("editor1");
    // /WEB-INF/view/admin_dangtin.jsp(115,4) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "name", new String("editor1"));
    // /WEB-INF/view/admin_dangtin.jsp(115,4) name = rows type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setRows("33");
    // /WEB-INF/view/admin_dangtin.jsp(115,4) name = cols type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setCols("136");
    // /WEB-INF/view/admin_dangtin.jsp(115,4) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "style", new String("width: 100%; height: 100%;"));
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
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fstyle_005frows_005fpath_005fname_005fid_005fcols_005fclass_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }
}
