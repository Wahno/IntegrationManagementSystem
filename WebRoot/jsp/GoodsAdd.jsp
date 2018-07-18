<%@ page language="java" import="java.util.*" import="com.mybean.data.*"
	pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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

<script type="text/javascript">
function t(){
var now= new Date();
var y=now.getFullYear();
var mo=now.getMonth()+1;
var d=now.getDay();
var h=now.getHours();
var mi=now.getMinutes();
var s=now.getSeconds(); 
var tt=y+"-"+mo+"-"+d+"-"+h+"-"+mi+"-"+s;
document.getElementById("uRegDate").value=tt;
}
setInterval('t()',500);
</script>

</head>

<body>
	<div class="page-container">
		<div class="left-content">
			<div class="mother-grid-inner">
				<jsp:include page="baseJsp/Header.jsp"></jsp:include>
				<!-- Item begin -->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="index.html">商品信息</a><i
						class="fa fa-angle-right"></i>添加商品</li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
				<div class="validation-system">
					<!-- 这是大背景 -->
					<div class="validation-form">
						<!---->

						<form action="GoodsAddToSql" method="post">
							<div class="vali-form">
								<div class="col-md-6 form-group1">
									<label class="control-label">商品ID</label> <input name="gIdtr"
										type="text" placeholder="123456" required="">
								</div>
								<div class="col-md-6 form-group1 form-last">
									<label class="control-label">商品名称</label> <input name="gName"
										type="text" placeholder="肥宅快乐水" required="">
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="vali-form">
								<div class="col-md-6 form-group1">
									<label class="control-label">商品数量</label> <input name="gNum"
										type="text" >
								</div>
								<div class="col-md-6 form-group1 form-last">
									<label class="control-label">商品成本</label> <input name="gCost"
										type="text" required="">
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="vali-form">
								<div class="col-md-6 form-group1">
									<label class="control-label">商品兑换所需积分</label> <input name="gExchange"
										type="text" placeholder="233" required="">
								</div>
								<div class="col-md-6 form-group1 form-last">
									<label class="control-label">商品备注</label> <input name="gRemark"
										type="text" placeholder="新品" required="">
								</div>
								<div class="clearfix"></div>
							</div>
						</form>

						<!---->
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