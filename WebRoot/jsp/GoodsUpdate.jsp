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
<title>商品添加</title>
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
					<li class="breadcrumb-item"><a href="index.html">商品信息</a><i
						class="fa fa-angle-right"></i>修改商品</li>
				</ol>
				<div class="breadcrumb" style=" height:70px;"> <!-- 这是搜索框后面的白色背景 -->
					<div class="w3layouts-left" style="width:300px;height:60px;background-color:#ffcc00;float:left;"> 
						<!--search-box-->
							<div class="w3-search-box" >
								<form action="toGoodsUpdate" method="post">
									<input name ="searchGoods" type="text" placeholder="输入商品ID搜索" required=""/>	
									<input type="submit" value="">					
								</form>
							
							</div>
							<!--//end-search-box-->
					 </div>
					<div class="alert alert-warning" style="height:60px;" >
								<strong>商品ID不可修改<br>${returnMessage}</strong>		<!-- 这是提示信息显示栏 -->
					</div>			
				</div>
			</div>
				<!-- Item end -->
				<!-- Main begin -->
				<div class="validation-system">
					<!-- 这是大背景 -->
					<div class="validation-form">
						<!---->
						<form action="GoodsUpDateToSql" method="post">
							<div class="vali-form">
								<div class="col-md-6 form-group1">
									<label class="control-label">商品ID</label> <input name="gIdStr"
										type="text" value="${goodsmessage.gId}" readonly="readonly" required="">
								</div>
								<div class="col-md-6 form-group1 form-last">
									<label class="control-label">商品名称</label> <input name="gName"
										type="text" value="${goodsmessage.gName}" required="">
								</div>
								<div class="clearfix"></div>
							</div>
							
							<div class="vali-form">
								<div class="col-md-6 form-group1 form-last">
									<label class="control-label">商品售价</label> <input name="gPriceStr"
										type="text" value="${goodsmessage.gPrice}"required="">
								</div>
								<div class="col-md-6 form-group1 form-last">
									<label class="control-label">商品成本</label> <input name="gCostStr"
										type="text" value="${goodsmessage.gCost}"required="">
								</div>
								<div class="clearfix"></div>
							</div>
							
							<div class="vali-form">
								<div class="col-md-6 form-group1">
									<label class="control-label">商品数量</label> <input name="gNumStr"
										type="text" value="${goodsmessage.gNum}">
								</div>
								
								<div class="col-md-6 form-group1">
									<label class="control-label">商品兑换所需积分</label> <input name="gExchangeStr"
										type="text" value="${goodsmessage.gExchange}"required="">
								</div>
							
								<div class="col-md-12 form-group1 ">
									<label class="control-label">商品备注</label>
									<textarea name="gRemark" placeholder="新品说明等备注">value="${goodsmessage.gRemark}"</textarea>
								</div>
								<div class="col-md-12 form-group">
									<input name="updateGoods" type="hidden" value="${goodsmessage.gId}"/>
									<button type="submit" class="btn btn-primary">保存</button>
									<button type="reset" class="btn btn-default">重置</button>
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