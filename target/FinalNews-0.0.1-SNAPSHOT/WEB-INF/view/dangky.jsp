<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Đăng ký</title>
<link href="${pageContext.request.contextPath}/resources/css/style_pagedif.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/style_form.css" rel="stylesheet" type="text/css">
</head>

<body >
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
                            <!-- start xuly thong tin dang ky-->
                            <!--  script type="text/javascript">
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
	function checkmail() {
		$.get("XuLyMail?email=" + $("#email").val(), function(data, status) {
			if (data.indexOf("tontai") != -1) {
				$("#thongbao").html("Mail đã tồn tại");
				$("#thongbao").css("color", "red");
			}
		});
	}
	function cancel() {
		window.location.replace("http://google.com");
	}
</script-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">
            randomCaptcha();
            function randomCaptcha() {
                var a = Math.ceil(Math.random() * 10);
                var b = Math.ceil(Math.random() * 10);
                var c = a + b;
                $(".hd_result").val(c + "");
                $(".capt_cha").val(a + " + " + b);
                console.log(a);
                console.log("truc"+b);
               	
            }
           
        </script>
                            <!-- end xuly thong tin dang ky -->
                    </div>
</div>
  
  <!--start center-->
  <div id="center">
  <!--form  action="#" method="post">
  <div id="Dk_title">
  <div id="text">ĐĂNG KÝ</div>
  <div id="email">Email: <input id="input" name="email" type="email" size="35px"  placeholder="xxx@gmail.com"/></div>
  <div id="email">Tên: <input id="input" name="name" type="text" size="35px"  placeholder="Nguyen Van A"/></div>
  </div>
  
  
     </form-->
     <!--start form dang ky -->
    <form id="form"  method="post">
						<h1 align="center">THÔNG TIN ĐĂNG KÝ</h1>
						
						
						<hr />
						<table>
							<tr id="thongbao"></tr>
							<tr>
								<td class="title">Email đăng nhập<font style="color: #F00">*</font></td>
								<td><input id="email" name="email" type="email" size="40"
									class="ip" placeholder="Email đăng nhập" required
									onblur="checkmail()"></td>
							</tr>
							<tr>
								<td class="title" id="mk">Mật khẩu<font style="color: #F00">*</font></td>
								<td><input id="matkhau" name="pass" type="password"
									size="40" class="ip" placeholder="Mật khẩu" required></td>
							</tr>
							<tr>
								<td class="title">Nhập lại mật khẩu<font
									style="color: #F00">*</font></td>
								<td><input id="remk" name="re_pass" type="password"
									size="40" class="ip" placeholder="Nhập lại mật khẩu"
									required="required" onblur="checkmk()"></td>
							</tr>
							<!--tr>
								<td class="title">Giới tính</td>
								<td><input type="radio" name="sex" value="Nam" checked>Nam<input type="radio" name="sex" value="Nữ">Nữ</td>
							</tr-->
							<tr>
								<td class="title">Họ và tên<font
									style="color: #F00">*</font></td>
								<td><input name="hoten" type="text" size="40" class="ip"
									placeholder="Họ và tên" required></td>
							</tr>

							<!--tr>
								<td class="title">Địa chỉ<font style="color: #F00">*</font></td>
								<td><input name="diachi" type="text" id="textfield"
									size="40" class="ip" placeholder="Địa chỉ nhà"
									required="required"></td>
							</tr-->
							<!--tr>
								<td class="title">Số điện thoại</td>
								<td><input type="tel" name="sdt" size="40" class="ip"
									placeholder="Mẫu: 0123456789" 
	       required size="50" pattern="([0-9]{1}([0-9]{3})([0-9]{3})([0-9]{3,4}))"></td>
							</tr-->
							<!--tr>
								<td class="title">Ngày sinh</td>
								<td><input type="date" name="ngaySinh" class="ip"
									required="required"></td>
							</tr-->
							<tr>
								<td class="title">Mã kiểm tra:</td>
								
								<td class="capt_cha"></td>
							</tr>
							<tr>
								<td class="title">Nhập mã kiểm tra:</td>
								<td><input name="macaptcha" type="text" size="40" class="ip"
									placeholder="Nhập mã kiểm tra tại đây!" required></td>
							</tr>
							<tr>
							</tr>
						</table>
						<hr />
						
						
						<input name="submit" type="submit" class="actiongui" value="Gửi">
					   <input type="reset" name="cancel" value="Hủy bỏ"
							class="actionhuy">

				   </form>
				   <input type="hidden" value="" class="hd_result">
                    <!-- end form dang ky -->
     </div>


  <!--end center--> 
   
  
  
  
  <!--footer-->
  <div id="footer">
  <nav id="social">
  <a class="facebook" href="#" target="_blank">
  <i class="mangxahoi facebook" >
  <img src="resources/img/image_interface/tw.png">
  </i>
  </a>
  <a class="facebook" href="#" target="_blank">
  <i class="mangxahoi facebook" >
  <img src="resources/img/image_interface/g.png">
  </i>
  </a>
  <a class="facebook" href="#" target="_blank">
  <i class="mangxahoi facebook" >
  <img src="resources/img/image_interface/tw.png">
  </i>
  </a>
  </nav>
    <p>Báo điển tử</p>
    <p>Bản quyền thuộc về CLB Tin Học Khoa Công nghệ Thông tin</p>
    <p>Trường ĐH Nông Lâm</p>
    <p>Hotline: 083888888S</p>
  </div>
  <!--kết thúc footer-->
  
  <div id="back_to_top" title="Go top" style="display: block;"></div>
</div>

</body>
</html>
