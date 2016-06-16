<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>web tin giáo dục</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style_trangcon.css">
<script src="${pageContext.request.contextPath}/resources/jquery/jquery-1.7.2.min.js">
	
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
				<a href="#">Đăng nhập</a>
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
			<div id="toptin" style="height: 300px;">
				<div id="videomain">
					<video height="240" width="100%" controls
						style="background: black; margin-bottom: 8px;">
						<source src="${pageContext.request.contextPath}/resources/img/video/quychethiVNOTV.mp4" type="video/mp4">
					</video>
					<h4>Quy chế thi đại học, cao đẳng năm 2016</h4>
				</div>

				<div id="blogtin">
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016 Tin tuyển sinh quốc
							gia 2016 Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016 </a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
					<p>
						<a href="">Tin tuyển sinh quốc gia 2016</a>
					</p>
					<hr />
				</div>
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
								<audio src="${pageContext.request.contextPath}/resources/img/mp3/giaoduc120215.mp3" controls
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
						<a href="#"><img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/qc1.jpg"></a>
					</div>
					<div id="quangcao">
						<a href="#"><img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/qc2.jpg"></a>
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
			<div class="footer1">
				<form id="form_datcauhoi" action="" method="post">
					<img alt="" src="${pageContext.request.contextPath}/resources/img/image_interface/iconthu.png"
						style="width: 40px; height: 40px; float: left; margin: 0px 0 -26px 10px;">
					<p style="margin-bottom: -16px; text-align: center;">Hộp thư tư
						vấn</p>
					<input type="text" name="email" maxlength="50" placeholder="Email"
						class="in">
					<textarea id="noidung" rows="33" cols="136"
						placeholder="Nội dung câu hỏi"
						style="width: 83%; height: 55%; margin-top: 5px; margin-left: 18px;"></textarea>

					<table>
						<tr>
							<td><input type="submit" name="submit" value="Gửi"
								id="action" style="width: 50px; margin-top: -6px;"></td>
						</tr>

					</table>
				</form>
			</div>
			<div class="footer1"
				style="width: 48%; text-align: left; font-size: 13px;">
				<div style="width: 100%; height: 40px; color: #860f55;">
					<a href="" style="color: #027087; font-weight: bold;">Trang
						chủ&nbsp;</a> | &nbsp;<a href=""
						style="color: #027087; font-weight: bold;">Hướng nghiệp</a>&nbsp;
					| &nbsp;<a href="" style="color: #027087; font-weight: bold;">Góc
						nhìn chuyên gia</a>&nbsp; | &nbsp;<a href=""
						style="color: #027087; font-weight: bold;">Tâm lý</a>&nbsp; |
					&nbsp;<a href="" style="color: #027087; font-weight: bold;">Đồng
						hành cùng con</a>
				</div>
				<p style="font-size: 13px;">© Địa chỉ liên hệ: Lạc Tánh-Tánh
					Linh- Bình Thuận</p>
				<p style="margin-left: 17px; font-size: 13px;">Số điện thoại:
					(0623)880 924</p>
				<p style="margin-left: 17px; font-size: 13px;">Email:
					bichthietnguyen93@gmail.com</p>
				<p style="margin-left: 17px; font-size: 13px;">Hotline:
					0962968534</p>
			</div>
			<div class="footer1">
				<p style="color: #032730; font-size: 15px; margin-top: -5px;">CHỊU
					TRÁCH NHIỆM BÀI VIẾT:</p>
				<p style="font-size: 14px;">Nguyễn Thị Bích Thiệt</p>
				<p style="font-size: 14px;">Nguyễn Thị Thu Trúc</p>
				<p style="font-size: 14px;">Đỗ Thị Thu Thủy</p>
				<img src="${pageContext.request.contextPath}/resources/img/image_interface/templatemo_menu_hover2.png"
					style="width: 25px; height: 25px;"> <img
					src="${pageContext.request.contextPath}/resources/img/image_interface/templatemo_menu_hover.png"
					style="width: 30px; height: 25px;">

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
				})
			})(jQuery);
		</script>
		<!--end gotop -->
	</div>

</body>
</html>
