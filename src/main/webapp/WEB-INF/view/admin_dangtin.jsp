<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="edu.news.model.*"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>admin- đăng tin</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/styleadmin.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style_dangtin.css">
<script src="jquery/jquery-1.7.2.min.js"></script>
<!-- databpicker -->
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script
src="${pageContext.request.contextPath}/resources/ckeditor/ckeditor.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/ckfider/ckfinder.js"
	type="text/javascript"></script>
	<!-- integrate datepiker -->
<script>
  $(document).ready(function() {
    $("#datepicker").datepicker();
  });
  </script>
<!-- css cho button của vùng textarea -->
<style type="text/css">
#form #button input .action {
	background: #DDEAF3;
	font-size: 14px;
}

#form #button input .action:HOVER {
	box-shadow: 1px 1px 10px #0099ff;
	background-color: #DDEAF3;
}
</style>
</head>

<body>

	<div id="quanly">
		<!-- start quan tri vien -->
		<div id="ql_tin">
			<div id="text_qtri">Quản trị viên</div>
			<div id="qtrivien">
				<li>Tên admin: Admin</li>
				<li><a href="#"">Hồ sơ cá nhân</a></li>
			</div>

		</div>
		<!-- end quan tri vien -->

		<!-- start ql_tin -->
		<div id="ql_tin">
			<div id="text">Quản lý</div>
			<ul style="list-style-type: none">
				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/icontin.png">
					<ul>
						<li><a href="#">Quản lý tin tức</a></li>
					</ul></li>
				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/chuyenmucicon.png">
					<ul>
						<li><a href="#">Quản lý danh mục</a></li>
					</ul></li>

				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/commenticon.png">
					<ul>
						<li><a href="#">Quản lý bình luận</a></li>
					</ul></li>
				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/avataradmin.png">
					<ul>
						<!-- ds chứa thêm xóa sửa -->
						<li><a href="#">Quản lý người dùng</a></li>
					</ul></li>
				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/cauhoiicon.png">
					<ul>
						<li><a href="#">Quản lý hỏi đáp</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	<!-- end ql tin -->
	<div id="tindang">
		<!-- ckeditor+ ckfider -->
		<div>
			<form:form action="${pageContext.request.contextPath}/addNews"
				method="post" modelAttribute="news">
				<h2 style="text-align: center;">ĐĂNG TIN</h2>

				<!-- ---------- -->
				<div id="input_tin" style="margin-bottom: 10px;">
					<label>Tiêu đề:</label>
					<form:input path="title" type="text" name="title" value=""
						required="required" style="width: 92%;" />
					<label>Loại tin:</label>
					<form:input path="type" type="text" name="title" value=""
						required="required" style="width: 150px; margin-right: 70px;" />
					<label style="margin-left: 70px;">Hình ảnh:</label>
					<form:input path="img" type="text" name="image" value=""
						required="required" style="width: 150px; margin-right: 70px;" />
					<label style="margin-left: 90px;">Ngày đăng:</label>
					<form:input path="date" type="text" name="image" value=""
						required="required" style="width: 100px;" id="datepicker" />
				</div>
				<!-- -------------- -->
				<form:textarea path="content" class="ckeditor" id='editor1'
					name="editor1" rows="33" cols="136"
					style="width: 100%; height: 100%;" />

				<!-- button xự kiện -->

				<div id="button">
					<a href=""><img alt=""
						src="${pageContext.request.contextPath}/resources/img/image_interface/backicon.png"
						style="width: 25px; height: 25px;"></a> <input name="submit"
						type="submit" class="action" value="Đăng tin"> <input
						type="reset" name="cancel" value="Hủy" class="action">
				</div>
				<!--end button xự kiện -->
			</form:form>
		</div>
		<!-- het form cke & ckf -->
	</div>
	<!-- hết phần tin đăng// phần quản lý nội dung của admin -->

</body>
</html>
