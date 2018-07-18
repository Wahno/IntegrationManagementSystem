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
					<li class="breadcrumb-item"><a href="./Main">控制台</a> <i class="fa fa-angle-right"></i><a href="./SetCredits">积分设置</a></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
				<div class="grid-form">
					<div class="grid-form1">
						<h2 id="forms-example" class="">积分设置</h2>
						<form class="form-inline" action="./SetCreditsToFile" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">客户自己来消费：消费</label> 
								<input type="text" class="form-control" name="customer" value="${Credit.customer }">
								<label for="exampleInputEmail1">元积1分</label>
							</div>
							<br />
							<div class="form-group">
								<label for="exampleInputEmail1">别人介绍消费：其中介绍人消费</label> 
								<input type="text" class="form-control" name="sponsor" value="${Credit.sponsor }">
									<label for="exampleInputEmail1">元积1分</label>
							</div>
							<br />
							<div class="form-group">
								<label for="exampleInputEmail1">别人介绍消费：其中客户消费</label> 
								<input type="text" class="form-control" name="sponsorAndCostomer" value="${Credit.sponsorAndCostomer }">
								<label for="exampleInputEmail1">元积1分</label>
							</div>
							<br />
							<button type="submit" class="btn-primary btn">提交</button>
						</form>
					</div>
				</div>
				<!-- Main end -->
				<jsp:include page="baseJsp/Footer.jsp"></jsp:include>
			</div>
		</div>
		<jsp:include page="baseJsp/SidebarMenu.jsp"></jsp:include>
	</div>
	<jsp:include page="baseJsp/MenuScript.jsp"></jsp:include>
</body>
</html>
