<%@ page language="java" import="java.util.*" import="com.mybean.data.*" pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>个人信息</title>
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
					<li class="breadcrumb-item"><a href="index.html">员工信息</a><i
						class="fa fa-angle-right"></i>查询员工业绩
				</ol>
				<div class="breadcrumb" style=" height:70px;"> <!-- 这是搜索框后面的白色背景 -->
					<div class="w3layouts-left" style="background-color:#cc41ff;height:60px;margin-top:0px;"> 
						<!--search-box-->
							<div class="w3-search-box" ">
								<form action="toStaffPerfSelect" method="post">
									<input name ="searchStaffPerf" type="text" placeholder="输入员工ID搜索" required="">	
									<input type="submit" value="">					
								</form>
							</div><!--//end-search-box-->
						<div class="clearfix"> </div>
					 </div>				
				</div>
			
				<!-- Item end -->
				<!-- Main begin -->
					
				<div class="grid_3 grid_4 w3_agileits_icons_page">
					<div class="alert alert-warning" >
							<strong>${returnMessage}</strong>		
					</div>
					<div class="grid_3 grid_5 w3ls">
						<h3>员工业绩</h3>
						<div class="alert alert-success" role="alert">
							<strong>员工号：</strong>${staffperfmessage.sId}
						</div>
						<div class="alert alert-info" role="alert">
							<strong>姓名：</strong>${staffperfmessage.sName }
						</div>
						<div class="alert alert-warning" role="alert">
							<strong>助记符：</strong>${staffperfmessage.sRemark }
						</div>		
						<div class="alert alert-success" role="alert">
							<strong>销售量：</strong>${staffperfmessage.sNum}
						</div>
					
						<div class="alert alert-info" role="alert">
							<strong>销售金额：</strong>${staffperfmessage.sMoney }
						</div>
						<div class="alert alert-info" role="alert">
							<strong>备注：</strong>${staffperfmessage.sRemark }
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
