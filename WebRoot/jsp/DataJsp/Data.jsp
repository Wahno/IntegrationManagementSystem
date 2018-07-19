<%@ page language="java" import="java.util.*" import="com.mybean.data.*" pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>数据管理</title>
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
				<jsp:include page="../baseJsp/Header.jsp"></jsp:include>
				<!-- Item begin -->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="./Main">控制台</a> <i class="fa fa-angle-right"></i><a href="./Data">数据管理</a></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
				<div class="grid_3 grid_4 w3_agileits_icons_page">
					<div class="panel1 button-sizes">
						<div class="panel-heading">
							<div class="panel-title pn">
								<h3 class="mtn mb10 fw400">数据管理</h3>
							</div>
						</div>
						<section id="new">
							<div class="row fontawesome-icon-list">
								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="DataBackup"><i class="fa fa-copy"
										aria-hidden="true"></i> 备份数据信息</a>
								</div>

								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="DataRestore"><i class="fa fa-repeat"
										aria-hidden="true"></i> 恢复数据信息</a>
								</div>
								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="#"><i class="fa fa-bar-chart-o"
										aria-hidden="true"></i> 数据整合统计 </a>
								</div>

								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="#"><i class="fa fa-table"
										aria-hidden="true"></i> 导出表格信息</a>
								</div>
							</div>
						</section>
					</div>
				</div>
				<!-- Main end -->
				<jsp:include page="../baseJsp/Footer.jsp"></jsp:include>
			</div>
		</div>
		<jsp:include page="../baseJsp/SidebarMenu.jsp"></jsp:include>
	</div>
	<jsp:include page="../baseJsp/MenuScript.jsp"></jsp:include>
</body>
</html>