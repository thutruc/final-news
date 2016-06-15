<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html >
<html lang="en">
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>web tin giáo dục</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<script src="jquery/jquery-1.7.2.min.js"> </script>
</head>

<body id="newitem_other_link">
<div id="container">
  <div id="header">
  <div id="logo"></div>
  <div id="slogan"> </div>
  </div>
  <!-- menu -->
  <div id="menu">
  <div id="trangchu"><div id="icon_home"></div><span><a href="${pageContext.request.contextPath}/trangchu"> Trang chủ</a></span></div>
  <div id="menu_item">Hướng nghiệp</div>
  <div id="menu_item">Góc nhìn chuyên gia</div>
  <div id="menu_item">Tâm lý</div>
   <div id="menu_item">Đồng hành cùng con</div>
   <div id="login"><a href="${pageContext.request.contextPath}/dangnhap">Đăng nhập</a> </div>
  </div>
  <!-- end menu-->
  
  <div class="search_bar">                    
                        <div class="text_run">
                        <marquee>
                        Giáo dục - Ươm mầm tri thức Việt!  
                        </marquee>
                        </div>
                    <div class="NavigatorBoxSearch">
                    
                        <input type="hidden" value="013319808617213044252:4shogcrnrhu" name="cx">
                        <input type="hidden" value="UTF-8" name="ie">
                    
                        <input type="text" name="Search" onKeyPress="return trapEnterKey(event)" id="txtSearch" class="inputSearch">
                        <input type="submit" value="GO" class="submit" id="searchsubmit" style="display:none">
                        <a href="#" name="btnSearch" id="btnSearch" class="inputSearchheader" onClick="aSearch()">
                            Tìn kiếm</a>
                            <script type="text/javascript">
                                function gotosearch()
                                {
                                    window.location.href = 'http://www.google.com/cse?cx=013319808617213044252:4shogcrnrhu&ie=UTF-8&q=abc#gsc.tab=0&gsc.q='+ $("#txtSearch").val() +'&gsc.page=1';
                                }
                            </script>
                    </div>
                </div>
  
  
  <div id="center">
  <!--top left-->
    <div id="top">
      <div id="item_topimag">
        <div class="title"><h2>Mục tin mới nhất</h2></div>
         <div id="imag"><a a href="#"><img src="resources/img/image_hinhanh/duhoc1.jpg"></a></div>
         <div id="top_content">
         <h4>Người Việt đến Nhật du học tăng mạnh</h4>
         <p>Vừa được Tổ chức Hỗ trợ sinh viên Nhật Bản (JASSO) công bố, cho thấy lượng học viên, sinh viên Việt đứng thứ 2 về du học sinh ở Nhật,
          chỉ sau Trung Quốc (94.111, gần như không thay đổi so với năm trước), theo Kyodo News.
           Số liệu trên cho thấy số du học sinh Việt tại Nhật lần đầu tiên vượt qua con số tương ứng ở Mỹ...</p> 	
         <div class="readmore"><a href="#"><strong>Read more</strong></a></div>
         </div>
      </div>
        
        <!--end top left--> 
       <!--top right--> 
        <div id="item_topclip">
        <div class="title" style="text-align:center"><h2>Mục tin video</h2></div>
        <div id="slider"><iframe width="340" height="255" src="https://www.youtube.com/embed/AsTUqE9wkGs" frameborder="0" allowfullscreen></iframe></div>
        </div>
         <!--end top --> 
</div>
    <!--háº¿t pháº§n top cá»§a center -->
    <!--midle1-->
     <div id="midle1">
     <!--midle1_left--> 
     <div id="blognews">
     <div id="newitem">
     <div id="image_item"><img src="resources/img/image_hinhanh/tuvan.jpg"></div>
     <div id="text_item"><a href="#"><p>
Tư vấn truyền hình trực tuyến: Nộp hồ sơ để trúng tuyển ngay nguyện vọng 1</p></a></div>
     </div>
     
<!---2 item khÃ¡c-->
     <div id="newitem">
     <div id="image_item"><img src="resources/img/image_hinhanh/thi1.jpg">   </div>
     <div id="text_item"><a href="#"><p>Học nghề, đường đời rộng mở</p></a></div>
     </div>
     <div id="newitem">
     <div id="image_item"><img src="resources/img/image_hinhanh/tuyensinh.jpg"></div>
     <div id="text_item"><a href="#"><p>Tuyển sinh lớp 10 TP.HCM: Chọn trường nào cho phù hợp?
</p></a></div>
     </div>
     <div id="newitem">
     <div id="image_item"><img src="resources/img/image_hinhanh/tuyensinh.jpg"></div>
     <div id="text_item"><a href="#"><p>Tuyển sinh lớp 10 TP.HCM: Chọn trường nào cho phù hợp?
</p></a></div>
     </div>
     <div id="newitem">
     <div id="image_item"><img src="resources/img/image_hinhanh/tuyensinh.jpg"></div>
     <div id="text_item"><a href="#"><p>Tuyển sinh lớp 10 TP.HCM: Chọn trường nào cho phù hợp?
</p></a></div>
     </div>
     <!---háº¿t 2 item khÃ¡c-->
     
     </div>
     <!--end midle1_left--> 
     <!--midle1_right--> 
    <!-- <div id="midle1_right">
      
     
     </div>-->
     <!--end midle1_right--> 
       </div>

     <!--midle2-->
    
     <div id="midle2">
      
     <!--midle2_left--> 
     <div id="midle2_left">
	 <!---Má»¥c TUYá»N SINH> 
     <!--tham kháº£o link: http://tuyensinh.dantri.com.vn/tuyen-sinh/chi-tieu.htm-->
     <div id="newitem_other_link1">
     <div id="tuyensinh">
     <div class="title"><h5 style="text-align: center;"><img src="resources/img/image_interface/templatemo_menu_hover.png" style="margin-right:10px;">Tuyá»n sinh</h5></div>
     <div id="image_item_ts"><img src="resources/img/image_hinhanh/ts2.jpg"></div>
     <div id="text_item_ts"><a href="trangcon.html"><h6>14h chiều nay, tư vấn thông tin mới nhất về tuyển sinh lớp 10 </h6></a>
<p>Từ 14h ngày 21/4/2016, trường THPT FPT phối hợp cùng báo Dân trí tổ chức buổi tư vấn "Thông tin mới nhất về tuyển sinh lớp 10" đã đem đến cái nhìn tổng quan cho kỳ thi quan trọng này.</p></div>
<!--tham kháº£o chi tiáº¿t cá»§a tin trÃªn: http://tuyensinh.dantri.com.vn/giao-duc-khuyen-hoc/14h-chieu-nay-tu-van-thong-tin-moi-nhat-ve-tuyen-sinh-lop-10-20160419142836799.htm -->
     </div> 
     <div id="link_ts"><ul>
     <li><a href=""><strong>  Tài liệu Những điều cần biết về tuyển sinh đại học, cao đẳng 2015</strong></a></li><!--thamkhao: http://www.huongnghiepviet.com/v3/tin-huong-nghiep-tuyen-sinh -->
     <li><a href=""><strong>Thông tin xét tuyển của 440 trường ĐH,CĐ trong cả nước năm 2016</strong></a></li>
     <li><a href=""><strong>Chỉ tiêu tuyển sinh năm 2016 của các trường cao đẳng, trung cấp công an</strong></a></li>
     </ul>
     </div>
             </div> 
			 <!---end TUYá»N SINH-->
			 <!---Má»¥c DU HOC-->
     <div id="newitem_other_link1" style="margin-left:16px;">
     <div id="duhoc">
     <div class="title"><h5 style="text-align: center;"> <img src="resources/img/image_interface/templatemo_menu_hover.png" style="margin-right:10px;">Du học</h5></div>
     <div id="image_item_dhoc"><img src="resources/img/image_hinhanh/duhoc3.jpg"></div>
     <div id="text_item_dhoc"><a href=""><h6>Học ngành gì ở Mỹ dễ xin việc nhất</h6></a>
<p>Học ngành gì ở Mỹ dễ xin việc? Đây chắc chắn là câu hỏi mà các học sinh khi du học sang Mỹ luôn trăn trở. Hãy theo dõi để biết trang bị cho bạn kiến thức vững chắc về con đường "du học" nhé!</p></div> <!--thamkhao: http://duhocaau.vn/vn/tin-tuc/296/hoc-nganh-gi-o-my-de-xin-viec-nhat.html -->
     </div> 
     <div id="link_dhoc"><ul>
     <li><a href=""><strong>Top 10 trường ĐH & CĐ an toàn nhất nước Mỹ (03:10 | 29/04/2016)</strong></a></li>
     <li><a href=""><strong>Du học Philippines đảm bảo Visa chuyển tiếp sang Mỹ, Úc, Canada, Anh…</strong></a></li>
     <li><a href=""><strong>Du học Á-Âu chắp cánh tương lai cho học sinh nghèo hiếu học</strong></a></li>
     </ul>
     <!--thamkhao chung: http://duhocaau.vn/vn/tin-tuc/296/hoc-nganh-gi-o-my-de-xin-viec-nhat.html -->
     </div>
             </div> 
			 <!---end DU Há»C-->
     <!---Má»¥c HÆ¯á»NG NGHIá»P-->
     <div id="newitem_other_link2" >
     <div id="huongnghiep">
     <div class="title"><h5 style="text-align: center;"><img src="resources/img/image_interface/templatemo_menu_hover.png" style="margin-right:10px;">HÆ°á»ng nghiá»p</h5></div>
     <div id="image_item_hng"><img src="resources/img/image_hinhanh/hng2.PNG"></div>
     <div id="text_item_hng"><a href=""><h6>Những câu hỏi đặt ra khi chọn nghề (Các bước chọn ngành nghề)</h6></a>
<p>Để chọn nghề nghiệp phù hợp, không đơn giản chỉ là chọn theo sở thích, hãy cùng khám phá bản thân để biết bạn ở đâu? cần gì? và phải làm như thế nào? để có thể chọn cho mình một nghề nghiệp phù hợp.</p></div> <!--thamkhao: http://www.huongnghiepviet.com/v3/huong-nghiep/khoa-hoc-huong-nghiep/28-nhung-cau-hoi-dat-ra-khi-chon-nghe-cac-buoc-chon-nganh-nghe -->
     </div> 
     <div id="link_hng">
     <ul>
        <li><a href=""><strong>Điều kiện sơ loại, cách tính điểm xét tuyển vào ĐH Bách khoa Hà Nội 2016</strong></a></li>
     <li><a href=""><strong>Hướng dẫn đăng ký học bổ túc cấp 2, cấp 3</strong></a></li> <!--thamkhao: http://www.huongnghiepviet.com/v3/ -->
     <li><a href=""><strong>Điều kiện sơ loại, cách tính điểm xét tuyển vào ĐH Bách khoa Hà Nội 2016</strong></a></li>
     </ul>
     </div>
     </div>
     <!---end Má»¥c HÆ¯á»NG NGHIá»P-->
     
     <!--- Má»¥c Dáº Y CON-->
      <div id="newitem_other_link2" >
     <div id="daycon">
     <div class="title"><h5 style="text-align: center;"><img src="resources/img/image_interface/templatemo_menu_hover.png" style="margin-right:10px;">Dáº¡y con</h5></div>
     <div id="image_item_dcon"><img src="resources/img/image_hinhanh/daycon1.jpg"></div>
      <div id="text_item_dcon"><a href=""><h6>Tư vấn "Dạy con tuổi teen tự lập - thách thức với cha mẹ" </h6></a>
<p>Chiều nay, Trường THPT FPT phối hợp với báo Dân trí tổ chức buổi tư vấn với chủ đề "Dạy con tuổi teen tự lập - thách thức với cha mẹ" nhằm chia sẻ những định hướng về việc giáo dục con trong độ tuổi 15. Mời bạn đọc theo dõi buổi tư vấn.</p></div>
<!--thamkhao chi tiet link trên: http://tuyensinh.dantri.com.vn/giao-duc-khuyen-hoc/tu-van-day-con-tuoi-teen-tu-lap-thach-thuc-voi-cha-me-20160407140108051.htm -->
     </div> 
     <div id="link_daycon"><ul>
     <li><a href=""><strong>Dạy con biết cảm thông để sống hạnh phúc hơn</strong></a></li><!--thamkhao: http://www.webtretho.com/forum/f4407/day-con-biet-cam-thong-de-song-hanh-phuc-hon-2152146/ -->
     <li><a href=""><strong>Làm sao để dạy con thói quen lịch sự</strong></a></li> <!--thamkhao: http://www.webtretho.com/forum/f3771/lam-sao-de-day-con-thoi-quen-lich-su-2141557/ --->
     <li><a href=""><strong>Dạy con những bài học đầu tiên</strong></a> </li><!--thamkhao: http://www.webtretho.com/lamme/nuoi-day-con/cung-con-phat-trien-tre-1-5-tuoi/day-con-nhung-bai-hoc-dau-tien/ -->
     </ul>
     </div>
     </div>
     <!---end Má»¥c Dáº Y CON-->
     </div>
     <!--end midle2_left--> 
     
     <!--midle2_right--> 
     <div id="midle2_right">
       <div id="midle2_radio">
       <div id="radio">
     <div class="title"><h5 style="text-align: center;"><img src="resources/img/image_interface/templatemo_menu_hover.png" style="margin-right:10px;">Radio</h5></div>
      <div id="playradio"><audio src="resources/img/mp3/giaoduc120215.mp3" controls style="width: 186px;
    margin-left: 4px;"/></div>
    <marquee><div id="noidung_play"><strong>
                          Radio đang phát - Tư vấn chọn trường học Tiếng Anh</strong>
                        </div></marquee>
     </div>
     <!--link MP3-->
     
     <ul>
     <li><a href="">Tư vấn du học</a></li>
     </br>
     <li><a href="">Tư vấn tuyển sinh</a></li>
     </br>
     <li><a href="">Tư vấn hướng nghiệp</a></li></br>
     </ul>
     </div>
     <!--end midle2_radio--> 
     <!--2 banner quáº£ng cÃ¡o-->
     <div id="quangcao"><img src="resources/img/image_hinhanh/qc1.jpg"></div>
     <div id="quangcao"><img src="resources/img/image_hinhanh/qc2.jpg"></div>
     <!--end 2 banner quáº£ng cÃ¡o-->
     </div>
     <!--end midle2_right--> 
     
     </div>
  <!--káº¿t thÃºc midle2-->

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
  <!--káº¿t thÃºc footer-->
  <!--gotop -->  
  <div id="go_top" title="Go top" style="display: block;"><a href="#" id="go_top" style="display: inline;">
  </a></div>
  <script type="text/javascript">
		(function(){
			// áº¨n hiá»n icon go-top
			$(window).scroll(function(){
				if( $(window).scrollTop() == 0 ) {
					$('#go_top').stop(false,true).fadeOut(600);
				}else{
					$('#go_top').stop(false,true).fadeIn(600);
				}
			});
			
			// Cuá»n trang lÃªn vá»i scrollTop
			$('#go_top').click(function(){
				$('body,html').animate({scrollTop:0},400);
				return false;
			})
		})(jQuery);
		</script>
        <!--end gotop -->  
</div>

</body>
</html>
>>>>>>>>>>>>>>