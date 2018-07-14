<%@ page language="java" import="java.util.*" import="com.mybean.data.*" pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
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
					<li class="breadcrumb-item"><a href="./Main">控制台</a> <i class="fa fa-angle-right"></i><a href="./AdminMessage">个人信息</a></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
				<div class="grid_3 grid_4 w3_agileits_icons_page">
					<div class="grid_3 grid_5 w3ls">
						<h3>个人信息</h3>
						<%
							Admin admin = (Admin) session.getAttribute("adminmessage");
						%>
						<div class="alert alert-success" role="alert">
							<strong>ID：</strong><%=admin.getaId() %>
						</div>
						<div class="alert alert-info" role="alert">
							<strong>姓名：</strong><%=admin.getaName() %>
						</div>
						<div class="alert alert-warning" role="alert">
						<%
						String sex = "";
						if(admin.getaSex()==0)
							sex="男";
						else
							sex="女";
						 %>
							<strong>性别：</strong><%=sex %>
						</div>
						<div class="alert alert-danger" role="alert">
							<strong>电话：</strong><%=admin.getaTel() %>
						</div>
						<div class="alert alert-success" role="alert">
							<strong>手机：</strong><%=admin.getaPhoNum() %>
						</div>
						<div class="alert alert-info" role="alert">
							<strong>地址：</strong><%=admin.getaAddr() %>
						</div>
						<div class="alert alert-warning" role="alert">
						<%
							String limit;
							if(admin.getaLimit()==0)
								limit="管理员";
							else if(admin.getaLimit()==1)
								limit="操作员";
							else
								limit="其他";
						
						 %>
							<strong>权限：</strong><%=limit %>
						</div>
						<div class="alert alert-danger" role="alert">
							<strong>注册日期：</strong><%=admin.getaDate() %>
						</div>
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