<%@ page language="java" import="java.util.*" import="com.mybean.data.*" pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>积分管理系统登陆</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="" />

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css/morris.css" type="text/css" />
<!-- Graph CSS -->
<link href="css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="css/jquery-ui.css">
<!-- jQuery -->
<script src="js/jquery-2.1.4.min.js"></script>
<!-- //jQuery -->
<link
	href='http://fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
<!-- //lined-icons -->


</head>

<body>
	<div class="main-wthree">
		<div class="container">
			<div class="sin-w3-agile">
				<h2>找回密码</h2>
				<form action="./ForgetPassword" method="post">
					<div class="username">
						<span class="username">ID:</span> <input type="text"
							name="id" class="name" placeholder="" required="">
						<div class="clearfix"></div>
					</div>
					<div class="username">
						<span class="username">手机号:</span> <input type="text"
							name="phone" class="name" placeholder="" required="">
						<div class="clearfix"></div>
					</div>
					<div class="password-agileits">
						<span class="username">新的密码:</span> <input type="password"
							name="password" class="password" placeholder="" required="">
						<div class="clearfix"></div>
					</div>
					<div class="password-agileits">
						<span class="username">确认密码:</span> <input
							type="password" name="passwordAgain" class="password" placeholder=""
							required="">
						<div class="clearfix"></div>
					</div>
					<div class="rem-for-agile">
						<a href="./">返回登陆页</a><br />
					</div>
					<div class="login-w3">
						<input type="submit" class="login" value="找回密码">
					</div>
					<div class="clearfix"></div>
				</form>
				<div class="footer">
					<p>
						Copyright &copy; 2018 . All Rights Reserved | Design by <a
							href="http://www.haocean.wang">Haocean</a> .<br/>
							And <a href="https://github.com/hao0129/IntegrationManagementSystem">Our Project Address</a> .
					</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>