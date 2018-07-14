<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!-- jsp:include Footer begin-->

<script>
	$(document).ready(function() {
		var navoffeset = $(".header-main").offset().top;
		$(window).scroll(function() {
			var scrollpos = $(window).scrollTop();
			if (scrollpos >= navoffeset) {
				$(".header-main").addClass("fixed");
			} else {
				$(".header-main").removeClass("fixed");
			}
		});

	});
</script>


<div class="inner-block"></div>
<div class="copyrights">
	<p>
		Copyright &copy; 2018. All rights reserved.| Design by <a
			href="http://www.haocean.wang">Haocean </a>.
	</p>
</div>

<!-- jsp:include Footer end-->
