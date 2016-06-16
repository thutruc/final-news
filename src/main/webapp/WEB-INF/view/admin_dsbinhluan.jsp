
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>admin- danh sách bình luận</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/img/css/styleadmin.css">
<script src="${pageContext.request.contextPath}/resources/img/jquery/jquery-1.7.2.min.js">
	
</script>
<style type="text/css">
#form #button input .action {
	background: #DDEAF3;
	font-size: 14px;
}

#form #button input .action:HOVER {
	box-shadow: 1px 1px 10px #0099ff;
	background-color: #DDEAF3;
}
</style>
</head>

<body>

	<div id="quanly">
		<!-- start quan tri vien -->
		<div id="ql_tin">
			<div id="text_qtri">Quản trị viên</div>
			<div id="qtrivien">
				<li>Tên admin: Admin</li>
				<li><a href="#"">Hồ sơ cá nhân</a></li>
			</div>

		</div>
		<!-- end quan tri vien -->

		<!-- start ql_tin -->
		<div id="ql_tin">
			<div id="text">Quản lý</div>
			<ul style="list-style-type: none">
				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/icontin.png">
					<ul>
						<li><a href="#">Quản lý tin tức</a></li>
					</ul></li>
				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/chuyenmucicon.png">
					<ul>
						<li><a href="#">Quản lý danh mục</a></li>
					</ul></li>

				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/commenticon.png">
					<ul>
						<li><a href="#">Quản lý bình luận</a></li>
					</ul></li>
				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/avataradmin.png">
					<ul>
						<!-- ds chứa thêm xóa sửa -->
						<li><a href="#">Quản lý người dùng</a></li>
					</ul></li>
				<li><img alt="" style="width: 23px; height: 25px;"
					src="${pageContext.request.contextPath}/resources/img/image_interface/cauhoiicon.png">
					<ul>
						<li><a href="#">Quản lý hỏi đáp</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	<!-- end ql tin -->
	<div id="tindang">
		<div>
			<form id=form action="Xulysuatintuc" method="post">
				<h2 style="text-align: center;">DANH SÁCH BÌNH LUẬN</h2>
				<%-- <%
						/* if (list.size() == 0) { */
					%> --%>
				<!-- <div align="Center"
									style="border: 1px solid #cfcfcf; padding: 20px 10px 20px 10px; background-color: #f3f3f3; width: 100%; height: 200px;">
									<b>Dữ liệu không có trong database</b>
								</div> -->
				<%-- <%
						/* } else { */
					%> --%>
				<table class="table1" border="2"
					style="border: 1px; width: 100%; border-spacing: 20px; margin-left: 160px; font: time new roman 16px; border-collapse: collapse; width: 100% px; margin: auto; margin-top: 18px;">

					<tr class="tieude_table"
						style="height: 40px; background: #DDEAF3; color: #000; font-size: 16px;">
						<th style="text-align: center; width: 45px;">STT</th>
						<th style="text-align: center; width: 105px;">Mã bình luận</th>
						<th style="text-align: center">Nội dung</th>
						<th style="text-align: center; width: 85px;">Chỉnh sửa</th>
						<th style="text-align: center; width: 35px;">Xóa</th>
					</tr>

					<tr style="font-size: 15px;">
						<td style="text-align: center;">1<%-- <%=/* i + 1 */%> --%></td>
						<td><a style="text-decoration: underline;"
							href="<%-- ActionDetailProduct.jsp?id=<%=/* list.get(i).getId() */%> --%>">
								<%-- <%=/* list.get(i).getId() */%> --%>
						</a> MBL</td>
						<td>
							<%-- <%=/* list.get(i).getCutString(
							list.get(i).getContent(), 50) */%> --%> nội dung...
						</td>
						<td class="suaxoa" style="text-align: center;">
							<form action="suabaigioithieu.jsp" method="post">
								<input type="submit"
									<%-- value="<%=/* list.get(i).getId() */%>" --%>
										name="IntroID"
									class="sua" />

							</form>
						<td><a href="#"
							<%-- id="<%=/* list.get(i).getId() */%>" --%>
								onclick="xoa(this)"><img
								alt="" style="width: 15px; height: 27px; margin-left: 10px;"
								src="${pageContext.request.contextPath}/resources/img/image_interface/xoa.png"></a></td>
					</tr>
					<%-- <%
							/* } */
						%> --%>
				</table>


				<br>
				<div>
					<p style="text-align: center;">
						<B>Trang</B>
						<%-- <%
								/* int soTrang = list.size() / 5;
									if (list.size() % 5 != 0) {
										soTrang++;
									}
									for (int i = 1; i <= soTrang; i++) { */
							%> --%>
						<a style="text-decoration: underline;"<%-- href="danhsachbaigioithieu.jsp?page=<%=/* i */%>" --%>>
							<%-- <%=/* i */%> --%>
						</a>
						<%-- <%
								/* } */
							%> --%>
						<%-- <b style="margin-left: 620px;">Tổng: </b><font color="blue"><%=/*"< " + list.size() + " >" */%></font>
							<b> bài viết</b>
							<%
								/* } */
							%> --%>
				</div>
			</form>
		</div>





	</div>
	<!-- hết phần tin đăng// phần quản lý nội dung của admin -->

</body>
</html>
