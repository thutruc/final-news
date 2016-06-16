
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>admin- danh sách tin</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styleadmin.css">
<script src="${pageContext.request.contextPath}/resources/jquery/jquery-1.7.2.min.js">
	
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
			<h2 style="text-align: center;">DANH SÁCH TIN TỨC</h2>
			<!-- tìm kiếm -->
			<div style="float: right; margin-bottom: 10px;">
				<p>
				<form action="" method="post" onsubmit="return SearchID2(this)">
					<input type="hidden" name="rep" value="viewID" /> Mã tin: <input
						name="id" id="id2" type="text"
						onkeypress="return numberonly(event);"
						style="width: 80px; margin-right: 10px;"><input
						type="hidden" name="rep" value="viewID" /> Ngày đăng: <input
						name="id" id="id2" type="text"
						onkeypress="return numberonly(event);" style="width: 80px;">
					<input type="submit" class="UniXT" value="Tìm kiếm">
				</form>
			</div>

			<!-- end tìm kiếm -->
			<form id=form action="X
				ulysuatintuc" method="post">


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
					style="border: 1px; width: 100%; border-spacing: 20px; margin-left: 160px; font: normal normal 16px time new roman; border-collapse: collapse; margin: auto; margin-top: 18px;">

					<tr class="tieude_table"
						style="height: 40px; background: #DDEAF3; color: #000;">
						<th style="text-align: center; width: 45px;">STT</th>
						<th style="text-align: center; width: 60px;">Mã tin</th>
						<th style="text-align: center; width: 90px;">Hình ảnh</th>
						<th style="text-align: center">Tiên đề</th>
						<th style="text-align: center; width: 86px;">Ngày đăng</th>
						<th style="text-align: center; width: 45px;">Loại</th>
						<th style="text-align: center; width: 85px;">Chỉnh sửa</th>
						<th style="text-align: center; width: 35px;">Xóa</th>
					</tr>
					<%-- <%
							/* String s_page = request.getParameter("page");
								int n_page = 1;
								if (s_page != null) {
									n_page = Integer.parseInt(s_page);
								}
								int start = (n_page - 1) * 5;
								int end = (n_page) * 5 - 1;

								if (end > list.size()) {
									end = list.size() - 1;
								}
								for (int i = start; i <= end; i++) {
									Introduction p = list.get(list.size() - 1 - i);
 */						%>
 --%>
					<tr>
						<td style="text-align: center">1<%-- <%=/* i + 1 */%> --%></td>
						<td>
						<!-- link qua mã tin để xem tin chi tiết -->
						<a style="text-decoration: underline;"
							href="<%-- ActionDetailProduct.jsp?id=<%=/* list.get(i).getId() */%> --%>">
								<%-- <%=/* list.get(i).getId() */%> --%>
						</a> 123</td>
						<td style="height: 80px;">hình ảnh</td>
						<td>
							<%-- <%=/* list.get(i).getCutString(
							list.get(i).getContent(), 50) */%> --%> Tiêu đề tin tức
						</td>
						<td>
							<%-- <%=/* list.get(i).getDate() */%> --%> ngày đăng
						</td>
						<td>loại tin</td>

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
								alt="" style="width: 15px; height: 27px;"
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
		<div style="width: 455px; margin: auto; font-weight: bold;">
			<div style="float: left; clear: right;">Số lượng tin tức:</div>
			<div style="float: right;">Số lượng tin đăng trong ngày:</div>
		</div>
	</div>
	<!-- hết phần tin đăng// phần quản lý nội dung của admin -->

</body>
</html>
