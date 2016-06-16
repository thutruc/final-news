<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>web tin giáo dục</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<script src="${pageContext.request.contextPath}/resources/jquery/jquery-1.7.2.min.js">
	
</script>
</head>
<!-- tham khảo chèn video http://www.yan.vn/ly-nha-ky-long-lay-truoc-gio-chia-tay-tham-do-cannes-92817.html -->
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
			<div id="menu_item">Hướng nghiệp</div>
			<div id="menu_item">Góc nhìn chuyên gia</div>
			<div id="menu_item">Tâm lý</div>
			<div id="menu_item">Đồng hành cùng con</div>
			<div id="login">
				<a href="http://localhost:8080/WebTinGiaoDuc/trangcon_user.jsp">Đăng
					nhập</a>
			</div>
		</div>
		<!-- end menu-->

		<div class="search_bar">
			<div class="text_run">
				<marquee> Giáo dục - ươm mầm tri thức Việt </marquee>
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
			<!--top left-->
			<div id="top">
				<div id="item_topimag">
					<div class="title">
						<h2>Tin mới đăng</h2>
					</div>
					<div id="imag">
						<a a href="#"><img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/trangchu/duhoc1.jpg"
							style="width: 340px; height: 260px;"></a>
					</div>
					<div id="top_content">
						<h4 style="margin-top: 0px;">Người Việt đến Nhật du học tăng
							mạnh</h4>
						<div id="tomtat_tin">
							<p>Vừa được Tổ chức Hỗ trợ sinh viên Nhật Bản (JASSO) công
								bố, cho thấy lượng học viên, sinh viên Việt đứng thứ 2 về du học
								sinh ở Nhật, chỉ sau Trung Quốc (94.111, gần như không thay đổi
								so với năm trước), theo Kyodo News. Số liệu trên cho thấy số du
								học sinh Việt tại Nhật lần đầu tiên vượt qua con số tương ứng ở
								Mỹ... Vừa được Tổ chức Hỗ trợ sinh viên Nhật Bản (JASSO) công
								bố, cho thấy lượng học viên, sinh viên Việt đứng thứ 2 về du học
								Vừa được Tổ chức Hỗ trợ sinh viên Nhật Bản (JASSO) công bố, cho
								thấy lượng học viên, sinh viên Việt đứng thứ 2 về du học.</p>
						</div>

						<div class="readmore">
							<a href="tinchitiet.jsp"><strong>Read more</strong></a>
						</div>
					</div>
				</div>

				<!--end top left-->
			</div>

			<!--midle1-->
			<div id="midle1">
				<div id="blognews">
					<div id="newitem">
						<div id="image_item">
							<img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/trangchu/grid/tuvan.jpg"
								style="width: 190px; height: 125px;">
						</div>
						<div id="text_item">
							<a href="#"><p>Tư vấn truyền hình trực tuyến: Nộp hồ sơ
									để trúng tuyển ngay nguyện vọng 1</p></a>
						</div>
					</div>

					<!---2 item khÃ¡c-->
					<div id="newitem">
						<div id="image_item">
							<img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/trangchu/grid/thi1.jpg"
								style="width: 190px; height: 125px;">
						</div>
						<div id="text_item">
							<a href="#"><p>Học nghề, đường đời rộng mở </p></a>
						</div>
					</div>
					<%
						for (int i = 0; i < 3; i++) {
					%>
					<div id="newitem">
						<div id="image_item">
							<img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/trangchu/grid/tuyensinh.jpg"
								style="width: 190px; height: 125px;">
						</div>
						<div id="text_item">
							<a href="#"><p>Tuyển sinh lớp 10 TP.HCM: Chọn trường nào
									cho phù hợp?</p></a>
						</div>
					</div>
					<%
						};
					%>
				</div>
			</div>

			<!--midle2-->

			<div id="midle2">
				<div id="midle2_left">
					<div id="midle2_row1">
						<div class="row11">
							<div class="tendanhmuc">
								<div class="imgdanhmuc"></div>
								<h5>TUYỂN SINH</h5>
							</div>
							<div id="tinmoi_tuyensinh">
								<div class="anh">
									<img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/tuyensinh/ts1.jpg"
										style="width: 340px; height: 180px;">
								</div>
								<a href="tinchitiet.jsp"><h6>Tư vấn thông tin mới nhất
										về tuyển sinh lớp 10</h6></a>
								<h6 style="margin-top: -30px;">(Ngày đăng: 19/5/2016)</h6>

							</div>
							<div id="link_tuyensinh">
								<ul>
									<li><a href=""><strong> Tài liệu Những điều
												cần biết về tuyển sinh ĐH, CĐ 2015</strong></a></li>
									<!--thamkhao: http://www.huongnghiepviet.com/v3/tin-huong-nghiep-tuyen-sinh -->
									<li><a href=""><strong>Thông tin xét tuyển
												của 440 trường ĐH,CĐ trong cả nước 2016</strong></a></li>
									<li><a href=""><strong>Chỉ tiêu tuyển sinh
												2016 của các trường CĐ, TC công an</strong></a></li>
								</ul>
							</div>
						</div>
						<div class="row12">
							<div class="tendanhmuc">
								<div class="imgdanhmuc"></div>
								<h5>DU HỌC</h5>
							</div>
							<div id="tinmoi_duhoc">
								<div class="anh">
									<img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/duhoc/duhoc2.jpg"
										style="width: 340px; height: 180px;">
								</div>
								<a href=""><h6>Học ngành gì ở Mỹ dễ xin việc nhất?</h6></a>
								<h6 style="margin-top: -30px;">(Ngày đăng: 19/5/2016)</h6>
							</div>
							<div id="link_duhoc">
								<ul>
									<li><a href=""><strong>Điều kiện, cách tính
												điểm XT vào ĐH Bách khoa Hà Nội 2016</strong></a></li>
									<li><a href=""><strong>Hướng dẫn đăng ký học
												bổ túc cấp 2, cấp 3</strong></a></li>
									<!--thamkhao: http://www.huongnghiepviet.com/v3/ -->
									<li><a href=""><strong>Điều kiện, cách tính
												điểm xét tuyển vào ĐH Bách khoa Hà Nội</strong></a></li>
								</ul>
							</div>
						</div>
					</div>
					<div id="midle2_row2">
						<div class="row11">
							<div class="tendanhmuc">
								<div class="imgdanhmuc"></div>
								<h5>DẠY CON</h5>
							</div>
							<div id="tinmoi_daycon">
								<div class="anh">
									<img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/daycon/daycon1.jpg"
										style="width: 340px; height: 180px;">
								</div>
								<a href=""><h6>Tư vấn "Dạy con tuổi teen tự lập"</h6></a>
								<h6 style="margin-top: -30px;">(Ngày đăng: 19/5/2016)</h6>
							</div>
							<div id="link_daycon">
								<ul>
									<li><a href=""><strong>Dạy con biết cảm thông
												để sống hạnh phúc hơn</strong></a></li>
									<li><a href=""><strong>Làm sao để dạy con
												thói quen lịch sự</strong></a></li>
									<li><a href=""><strong>Dạy con những bài học
												đầu tiên</strong></a></li>
								</ul>
							</div>
						</div>
						<div class="row12">
							<div class="tendanhmuc">
								<div class="imgdanhmuc"></div>
								<h5 style="margin-left: 59px;">HƯỚNG NGHIỆP</h5>
							</div>
							<div id="tinmoi_huongnghiep">
								<div class="anh">
									<img
										src="${pageContext.request.contextPath}/resources/img/image_hinhanh/huongnghiep/nganh-quan-ly-giao-duc.jpg"
										style="width: 340px; height: 180px;">
								</div>
								<a href=""><h6>Những câu hỏi đặt ra khi chọn nghề?</h6></a>
								<h6 style="margin-top: -30px;">(Ngày đăng: 19/5/2016)</h6>
							</div>
							<div id="link_huongnghiep">
								<ul>
									<li><a href=""><strong>Điều kiện, cách tính
												điểm xét tuyển vào ĐH Bách khoa Hà Nội</strong></a></li>
									<li><a href=""><strong>Hướng dẫn đăng ký học
												bổ túc cấp 2, cấp 3</strong></a></li>
									<!--thamkhao: http://www.huongnghiepviet.com/v3/ -->
									<li><a href=""><strong>Điều kiện, cách tính
												điểm xét tuyển vào ĐH Bách khoa Hà Nội<strong></a></li>
								</ul>
							</div>
						</div>
					</div>
					<div id="midle2_row3_video">
						<div
							style="font-weight: bold; color: #000; text-decoration: none;">

							<h5
								style="text-align: left; margin-bottom: 15px; margin-left: 15px; color: #027087;">VIDEO</h5>
						</div>
						<div id="playvideo" style="width: 132%;">
							<%
								for (int i = 0; i < 4; i++) {
							%>
							<iframe width="234" height="200"
								src="https://www.youtube.com/embed/AsTUqE9wkGs" frameborder="0"
								allowfullscreen="" style="margin-right: 15px;"></iframe>
							<%
								}
							%>
						</div>
					</div>
				</div>
				<!--end tin liên quan-->
				<!--radio và quảng cáo-->
				<!--midle2_right-->
				<div id="midle2_right" style="margin-top: 25px;">
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
				<!--end midle2_right-->
			</div>
		</div>
		<!--end center-->

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
