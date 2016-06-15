<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %><!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Đăng nhập</title>
<link href="${pageContext.request.contextPath}/resources/css/style_dangnhap.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/style_formdn.css" rel="stylesheet" type="text/css">
<!--start jquery demo-->
<!--script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script-->
<!--end jquery demo-->
</head>

<body>
<div id="container">
  <div id="header">
  <div id="logo"></div>
  <div id="slogan">
    </div>
  
</div>
  <!-- menu -->
  <div id="menu">
  <div id="trangchu"><div id="icon_home"></div><span><a href="${pageContext.request.contextPath}/trangchu">Trang chủ</a></span></div>
  <div id="menu_item">Hướng ngiệp</div>
  <div id="menu_item">Góc nhìn chuyên gia</div>
  <div id="menu_item">Tâm lý</div>
   <div id="menu_item">Đồng hành cùng con</div>
 

  </div>
  <!-- end menu-->
  
  <div class="search_bar">                    
                        <div class="text_run">
                        <marquee>
                        Giáo dục - ươm mầm tri thức Việt!  
                        </marquee>
                        </div>
                    <div class="NavigatorBoxSearch">
                    
                        <input type="hidden" value="013319808617213044252:4shogcrnrhu" name="cx">
                        <input type="hidden" value="UTF-8" name="ie">
                    
                        <input type="text" name="Search" onKeyPress="return trapEnterKey(event)" id="txtSearch" class="inputSearch">
                        <input type="submit" value="GO" class="submit" id="searchsubmit" style="display:none">
                        <a href="#" name="btnSearch" id="btnSearch" class="inputSearchheader" onClick="aSearch()">
                            Tìm kiếm</a>
                      <script type="text/javascript">
                                function gotosearch()
                                {
                                    window.location.href = 'http://www.google.com/cse?cx=013319808617213044252:4shogcrnrhu&ie=UTF-8&q=abc#gsc.tab=0&gsc.q='+ $("#txtSearch").val() +'&gsc.page=1';
                                }
                            </script>

                    </div>
</div>
  <!--start center-->
  <div id="center">
  <!-- demo
  <script type="text/javascript">
  $(document).ready(function() {
    $('a.login-window').click(function() {
        //lấy giá trị thuộc tính href - chính là phần tử "#login-box"
        var loginBox = $(this).attr('href');
 
        //cho hiện hộp đăng nhập trong 300ms
        $(loginBox).fadeIn(300);
 
        // thêm phần tử id="over" vào sau body
        $('body').append('<div id="over">');
        $('#over').fadeIn(300);
 
        return false;
 });
 
 // khi click đóng hộp thoại
 $(document).on('click', "a.close, #over", function() {
       $('#over, .login').fadeOut(300 , function() {
           $('#over').remove();
       });
      return false;
 });
});</script>
  <div class="login" id="login-box">Đăng nhập
 
 <a class="close" href="#"><img class="img-close" title="Close Window" alt="Close" src="close.png" /></a>
<form class="login-content" action="#" method="post"><label class="username">
 <span>Tên hoặc email</span>
 <input id="username" type="text" autocomplete="on" name="username" placeholder="Username" value="" />
 </label>
 <label class="password">
 <span>Mật khẩu</span>
 <input id="password" type="password" name="password" placeholder="Password" value="" />
 </label>
 <button class="button submit-button" type="button">Đăng nhập</button>
  <a class="close button" href="#login-box">Close</a>
 
 <a class="forgot" href="#">Quên mật khẩu?</a></form></div>
  <!--end demo-->
  
 <form id = "form" action="XuLyDangNhap" method="post" >
<div id ="bth" ><h2>ĐĂNG NHẬP</h2></div>


<table>

<tr>
<td width="173" id = "left">Tên đăng nhập</td>
<td width="200"><input type = "text" name = "nameDN" maxlength="50" placeholder="tên đăng nhập" class = "in"></td>
</tr>

<tr>
<td id = "left">Mật khẩu</td>
<td><input type = "password" name = "pass" placeholder="mật khẩu" class = "in"></td>
</tr>



  <td colspan="2">   <a target="_blank" href="${pageContext.request.contextPath}/dangky" > Đăng ký</a><a href="#">Quên mật khẩu?</a></td>
</tr>

<tr>
<td><input type ="submit" name="submit" value="OK" id="action"></td>
<td><input type = "button" name = "cancel" value = "Cancel" id = "action"></td>
</tr>

<tr >
  <td>&nbsp;</td>
  <td>&nbsp;</td>
  <td></td>
</tr>

</table>





</form>
</div>
  <!--end center--> 
<!--footer-->
  <div id="footer">
  <nav id="social">
  <a class="facebook" href="#" target="_blank">
  <i class="mangxahoi facebook" >
  <img src="file:///G|/TAI LIEU_Bich Thiet/PHP/webbaby/img/face.png">
  </i>
  </a>
  <a class="facebook" href="#" target="_blank">
  <i class="mangxahoi facebook" >
  <img src="file:///G|/TAI LIEU_Bich Thiet/PHP/webbaby/img/face.png">
  </i>
  </a>
  <a class="facebook" href="#" target="_blank">
  <i class="mangxahoi facebook" >
  <img src="file:///G|/TAI LIEU_Bich Thiet/PHP/webbaby/img/face.png">
  </i>
  </a>
  </nav>
    <p>Báo điển tử</p>
    <p>Bản quyền thuộc về CLB Tin Học Khoa Công nghệ Thông tin</p>
    <p>Trường ĐH Nông Lâm</p>
    <p>Hotline: 083888888S</p>
  </div>
  <!--kết thúc footer-->
  
</body>
</html>
