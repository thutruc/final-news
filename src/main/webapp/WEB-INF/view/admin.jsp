<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@page import="edu.news.model.*"%>
<!DOCTYPE html >
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>admin</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styletrangcon.css">
<script src="${pageContext.request.contextPath}/resources/ckfinder/ckfinder.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/ckeditor/ckeditor.js" type="text/javascript"></script>
	
<style type="text/css">
#quanly {
	
	clear: right;
	float: left;
	width: 25%;
	height: 500px;
}

#tindang {
	width: 72%;
	background-color:red ;
	height: 500px;
	float: right;
	margin-bottom: 20px;
}
</style>
</head>

<body>
<!-- start quanly -->
	<div id="quanly">
	
	 <!-- start quan tri vien -->
    <div id="ql_tin">
    <div id="text_qtri" >Quản trị viên</div>
    <div id="qtrivien">
    <li> Tên admin: Admin</li>
    <li><a href="#">Hồ sơ cá nhân</a></li>
    </div>
   
    </div>
    <!-- end quan tri vien -->
    
     <!-- start ql_tin -->
    <div id="ql_tin">
    <div id="text">Quản lý </div>
   <ul style="list-style-type:none">
   <li> Quản lý tin
   <ul>
   <li><a href="#">Đăng tin</a></li>
   <li><a href="#">Xóa tin</a></li>
   <li><a href="#">Sửa tin</a></li>
   </ul>
    </li>
   <li> Quản lý chuyên mục 
   <ul>
   <li><a href="#">Thêm modul</a></li>
   <li><a href="#">Xóa modul</a></li>
   <li><a href="#">Sửa modul</a></li>
   </ul></li>
    
   <li> Quản lý  bình luận
   <ul>
   <li><a href="#">Duyệt bình luận</a> </li>
   <li><a href="#">Xóa bình luận</a></li>
   </ul></li>
    
   <li> <a href="#" style="color: #000;text-decoration: none;">Thống kê số lượt truy cập</a></li>
   <li> <a href="#"style="color: #000;text-decoration: none;">Trả lời câu hỏi</a></li>
   </ul>
    </div>
    <!-- end ql tin -->
   
	</div>
	<!-- end quanly -->
	
	<!-- start tindang -->
	<div id="tindang">
	<form:form action="${pageContext.request.contextPath}/addNews" method="post" modelAttribute="new">
	<form:textarea path="content" class="ckeditor" id='editor1' name="editor1" rows="33" cols="136"/>
	 <input type="submit" value="Lưu"/>
	</form:form>
	</div>
	<!-- end tindang -->


</body>
</html>
