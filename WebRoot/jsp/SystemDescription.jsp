<%@ page language="java" import="java.util.*" import="com.mybean.data.*" pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>系统说明</title>
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
					<li class="breadcrumb-item"><a href="Main">控制台</a> <i class="fa fa-angle-right"></i><a href="toSystemDescription">系统说明</a></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
				<!-- faq -->
				
				
				
				<div class="asked">
					<div class="questions">
						<h2>1.该系统面对的用户</h2>
						<p>客户消费获得积分后可参与积分兑换礼品活动的商家或公司。</p>
					</div>
					 <div class="questions">
						<h5>2.系统的主要功能</h5>
						<p>用于客户消费后可以用积分兑换礼品的商家或公司，该系统管理有关
						消费、积分、客户、管理员和员工等数据信息，用于兑换礼品。</p>
					 </div>	
					
					  <div class="questions">
						<h5>3.系统的开发人员</h5>
						<p> 8000116109 王浩</p>
						<p> 8000116110 李宗儒</p>
						<p> 8000116112 方志强</p>
						<p> 8000116116 邓昊成</p>
					 </div>	
					
					  <div class="questions">
						<h5>4.开发时间线</h5>
						<p> 2018.07.09——2018.07.20 </p>
					 </div>	
					  <div class="questions">
						<h5>5.历史版本下载链接地址</h5>
						<p> <a
							href="https://github.com/hao0129/IntegrationManagementSystem">https://github.com/hao0129/IntegrationManagementSystem</a></p>
					 </div>	
					  <div class="questions">
						<h5>6.联系我们</h5>
						<p> QQ:843021061</p>
						<p> 电话:15180450316</p>
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