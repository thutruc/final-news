<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>đăng nhập</title>
<link href="${pageContext.request.contextPath}/resources/css/style_dangnhap.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/style_formdn.css" rel="stylesheet" type="text/css">
</head>

<body>
	<form id="form" action="XuLyDangNhap" method="post">
		<div id="bth">
			<h2>Đăng nhập</h2>
		</div>


		<table>
			<tr>
				<td width="173" id="left">Email</td>
				<td width="200"><input type="text" name="nameDN" maxlength="50"
					placeholder="Email đăng nhập" class="in"></td>
			</tr>
			<tr>
				<td id="left">Mật khẩu</td>
				<td><input type="password" name="pass" placeholder="Mật khẩu"
					class="in"></td>
			</tr>



			<td colspan="2"><a target="_blank"
				href="${pageContext.request.contextPath}/dangky"> Đăng ký</a><a
				href="#">Quên mật khẩu?</a></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit" value="OK" id="action"></td>
				<td><input type="button" name="cancel" value="Cancel"
					id="action"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td></td>
			</tr>
		</table>

	</form>
</body>
</html>
