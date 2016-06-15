<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>web tin giáo dục</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

<link rel="stylesheet" type="text/css" href="css/style_trangcon.css">
<script src="jquery/jquery-1.7.2.min.js">
	
</script>
</head>

<body>
	<div id="container">
		<div id="header">
			<div id="logo"></div>
			<div id="slogan"></div>
		</div>
		<!-- menu -->
		<div id="menu">
			<div id="trangchu">
				<div id="icon_home"></div>
				<span>Trang chủ</span>
			</div>
			<div id="menu_item">Hướng ngiệp</div>
			<div id="menu_item">Góc nhìn chuyên gia</div>
			<div id="menu_item">Tâm lý</div>
			<div id="menu_item">Đồng hành cùng con</div>
			<div id="login">
				<a href="#" >Đăng nhập</a>
			</div>
		</div>
		<!-- end menu-->

		<div class="search_bar">
			<div class="text_run">
				<marquee> Giáo dục - ươm mầm tri thức Việt! </marquee>
			</div>
			<div class="NavigatorBoxSearch">

				<input type="hidden" value="013319808617213044252:4shogcrnrhu"
					name="cx"> <input type="hidden" value="UTF-8" name="ie">

				<input type="text" name="Search"
					onKeyPress="return trapEnterKey(event)" id="txtSearch"
					class="inputSearch"> <input type="submit" value="GO"
					class="submit" id="searchsubmit" style="display: none"> <a
					href="#" name="btnSearch" id="btnSearch" class="inputSearchheader"
					onClick="aSearch()"> Tìm kiếm</a>
				<script type="text/javascript">
					function gotosearch() {
						window.location.href = 'http://www.google.com/cse?cx=013319808617213044252:4shogcrnrhu&ie=UTF-8&q=abc#gsc.tab=0&gsc.q='
								+ $("#txtSearch").val() + '&gsc.page=1';
					}
				</script>
			</div>
		</div>


		<div id="center">
			<div id="toptin">
				<%-- <jsp:include page="admin/viduhoso_admin.jsp"></jsp:include> --%>
				<jsp:include page="admin.jsp"></jsp:include>
			</div>
			<!--end muc_admin nếu có-->
			<div id="bangtin_chinh">
				<!-- tin liên quan-->
				<div id="tin_lienquan">
					<jsp:include page="listtin_chuyenmuc.jsp"></jsp:include>
				</div>
				<!--end tin liên quan-->
				<!--midle2_rights-->
				<div id="midle2_rights">
					<div id="midle2_radio">

						<div class="tendanhmuc"
							style="width: 200px; margin-left: -2px; margin-top: -54px;">
							<div class="imgdanhmuc" style="margin-left: 16px;"></div>
							<h5 style="margin-left: 18px;">RADIO</h5>
						</div>

						<div id="listradio">
							<div id="playradio">
								<audio src="img/mp3/giaoduc120215.mp3" controls
									style="width: 186px; margin-left: 1px;" />
							</div>
							<marquee>
								<div id="noidung_play">
									<strong style="font-size: 18px; color: #ffffff;">
										Radio đang phát - Tư vấn chọn trường học Tiếng Anh</strong>
								</div>

							</marquee>
							<!--link MP3-->

							<%
								for (int i = 0; i < 3; i++) {
							%>
							<div id="itemradio">
								<a href="#" style="color: #000; font-weight: bold;">Tư vấn
									du học</a>
							</div>
							</br>
							<%
								}
							%>
						</div>
					</div>
					<!--end midle2_radio-->
					<!--2 banner quảng cáo-->
					<div id="quangcao">
						<a href="#"><img src="img/image_hinhanh/qc1.jpg"></a>
					</div>
					<div id="quangcao">
						<a href="#"><img src="img/image_hinhanh/qc2.jpg"></a>
					</div>
					<!--end 2 banner quảng cáo-->
				</div>
				<!--end midle2_rights-->
			</div>
			<!--end center-->
		</div>
		<!--end bangtin_chinh-->
		<!--footer-->
		<div id="footer">
			<div class="footer1" style="margin-top: 45px;">
				<img src="img/image_interface/templatemo_menu_hover2.png"> <img
					src="img/image_interface/templatemo_menu_hover.png"> <img
					src="img/image_interface/gmail.png"
					style="margin-top: -7px; width: 55px; height: 56px; float: left; clear: right;">
				<img src="img/image_interface/face.png"
					style="width: 40px; height: 40px; float: left; clear: right;">
				<img src="img/image_interface/tw.png"
					style="width: 44px; height: 44px; float: left; clear: right; margin-top: -2px; margin-left: 3px;">
			</div>
			<div class="footer1"
				style="width: 35%; text-align: left; font-size: 0px;">
				<p style="font-size: 14px;">© Địa chỉ liên hệ: Lạc Tánh-Tánh
					Linh- Bình Thuận</p>
				</br>
				<p style="margin-left: 17px; font-size: 14px;">Số điện thoại:
					(0623)880 924</p>
				</br>
				<p style="margin-left: 17px; font-size: 14px;">Email:
					bichthietnguyen93@gmail.com</p>
				</br>
				<p style="margin-left: 17px; font-size: 14px;">Hotline:
					0962968534</p>
			</div>
			<div class="footer1">
				<p style="color: #032730; font-size: 20px;">Chịu trách nhiệm bài
					viết:</p>
				<p style="font-size: 14px;">Nguyễn Thị Bích Thiệt</p>
				<p style="font-size: 14px;">Nguyễn Thị Thu Trúc</p>
				<p style="font-size: 14px;">Đỗ Thị Thu Thủy</p>
			</div>
		</div>
		<!--kết thúc footer-->
		<!--gotop -->
		<div id="go_top" title="Go top" style="display: block;">
			<a href="#" id="go_top" style="display: inline;"> </a>
		</div>
		<script type="text/javascript">
			(function() {
				// Ẩn hiện icon go-top
				$(window).scroll(function() {
					if ($(window).scrollTop() == 0) {
						$('#go_top').stop(false, true).fadeOut(600);
					} else {
						$('#go_top').stop(false, true).fadeIn(600);
					}
				});

				// Cuộn trang lên với scrollTop
				$('#go_top').click(function() {
					$('body,html').animate({
						scrollTop : 0
					}, 400);
					return false;
				});
			})(jQuery);
		</script>
		<!--end gotop -->
	</div>
	<script src="css/dist/jQuery-2.1.4.min.js"></script>
	<!-- <script src="css/dist/bootstrap.min.js" type="text/javascript"></script> -->
	<script src="css/dist/app.min.js" type="text/javascript"></script>

</body>
</html>
