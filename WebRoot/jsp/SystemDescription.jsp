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
					<li class="breadcrumb-item"><a href="./Main">系统说明</a> <i class="fa fa-angle-right"></i></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
				<!-- faq -->
				
				
				
				<div class="asked">
					<div class="questions">
						<h2>1.该系统能面对的用户?</h2>
						<p>早上起来我洗头，万千蝌蚪水中游，不是爸爸不爱你，只是妈妈不挽留。</p>
					</div>
					 <div class="questions">
						<h5>2.系统的主要功能</h5>
						<p>^^^^^^^^^^^^^^^^^</p>
					 </div>	
					
					  <div class="questions">
						<h5>3.系统的开发公司和人员</h5>
						<p> 强强科集团</p>
					 </div>	
					
					  <div class="questions">
						<h5>4.开发时间线</h5>
						<p> 那是一个秋天 </p>
					 </div>	
					  <div class="questions">
						<h5>5.历史版本下载链接地址</h5>
						<p> http://localhost:8080/IntegrationManagementSystem/toSystemDescription</p>
					 </div>	
					  <div class="questions">
						<h5>6.公司简介</h5>
						<p> 强强科集团成立于~~~~~</p>
					 </div>	
					  <div class="questions">
						<h5>7.日你妈的b凌晨一点了</h5>
						<p> rnmlgb</p>
					 </div>				    

				</div>
				<!-- //faq -->
				<!-- Main end -->
				<jsp:include page="baseJsp/Footer.jsp"></jsp:include>
			</div>
		</div>
		<jsp:include page="baseJsp/SidebarMenu.jsp"></jsp:include>
	</div>
	<jsp:include page="baseJsp/MenuScript.jsp"></jsp:include>
</body>
</html>