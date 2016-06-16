
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>admin- đăng tin</title>
<<<<<<< HEAD
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/styleadmin.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style_dangtin.css">
<script src="jquery/jquery-1.7.2.min.js"></script>
<!-- databpicker -->
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<<<<<<< HEAD
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
=======
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
>>>>>>> 614f88b18ed588530545e453b316d2bc4b767a71
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/ckeditor/ckeditor.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/ckfider/ckfinder.js"
	type="text/javascript"></script>
<!-- integrate datepiker -->
<script>
	$(document).ready(function() {
		$("#datepicker").datepicker();
	});
</script>
<<<<<<< HEAD
=======
=======
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styleadmin.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style_dangtin.css">
<script src="${pageContext.request.contextPath}/resources/jquery/jquery-1.7.2.min.js">
	
</script>
<script src="${pageContext.request.contextPath}/resources/ckeditor/ckeditor.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/ckfider/ckfinder.js" type="text/javascript"></script>

>>>>>>> 5ba680457b2919fd4975d52bfc0165253eae149f
>>>>>>> 614f88b18ed588530545e453b316d2bc4b767a71
<!-- css cho button của vùng textarea -->

<!-- ajax -->
<!-- <script type="text/javascript"> -->
<!-- //  $(document).on("click",".submitForm", function(){ -->
<%-- //         var success = ${success}; --%>
<!-- //         $.ajax({ -->
<!-- //             url: "/addNews", -->
<!-- //             type: "POST", -->
<!-- //             data:{ -->
<!-- //                 success: name, -->

<!-- //             }, -->
<!-- //             success: function(data){ -->
<!-- //                 if(data == 1){ -->
<!-- //                     $(".dialog-text").text("Add thanh cong"); -->
<!-- //                 }else{ -->
<!-- //                     $(".dialog-text").text("That bai"); -->
<!-- //                 } -->
<!-- //                 $(".dialog-fb").fadeIn(500, function(){ -->
<!-- //                     setTimeout(hide_dialog,5000); -->
<!-- //                 }); -->
<!-- //             } -->
<!-- //         }); // END AJAX -->
<!-- //     }); -->


<!-- // }); -->
<!-- // function hide_dialog() { -->
<!-- //     $(".dialog-fb").fadeOut(500); -->
<!-- // } -->
<!-- </script> -->
<div class="dialog-fb">
	<span class="dialog-text"></span>
</div>


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
				<li><a href="#">Hồ sơ cá nhân</a></li>
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
						<li><a href="${pageContext.request.contextPath}/managerModel">Quản lý danh mục</a></li>
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
		<!-- ckeditor+ ckfider -->
		<div>
<<<<<<< HEAD
			<form:form action="${pageContext.request.contextPath}/addNews"
				method="get" modelAttribute="news" class="submitForm">
				<h2 style="text-align: center;">ĐĂNG TIN</h2>

				<!-- ---------- -->
				<div id="input_tin" style="margin-bottom: 10px;">
					<label>Tiêu đề:</label>
					<form:input path="title" type="text" name="title" value=""
						required="required" style="width: 90%;" />
					<label>Tóm tắt:</label>
					<form:input path="newsBrief" type="text" name="newsBrief" value=""
						required="required" style="width: 90%;margin-left:5px " />
					<label>Loại tin:</label>
					<form:input path="type" type="text" name="type" value=""
						required="required" style="width: 150px; margin-right: 70px;" />
					<label style="margin-left: 70px;">Hình ảnh:</label>
					<form:input path="img" type="text" name="image" value=""
						required="required" style="width: 150px; margin-right: 70px;" />
					<label style="margin-left: 70px;">Ngày đăng:</label>
					<form:input path="date" type="text" name="image" value=""
						required="required" style="width: 100px;" id="datepicker" />
=======
			<form id=form action="Xulydangtintuc" method="post">
				<h2 style="text-align: center;">ĐĂNG TIN</h2>

				<!-- ---------- -->
				<div id="input_tin">
					<label>Tiêu đề:</label><input type="text" name="title" value=""
						required="required" style="width: 250px; margin-right: 70px;">
					<label>Hình ảnh:</label><input type="text" name="image" value=""
						required="required" style="width: 150px; margin-right: 40px;">
					<label>Ngày đăng:</label><input type="text" name="image" value=""
						required="required" style="width: 150px; margin-right: 40px;">
>>>>>>> 5ba680457b2919fd4975d52bfc0165253eae149f
				</div>
				<!-- -------------- -->
				<textarea id="summary" rows="33" cols="136"
					style="width: 100%; height: 100%;"></textarea>
				<script type="text/javascript">
					CKEDITOR.replace('summary');
				</script>
				<!-- button xự kiện -->

				<div id="button">
					<a href=""><img alt=""
						src="${pageContext.request.contextPath}/resources/img/image_interface/backicon.png"
						style="width: 25px; height: 25px;"></a> <input name="submit"
						type="submit" class="action" value="Đăng tin"> <input
						type="reset" name="cancel" value="Hủy" class="action">
				</div>
				<!--end button xự kiện -->
			</form>
		</div>
		<!-- het form cke & ckf -->
	</div>
	<!-- hết phần tin đăng// phần quản lý nội dung của admin -->

</body>
</html>
