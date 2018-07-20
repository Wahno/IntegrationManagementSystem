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
				<jsp:include page="baseJsp/Header.jsp"></jsp:include>
				<!-- Item begin -->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="./Main">控制台</a> <i class="fa fa-angle-right"></i></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
							<!--grid-->
					<div class="panel1 button-sizes">
						<div class="panel-heading">
							<div class="panel-title pn">
								<h3 class="mtn mb10 fw400">导出表格</h3>
								<div >
									<input value="Tip:${returnMessage}" readonly="readonly" style="width:400px;"/>
								</div>
							</div>
						</div>
						<section id="new">
							<div class="row fontawesome-icon-list">
								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="toExportUserInfo"><i class="fa fa-copy"
										aria-hidden="true"></i> 导出查询用户表格</a>
								</div>

								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="toExportAllUserInfo"><i class="fa fa-repeat"
										aria-hidden="true"></i>导出所有用户表格</a>
								</div>
			
								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="toExportGoodsInfo"><i class="fa fa-table"
										aria-hidden="true"></i>导出查询商品表格</a>
								</div>
								
							</div>
						</section>
					
						<section id="new">
							<div class="row fontawesome-icon-list">
								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="toExportAllGoodsInfo"><i class="fa fa-copy"
										aria-hidden="true"></i>导出所有商品信息</a>
								</div>

								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="toExportConsumeInfo"><i class="fa fa-repeat"
										aria-hidden="true"></i> 导出查询消费信息</a>
								</div>
					
								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="toExportAllConsumeInfo"><i class="fa fa-table"
										aria-hidden="true"></i> 导出所有客户消费信息</a>
								</div>
							</div>
						</section>
						<section id="new">
							<div class="row fontawesome-icon-list">
								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="toExportStaffInfo"><i class="fa fa-copy"
										aria-hidden="true"></i>导出查询员工信息</a>
								</div>

								<div class="icon-box col-md-3 col-sm-4">
									<a class="agile-icon" href="toExportAllStaffInfo"><i class="fa fa-repeat"
										aria-hidden="true"></i> 导出所有员工信息</a>
								</div>
							</div>
						</section>
					</div>
					<!----->
				<!-- Main end -->
				<jsp:include page="baseJsp/Footer.jsp"></jsp:include>
			</div>
		</div>
		<jsp:include page="baseJsp/SidebarMenu.jsp"></jsp:include>
	</div>
	<jsp:include page="baseJsp/MenuScript.jsp"></jsp:include>
</body>
</html>