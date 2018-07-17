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
					<li class="breadcrumb-item"><a href="index.html">客户信息</a><i
						class="fa fa-angle-right"></i>查询客户
				</ol>
				<ol class="breadcrumb">
					
						<!--search-box-->
								<div class="w3-search-box" style="background:#ffCF41;">
									<form action="./toUserSelect" method="post" >
										<input name="searchUser" type="text" placeholder="输入客户id搜索." required="">	
										<input type="submit" value="">					
									</form>
								</div>
						
				
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
				<div class="grid_3 grid_4 w3_agileits_icons_page">
					<div class="grid_3 grid_5 w3ls">
						<h3>客户信息</h3>
						<%
							//User user = (User) session.getAttribute("usermessage");
							
							
						%>
						<div class="alert alert-success" role="alert">
							<strong>你的卡号：</strong>${usermessage.Uid}
						</div>
						<div class="alert alert-info" role="alert">
							<strong>姓名：</strong>${usermessage.Uname }
						</div>
						<div class="alert alert-warning" role="alert">
						<%String sex=""; %>
						<c:if test="${usermessage.Usex==0}"><%sex="男"; %></c:if>
						<c:if test="${usermessage.Usex==1}"><%sex="女"; %> </c:if>
						<strong> 性别：</strong>${usermessage.Usex }
						</div>
						<div class="alert alert-danger" role="alert">
							<strong>电话：</strong>${usermessage.Utel}
						</div>
						<div class="alert alert-success" role="alert">
							<strong>手机：</strong>${usermessage.UphoNum}
						</div>
						<div class="alert alert-info" role="alert">
							<strong>生日：</strong>${usermessage.Ubirth }
						</div>
						<div class="alert alert-info" role="alert">
							<strong>注册日期：</strong>${usermessage.UregDate }
						</div>
						<div class="alert alert-info" role="alert">
							<strong>地址：</strong>${usermessage.Uaddr }
						</div>
						<div class="alert alert-info" role="alert">
							<strong>备注：</strong>${usermessage.Uremark }
						</div>
						<div class="alert alert-warning" role="alert">
						
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