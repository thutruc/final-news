<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta charset="utf-8">
<title>Đăng nhập</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style_formdn.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style_pagedif.css">
</head>

<body>
	<div id="dangnhap">
		<form id="form" action="" method="post">
			<input type="text" name="nameDN" maxlength="50" placeholder="Email"
				class="in"> <input type="password" name="pass"
				placeholder="Mật khẩu" class="in">

			<table>
				<tr>
					<td><a href="#">Quên mật khẩu?</a></td>
					<td><a href="#">Đăng ký</a></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="Đăng nhập"
						id="action"
						style="width: 75px; height: 30px; margin-left: 27px; margin-top: -6px"></td>
					<td><input type="button" name="cancel" value="Hủy" id="action"
						style="width: 67px; height: 30px; margin-left: -30px; margin-top: -6px"></td>
				</tr>

			</table>
		</form>

	</div>

</body>
</html>
