<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>web tin giáo dục</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style_trangcon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style_listchuyenmuc.css">
<script src="${pageContext.request.contextPath}/resources/jquery/jquery-1.7.2.min.js">
	
</script>
<script type="text/javascript">
	
</script>
</head>

<body>

	<!-- tin liên quan-->
	<!--tiêu đề-->
	<div class="tendanhmuc"
		style="width: 777px; margin-top: -10px; margin-bottom: 15px;">
		<div class="imgdanhmuc"></div>
		<h5>TIN NỔI BẬT</h5>
	</div>
	<!--hết tiêu đề-->
	<!--tin-->
	<div id="news">
		<!---thamkhao  http://www.marrybaby.vn/con-dang-lon/be-tu-4-den-6-tuoi/8-chieu-giup-me-day-tre-biet-nghe-loi-->
		<%
			for (int i = 0; i < 6; i++) {
		%>
		<h2>
			<a href="#">Cùng con học tập cũng là một "sự nghiệp"</a>
		</h2>
		<p>
			<img
				src="${pageContext.request.contextPath}/resources/img/image_hinhanh/donghanhcungcon/mot-nam-hoc-thanh-cong-1.jpg"
				width="100" height="66" align="left" class="img">
		</p>
		<span class="date">&nbsp;12/6/2016</span>
		<p>Dạy con học gây không ít căng thẳng cho các bậc phụ huynh. Việc
			này không hề đơn giản mà có thể coi là cả một "sự nghiệp" của các bậc
			làm cha, làm mẹ. Bên cạnh kiến thức còn đòi hỏi nhiều tình yêu
			thương, sự kiên nhẫn và phương pháp khoa học.</p>
		<p align="right">
			<span><a href="#" class="readmore">Xem tiếp <img
					src="${pageContext.request.contextPath}/resources/img/image_interface/readmore.png" width="12" height="11"
					align="baseline"></a> </span>
		</p>



		<%
			}
		%>
		<!--http://dantri.com.vn/dien-dan/cung-con-hoc-tap-cung-la-mot-su-nghiep-1349202941.htm-->
		<!-- <div id="news_item">
			<div id="hinhanh">
				<img
					src="${pageContext.request.contextPath}/resources/img/image_hinhanh/donghanhcungcon/mot-nam-hoc-thanh-cong-1.jpg">
			</div>
			<div id="noidung_tomtat">
				<a href="#"><h4>Cùng con bước vào một năm thành công</h4></a>
				<p>Sau một mùa hè nghỉ ngơi, thư giãn, các bạn nhỏ đã bước vào
					những ngày đầu tiên của năm học mới thì bắt đầu lại việc học theo
					quy củ nền nếp, chắc chắn sẽ có nhiều em chưa quen nên thiếu tập
					trung, thiếu chăm chỉ hay không có hứng thú với việc tự học tại
					nhà...</p>
			</div>
		</div>


		<div id="news_item">
			<div id="hinhanh">
				<img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/donghanhcungcon/vuihoccungcon.jpg">
			</div>
			<div id="noidung_tomtat">
				<a href="#"><h4>Những điều tốt nhất bạn có thể làm cho con</h4></a>
				<p>Mọi bậc cha mẹ đều mong muốn mang đến cho con những điều tốt
					nhất. Trong số đó, đừng quên:</p>
				<p>Dạy con qua những câu chuyện kể, dạy con qua thực tế, biết
					chấp nhận mọi người, bữa tối là thời điểm quây quần, dạy con giao
					tiếp tốt,...</p>
			</div>
		</div>
		<div id="news_item">
			<div id="hinhanh">
				<img
					src="${pageContext.request.contextPath}/resources/img/image_hinhanh/donghanhcungcon/12006105_891015520934358_3337669638942998704_n.jpg">
			</div>
			<div id="noidung_tomtat">
				<a href="#">
					<h4>Hội thảo cha mẹ thấu hiểu và đồng hành cũng con. Rèn trí
						luyện tài tạo dựng tương lai</h4>
				</a>
				<p>Con cái là tài sản lớn nhất của Bố Mẹ! Con cái cũng là điều
					Bố Mẹ bận tâm nhất,dành trọn trái tim và cả cuộc đời để chăm lo, để
					dõi theo. Con dù lớn – vẫn là con của Bố mẹ. Nhưng để xây dựng một
					tương lai tố đẹp cho con...</p>
			</div>
		</div>
		<div id="news_item">
			<div id="hinhanh">
				<img src="${pageContext.request.contextPath}/resources/img/image_hinhanh/donghanhcungcon/qc3.jpg".jpg">
			</div>
			<div id="noidung_tomtat">
				<a href="#"><h4>Cùng con học tập cũng là một "sự nghiệp"</h4></a>
				<p>Dạy con học gây không ít căng thẳng cho các bậc phụ huynh.
					Việc này không hề đơn giản mà có thể coi là cả một "sự nghiệp" của
					các bậc làm cha, làm mẹ. Bên cạnh kiến thức còn đòi hỏi nhiều tình
					yêu thương, sự kiên nhẫn và phương pháp khoa học.</p>
			</div>
		</div>
			
		<!-- het tin -->
		<!---chuyển trang--->
		<table width="273" border="0" align="center">
			<tbody>
				<tr align="center">
					<td align="center"><a href="#" class="pagelimitfirst">Trước</a>
						<a href="#" class="pagelimit1">1</a> <a href="#" class="pagelimit">2</a>
						<a href="#" class="pagelimit">3</a> <a href="#" class="pagelimit">4</a>
						<a href="#" class="pagelimitlast">Sau</a></td>
				</tr>
			</tbody>
		</table>
		<!---hết chuyển trang--->
	</div>
</body>
</html>

