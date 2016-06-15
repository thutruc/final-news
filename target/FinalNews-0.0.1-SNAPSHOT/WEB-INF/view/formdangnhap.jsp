<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta charset="utf-8">
<title>Đăng nhập</title>
<%-- <link
	href="${pageContext.request.contextPath}/resources/css/style_dangnhap.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/resources/css/style_formdn.css"
	rel="stylesheet" type="text/css">
 --%>
<!-- <link href="css/style_dangnhap.css" rel="stylesheet" type="text/css">
<link href="css/style_formdn.css" rel="stylesheet" type="text/css"> -->
<style type="text/css">
#form {
	background-color: #F3F3F3;
    width: 250px;
    margin: auto;
    margin-top: 3px;
    border: thin solid #F3F3F3;
    border-radius: 10px;
    height: 185px;}

#form input {
	font-family: "Times New Roman", Times, serif;
	border-radius: 5px;
	width: 210px;
	margin-top: 15px;
	height: 23px;
	margin-left: 7%;
}

#form table {
	margin: auto;
	border-spacing: 20px;
	margin-bottom: -80px;
	display: table;
	border-collapse: separate;
	width: 250px;
	border-spacing: 20px;
	margin-bottom: -80px;
	display: table;
	border-collapse: separate;
}

#form input.in:HOVER {
	transition: width 1s ease;
	width: 220px;
	color: blue;
	box-shadow: 1px 1px 15px #0099ff;
}

#form a {
	color: #0000C8;
	text-decoration: none;
}

#form a:hover {
	color: RED;
}

#form input #action {
	background: #DDEAF3;
	font-size: 14px;
}

#form input #action:HOVER {
	box-shadow: 1px 1px 10px #0099ff;
	background-color: #DDEAF3;
}
</style>
</head>

<body>

	<form id="form" action="" method="post">
		<input type="text" name="nameDN" maxlength="50" placeholder="Email"
			class="in"> <input type="password" name="pass"
			placeholder="Mật khẩu" class="in">

		<table>
			<tr>
				<%-- <td><a target="_blank"
					href="${pageContext.request.contextPath}/dangky"> Đăng ký</a></td> --%>
				<td><a href="#">Quên mật khẩu?</a></td>
				<td><a href="#">Đăng ký</a></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Đăng nhập" id="action"
					style="width: 75px; height: 30px; margin-left: 27px; margin-top: -6px"></td>
				<td><input type="button" name="cancel" value="Hủy"
					id="action"
					style="width: 67px; height: 30px; margin-left: -30px; margin-top: -6px"></td>
			</tr>

		</table>
	</form>



</body>
</html>
