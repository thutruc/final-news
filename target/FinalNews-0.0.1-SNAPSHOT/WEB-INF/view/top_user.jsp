<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>user</title>
<link rel="stylesheet" type="text/css" href="css/styleadmin.css">
<script src="jquery/jquery-1.7.2.min.js">
	
</script>
</head>
<body>

	<div id="quanly">
		<!-- start ql_tin -->
		<div id="ql_tin">
			<div id="text">Đăng nhập</div>
			<div id="formdangnhap" style="margin-left: 2px; margin-top: 10px;">
				<jsp:include page="formdangnhap.jsp"></jsp:include>
			</div>
		</div>
		<div id="ql_tin">
			<div id="text">Liên hệ</div>
			<div id="lienhe">
				<li>Email: bichthietnguyen93@gail.com</li>
				<li>Email: trucnguyen94@gmail.com</li>
			</div>
		</div>
	</div>
	<!-- end ql tin -->
	<div id="tindang">
		<!-- mặc định một ifram bên dưới cho khi user chưa đăng nhập hoặc đã đăng nhập-->
		<iframe width="100%" height="100%"
			src="https://www.youtube.com/embed/AsTUqE9wkGs" frameborder="0"
			allowfullscreen="" style="margin-right: 15px;"></iframe>
 
		<!-- mặc định một form đăng ký bên dưới khi người dùng chọn đăng ký -->
		 <%-- <jsp:include page="formdangky.jsp"></jsp:include> --%> 
	</div>

</body>
</html>
