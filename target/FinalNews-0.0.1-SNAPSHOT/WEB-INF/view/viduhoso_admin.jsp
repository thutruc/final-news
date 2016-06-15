<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>admin 2</title>
<link rel="stylesheet" type="text/css" href="css/styleadmin.css">
<script src="jquery/jquery-1.7.2.min.js">
</script>
<script language="javascript" src="ckeditor/ckeditor.js" type="text/javascript"></script>
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
				<li>Quản lý tin
					<ul>
						<li><a href="#">Đăng tin</a></li>
						<li><a href="#">Xóa tin</a></li>
						<li><a href="#">Sửa tin</a></li>
					</ul>
				</li>
				<li>Quản lý chuyên mục
					<ul>
						<li><a href="#">Thêm modul</a></li>
						<li><a href="#">Xóa modul</a></li>
						<li><a href="#">Sửa modul</a></li>
					</ul>
				</li>

				<li>Quản lý bình luận
					<ul>
						<li><a href="#">Duyệt bình luận</a></li>
						<li><a href="#">Xóa bình luận</a></li>
					</ul>
				</li>

				<li><a href="#"
					style="font-weight: bold; color: #000; text-decoration: none;">Thống
						kê số lượt truy cập</a></li>
				<li><a href="#"
					style="font-weight: bold; color: #000; text-decoration: none;">Trả
						lời câu hỏi</a></li>
			</ul>
		</div>
		<!-- end ql tin -->
	</div>
	<div id="tindang">
		<!-- thay textarea bằng table thông tin khi admin chọn hồ sơ người quản trị
	hoặc mục thống kê số lượng truy cập -->
	
	
	<jsp:include page="${pageContext.request.contextPath}/hoso_canhan.jsp"></jsp:include> 
	</div>


</body>
</html>
