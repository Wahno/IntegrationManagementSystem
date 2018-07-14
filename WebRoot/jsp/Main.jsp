<%@ page language="java" import="java.util.*" import="com.mybean.data.*" pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>控制台</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript">addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);
	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css/lightbox.css">
<link href="css/font-awesome.css" rel="stylesheet">
<script src="js/jquery-2.1.4.min.js"></script>
<link
	href='http://fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
</head>
<body>
	<div class="page-container">
		<div class="left-content">
			<div class="mother-grid-inner">
				<div class="header-main">
					<div class="logo-w3-agile">
						<h1>
							<a href="./Main">积分管理系统</a>
						</h1>
					</div>
					<%
						Admin admin = (Admin) request.getAttribute("admin");
					%>
					<div class="profile_details w3l">
						<ul>
							<li class="dropdown profile_details_drop">
							  <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
									<div class="profile_img">
										<%
											if (admin.getaSex() == "女") {
										%>
										<span class="prfil-img"><img src="images/woman.png"
											alt=""> </span>
										<%
											} else {
										%>
										<span class="prfil-img"><img src="images/man.png"
											alt=""> </span>
										<%
											}
										%>
										<div class="user-name">

											<p><%=admin.getaName()%></p>
											<%
												String str = "";
												if (admin.getaLimit() == 0)
													str = "管理员";
												else if (admin.getaLimit() == 1)
													str = "操作员";
												else
													str = "其他";
											%>
											<span><%=str%></span>
										</div>
										<i class="fa fa-angle-down"></i> <i class="fa fa-angle-up"></i>
										<div class="clearfix"></div>
									</div>
							  </a>
								<ul class="dropdown-menu drp-mnu">
									<li><a href="#"><i class="fa fa-cog"></i> 设置</a></li>
									<li><a href="#"><i class="fa fa-user"></i> 个人信息</a></li>
									<li><a href="./Logout"><i class="fa fa-sign-out"></i>退出</a></li>
								</ul>
							</li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>

				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="/Main">控制台</a> <i class="fa fa-angle-right"></i></li>
				</ol>
				
				
				<jsp:include page="Menu.jsp" flush="true" />
				
				
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
					<p>Copyright &copy; 2018. All rights reserved.| Design by <a
							href="http://www.haocean.wang">Haocean </a>.</p>
				</div>
			</div>
		</div>
		<div class="sidebar-menu">
			<header class="logo1"> <a href="#" class="sidebar-icon">
				<span class="fa fa-bars"></span>
			</a> </header>
			<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
			<div class="menu">
				<ul id="menu">
					<li><a href="./Main"> <i class="fa fa-tachometer"></i>
							<span>控制台</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="nav.jsp"> <i
							class="fa fa-list-ul" aria-hidden="true"></i> <span>客户信息</span>
							<div class="clearfix"></div></a></li>
					<li><a href="gallery.html"> <i class="fa fa-bar-chart"></i>
							<span>客户消费</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="charts.html"> <i
							class="fa fa-list-ul" aria-hidden="true"></i> <span>员工信息</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="#"> <i
							class="fa fa-bar-chart"></i> <span>员工业绩</span><span
							class="fa fa-angle-right" style="float: right"></span>
							<div class="clearfix"></div></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a href="icons.html">Icons</a></li>
							<li id="menu-academico-avaliacoes"><a href="typography.html">Typography</a></li>
							<li id="menu-academico-avaliacoes"><a href="faq.html">Faq</a></li>
						</ul></li>
					<li id="menu-academico"><a href="errorpage.html"> <i
							class="fa fa-table"></i> <span>查询操作</span>
							<div class="clearfix"></div></a></li>
					<li><a href="tabels.html"> <i class="fa fa-table"></i> <span>数据统计</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="#"> <i class="fa fa-cogs"
							aria-hidden="true"></i> <span>管理商品</span> <span
							class="fa fa-angle-right" style="float: right"></span>
							<div class="clearfix"></div></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a href="button.html">Buttons</a></li>
							<li id="menu-academico-avaliacoes"><a href="grid.html">Grids</a></li>
						</ul></li>
					<li><a href="maps.html"> <i class="fa fa-cogs"
							aria-hidden="true"></i> <span>积分设置</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="#"> <i
							class="fa fa-file-text-o"></i> <span>数据管理</span><span
							class="fa fa-angle-right" style="float: right"></span>
							<div class="clearfix"></div></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-boletim"><a href="calendar.html">Calendar</a></li>
							<li id="menu-academico-avaliacoes"><a href="signin.html">Sign
									In</a></li>
							<li id="menu-academico-avaliacoes"><a href="signup.html">Sign
									Up</a></li>
						</ul></li>
					<li><a href="#"> <i class="fa fa-check-square-o nav_icon"></i>
							<span>系统说明</span><span class="fa fa-angle-right"
							style="float: right"></span>
							<div class="clearfix"></div></a>
						<ul>
							<li><a href="input.html"> Input</a></li>
							<li><a href="validation.html">Validation</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
	<script>
		var toggle = true;
	
		$(".sidebar-icon").click(function() {
			if (toggle) {
				$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
				$("#menu span").css({
					"position" : "absolute"
				});
			} else {
				$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
				setTimeout(function() {
					$("#menu span").css({
						"position" : "relative"
					});
				}, 400);
			}
	
			toggle = !toggle;
		});
	</script>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>