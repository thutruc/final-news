<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta charset="utf-8">
<title>Hồ sơ cá nhân</title>
<link rel="stylesheet" type="text/css" href="css/style_hososanhan.css" />
<style type="text/css">
</style>
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
</script>
</head>

<body>
	<div id="main">
		<h2 align="center">THÔNG TIN CÁ NHÂN</h2>

		<section>
			<input type="radio" name="form2" id="h5" class="input"> <label
				for="h5" class="label"><div class="ten">Email:</div>
				<div class="ten">bichthietnguyen93@gmail.com</div>
				<div class="sua">Chỉnh sửa</div> </label>
			<div class="content">
				<form>
					<table>
						<tr>
							<p>Email của thành viên đã được lưu vào hệ thống website</p>
						</tr>
						<tr>
							<p>Nếu có thay đổi xin,,,</p>
						</tr>
					</table>
				</form>
			</div>
		</section>
		<section>
			<input type="radio" name="form2" id="h6" checked class="input">
			<label for="h6" class="label"><div class="ten">Tên:</div>
				<div class="ten">Nguyễn Thị Bích Thiệt</div>
				<div class="sua">Chỉnh sửa</div> </label>
			<div class="content">
				<form id="form_doiten" method="post">
					<table>
						<tr>
							<td class="title">Nhập tên mới:</td>
							<td><input id="ip" name="tenmoi" type="text" size="40"
								class="ip" required style="margin-left: -63px;"></td>
						</tr>
					</table>
					<div style="margin-left: 20px; margin-top: 5px;">
						<input name="submit" type="submit" class="actiongui"
							value="Thay đổi"> <input name="cancel" type="reset"
							class="actionhuy" value="Hủy">
						<p style="margin-left: 285px; margin-top:-5px;">Thông báo lưu thành công!</p>
					</div>
				</form>
			</div>
		</section>
		<section>
			<input type="radio" name="form2" id="h7" class="input"> <label
				for="h7" class="label"><div class="ten">Mật khẩu:</div>
				<div class="ten">Cập nhật khoảng 2 tháng trước</div>
				<div class="sua">Chỉnh sửa</div> </label>
			<div class="content">
				<form id="form_doimatkhau" method="post" style="margin-top: 65px;">
					<table>
						<tr id="thongbao"></tr>
						<tr>
							<td class="title" id="mk_htai">Mật khẩu hiện tại<font
								style="color: #F00">*</font></td>
							<td><input id="matkhau" name="pass_hientai" type="password"
								size="40" class="ip" placeholder="Mật khẩu" required
								style="margin-left: -80px;"></td>
						</tr>
						<tr>
							<td class="title" id="mk_moi">Mật khẩu mới<font
								style="color: #F00">*</font></td>
							<td><input id="matkhau" name="pass_hientai" type="password"
								size="40" class="ip" placeholder="Mật khẩu" required
								style="margin-left: -80px;"></td>
						</tr>
						<tr>
							<td class="title">Xác nhận mật khẩu mới<font
								style="color: #F00">*</font></td>
							<td><input id="remk" name="re_pass" type="password"
								size="40" class="ip" placeholder="Nhập lại mật khẩu"
								required="required" style="margin-left: -80px;"
								onblur="checkmk()"></td>
						</tr>
					</table>

					<div style="margin-left: 36px; margin-top: 5px;">
						<input name="submit" type="submit" class="actiongui"
							value="Thay đổi"> <input name="cancel" type="reset"
							class="actionhuy" value="Hủy">
						<p style="margin-top: -13px; margin-left: 285px;">Thông báo
							lưu mật khẩu thành công!</p>
					</div>
				</form>
			</div>
		</section>

	</div>
	<!--end main-->
</body>
</html>
