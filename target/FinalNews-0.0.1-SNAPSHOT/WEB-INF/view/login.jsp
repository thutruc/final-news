
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--  script src="${pageContext.request.contextPath}/resources/jquery-1.9.1.js" type="text/javascript"></script>-->
<script src="${pageContext.request.contextPath}/resources/ckeditor/ckeditor.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/ckeditor/adapters/jquery.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ckediter</title>
</head>
<body>
Xin chào! 1111
<div id="center_cache_number" >
	                        <span class="capt_cha"></span>
	                    </div>

<textarea id="editor1" name="editor1">&lt;p&gt;Initial value.&lt;/p&gt;</textarea>
<br>
 <script type="text/javascript">
 <ckfinder:setupCKEditor basePath="/ckfinder/" editor="editor1" />
CKEDITOR.replace( 'editor1',
    {
        toolbar : 'Basic',
        uiColor : '#9AB8F3'
    });
var editor = CKEDITOR.replace( 'editor1' );
CKFinder.setupCKEditor( editor, '/ckfinder/' );
   </script>
   <script type="text/javascript">
            randomCaptcha();
            function randomCaptcha() {
                var a = Math.ceil(Math.random() * 10);
                var b = Math.ceil(Math.random() * 10);
                var c = a + b;
               
                $(".capt_cha").html(a + " + " + b);
            }
           
            </script>
</body>
</html>