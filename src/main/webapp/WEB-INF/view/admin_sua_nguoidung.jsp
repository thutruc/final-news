
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>admin- thông tin người dùng</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styleadmin.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style_suathongtinuser.css">
<script src="jquery/jquery-1.7.2.min.js">
	
</script>
<script src="ckeditor/ckeditor.js" type="text/javascript"></script>
<script src="ckfider/ckfinder.js" type="text/javascript"></script>

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
		<div>
			<form id=form action="sua_user" method="post">
				<h2 style="text-align: center;">THÔNG TIN NGƯỜI DÙNG</h2>
				<table>
					<tr>
						<td class="title">Email<font style="color: #F00">*</font></td>
						<td><input id="email" name="email" type="email" size="40"
							class="ip" placeholder="Email đăng nhập" required
							onblur="checkmail()"></td>
					</tr>
					<tr>
						<td class="title" id="mk">Mật khẩu<font style="color: #F00">*</font></td>
						<td><input id="matkhau" name="pass" type="password" size="40"
							class="ip" placeholder="Mật khẩu" required></td>
					</tr>
					<tr>
						<td class="title" id="role">Phân quyền<font
							style="color: #F00">*</font></td>
						<td><input id="role" name="role" type="text" size="40"
							class="ip" required></td>
					</tr>
				</table>
				<!-- button xự kiện -->

				<div id="button">
					<a href=""><img alt="" src="${pageContext.request.contextPath}/resources/img/image_interface/backicon.png"
						style="width: 25px; height: 25px; margin-right: 10px;"></a> <input
						name="submit" type="submit" class="action" value="Chỉnh sửa">
					<input type="reset" name="cancel" value="Hủy" class="action">
				</div>
				<!--end button xự kiện -->
			</form>
		</div>
	</div>
	<!-- hết phần tin đăng// phần quản lý nội dung của admin -->

</body>
</html>
