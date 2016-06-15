<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Đăng ký</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style_pagedif.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style_form.css">
<!-- start xuly thong tin dang ky-->
<script type="text/javascript">
	function checkmk() {
		$.get("XuLy?pass=" + $("#matkhau").val() + "&re_pass="
				+ $("#remk").val(), function(data, status) {
			if (data.indexOf("true") != -1) {
				$("#thongbao").html("Mật khẩu nhập lại không khớp");
				$("#thongbao").css("color", "red");
			} else {
				$("#thongbao").html(" ");
				$("#thongbao").css("color", "red");

			}
		});
	}
	function checkmail() {
		$.get("XuLyMail?email=" + $("#email").val(), function(data, status) {
			if (data.indexOf("tontai") != -1) {
				$("#thongbao").html("Mail đã tồn tại");
				$("#thongbao").css("color", "red");
			}
		});
	}
	function cancel() {
		window.location.replace("http://google.com");
	}
</script>
<script type="text/javascript">
	randomCaptcha();
	function randomCaptcha() {
		var a = Math.ceil(Math.random() * 10);
		var b = Math.ceil(Math.random() * 10);
		var c = a + b;
		$(".hd_result").val(c + "");
		$("body div").find(".capt_cha").html(a + " + " + b);
	}
</script>
<!-- end xuly thong tin dang ky -->
</head>
<body>
	<!-- <div id="center"> -->
	<!--form  action="#" method="post">
  <div id="Dk_title">
  <div id="text">ĐĂNG KÝ</div>
  <div id="email">Email: <input id="input" name="email" type="email" size="35px"  placeholder="xxx@gmail.com"/></div>
  <div id="email">Tên: <input id="input" name="name" type="text" size="35px"  placeholder="Nguyen Van A"/></div>
  </div>
  
  
     </form-->
	<!--start form dang ky -->
	<form id="formdangky" method="post">
		<h2 align="center">THÔNG TIN ĐĂNG KÝ</h2>
		<hr/>
		<table>
			<tr id="thongbao"></tr>
			<tr>
				<td class="title">Email đăng nhập<font style="color: #F00">*</font></td>
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
				<td class="title">Nhập lại mật khẩu<font style="color: #F00">*</font></td>
				<td><input id="remk" name="re_pass" type="password" size="40"
					class="ip" placeholder="Nhập lại mật khẩu" required="required"
					onblur="checkmk()"></td>
			</tr>
			<!--tr>
								<td class="title">Giới tính</td>
								<td><input type="radio" name="sex" value="Nam" checked>Nam<input type="radio" name="sex" value="Nữ">Nữ</td>
							</tr-->
			<tr>
				<td class="title">Họ và tên<font style="color: #F00">*</font></td>
				<td><input name="hoten" type="text" size="40" class="ip"
					placeholder="Họ và tên" required></td>
			</tr>

			<!--tr>
								<td class="title">Địa chỉ<font style="color: #F00">*</font></td>
								<td><input name="diachi" type="text" id="textfield"
									size="40" class="ip" placeholder="Địa chỉ nhà"
									required="required"></td>
							</tr-->
			<!--tr>
								<td class="title">Số điện thoại</td>
								<td><input type="tel" name="sdt" size="40" class="ip"
									placeholder="Mẫu: 0123456789" 
	       required size="50" pattern="([0-9]{1}([0-9]{3})([0-9]{3})([0-9]{3,4}))"></td>
							</tr-->
			<!--tr>
								<td class="title">Ngày sinh</td>
								<td><input type="date" name="ngaySinh" class="ip"
									required="required"></td>
							</tr-->
			<tr>
				<td class="title">Mã kiểm tra:</td>

				<td class="capt_cha"></td>
			</tr>
			<tr>
				<td class="title">Nhập mã kiểm tra:</td>
				<td><input name="macaptcha" type="text" size="40" class="ip"
					placeholder="Nhập mã kiểm tra tại đây!" required></td>
			</tr>
			<tr>
			</tr>
		</table>

		<div style="margin: auto;">
			<input name="submit" type="submit" class="actiongui" value="Đăng ký">
			<input type="reset" name="cancel" value="Hủy" class="actionhuy">
		</div>
	</form>
	<!-- end form dang ky -->
	<!-- </div> -->

</body>
</html>