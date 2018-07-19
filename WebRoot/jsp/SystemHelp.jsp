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
					<li class="breadcrumb-item"><a href="Main">控制台</a> <i class="fa fa-angle-right"></i><a href="toSystemHelp">系统帮助</a></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->
				<!-- faq -->
				
				
				
				<div class="asked">
					<div class="questions">
						<h2>系统帮助</h2>
						<p>为了带给您更舒适的使用体验，积分管理系统全新上线啦！
							本次升级优化了图形界面，让您使用各项功
							能更方便快捷。新增在线功能，开启网络新服务
							。页面视觉设计用色淡雅，风格清新，旧貌换新颜。希望
							新系统能给您带来更多帮助！ 
							下面为您介绍新系统各项功能的操作指南：</p>
					</div>
					 <div class="questions">
						<h5>1.登录</h5>
						<p>用管理员账号可以登录账号。</p>
						<p>	默认： 账号0， 密码123456</p>
						<p>	如果没有账号，您可以联系管理员或者使用管理员身份注册账号。
								</p>
					 </div>	
					
					  <div class="questions">
						<h5>2.注册</h5>
						<p>使用管理员身份创建新的管理员或操作员。
						</p>
					 </div>	
											
					  <div class="questions">
						<h5>3.添加用户信息</h5>
						<p>如果您要管理客户的积分，可以在您的管理员账号中添加客户。添加后，您便可以管理该客户的各种信息，如管理客户基本信息，管理客户消费情况，管理员工信息，管理商品信息，查看员工业绩、设置积分情况、查看系统说明等。
						添加方式：登录管理员账号，如果想要管理客户信息，点击左侧导航栏中“客户信息”旁边的按钮【添加客户】，在打开的添加客户页面中，选择您要添加的客户类型，根据页面提示完成操作即可。
						如果想要管理员工信息，请点击左侧导航栏中“员工信息”旁边的按钮【添加员工】”，进行添加；如果想要积分信息，请点击左侧导航栏中的按钮【积分设置】”，进行变动。
						</p>
					 </div>	
					  <div class="questions">
						<h5>4.移除用户</h5>
						<p>点击左侧导航栏中“客户信息”旁边的按钮【移除客户】，在打开的添加客户页面中，选择您要添加的客户类型，根据页面提示完成操作即可。员工可以同样管理。</p>
					 </div>	
					  <div class="questions">
						<h5>5.修改信息</h5>
						<p>点击左侧导航栏“客户信息”旁边的按钮【修改客户】，在打开的添加客户页面中，进入信息页面。您可以修改客户的信息。
						点击左侧导航栏“员工信息”旁边的按钮【修改员工】，在打开的添加员工页面中，进入信息页面。您可以修改员工的信息。
						如果您在修改过程中遇到问题，请与管理员方志强（1432769669@qq.com）联系。
						</p>
					 </div>	
					  <div class="questions">
						<h5>最后</h5>
						<p>我们期待您的建议，倾听您的意见
						我们做的一切工作都是希望能给您带来舒适的网络服务体验。如果您有任何的意见、建议、需求，欢迎与我们的管理员方志强联系，我们会根据大家的意见和建议不断的优化系统。谢谢您的支持! 
						</p>
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