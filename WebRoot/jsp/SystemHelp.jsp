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
						<h2>1.系统更新说明</h2>
						<p>为了带给您更舒适的使用体验，高思学员系统全新上线！
							本次升级优化了学员系统的操作体验，让您使用各项功
							能更方便快捷。新增在线作业功能，开启网络学习新服务
							。页面视觉设计用色淡雅，风格清新，旧貌换新颜。希望
							新系统能给您的学业带来更多帮助！ 
							下面为您介绍新系统各项功能的操作指南：</p>
					</div>
					 <div class="questions">
						<h5>2.登录</h5>
						<p>用原竞赛系统、高思学习平台、家长社区的账号可以登录家长账号。
							用原高思学员系统账号可以登录学员账号。
								未绑定家长账号的学员首次登录，系统会提示您绑定家长账号。
								如果没有可绑定的账号，您可以注册家长账号并绑定。
								</p>
					 </div>	
					
					  <div class="questions">
						<h5>3.注册</h5>
						<p>家长请在家长登录区域，点击按钮【注册家长账号】，根据页面提示完成注册。
						学员请在学员登录区域，点击按钮【注册学员账号】，根据页面提示完成注册。
						学员注册分为有高思学号注册、没有高思学号注册两种情况。
						有高思学号的学员输入学号，并验证报班时填写的手机号，设置密码后即可完成注册。
						没有高思学号的学员，需完善个人信息并验证手机号。
						</p>
					 </div>	
											
					  <div class="questions">
						<h5>4.添加用户信息</h5>
						<p>如果您是家长，要管理孩子的学习，可以在您的家长账号中添加学员。添加后，您便可以管理该学员的各种学习信息，如查看课程表，下载作业解答、家长版讲义等资料，查看课程成绩，网上调课转班、网上报班、网上报名竞赛考试、查看成绩分析报告等。
						添加方式：登录家长账号，点击左侧导航栏中“我的学员”旁边的按钮【添加】，在打开的添加学员页面中，选择您要添加的学员类型，根据页面提示完成操作即可。
						如果你的孩子有高思学号，请选择“孩子是高思学员”，进行添加；如果您的孩子没有高思学号，请选择“孩子不是高思学员”，进行添加。
						</p>
					 </div>	
					  <div class="questions">
						<h5>5.移除用户</h5>
						<p>只要不是傻子就会用！</p>
					 </div>	
					  <div class="questions">
						<h5>6.修改信息</h5>
						<p>点击左侧导航栏“个人信息”，进入您的个人信息页面。您可以修改您的账号信息。
						家长账号可以修改本账号的密码、联系方式，还可以修改已添加学员的基本信息、联系方式等。
						学员账号可以修改本账号的密码、联系方式、基本信息等内容。其中学号、手机号、邮箱可以直接修改。姓名、性别、年级等信息需填写修改申请，管理员审核通过后，方可完成修改。
						如果您在修改过程中遇到问题，请与管理员高小思（gaoxiaosi@gaosiedu.com）联系。
						</p>
					 </div>	
					  <div class="questions">
						<h5>最后</h5>
						<p>我们期待您的建议，倾听您的意见
						我们做的一切工作都是希望能给您带来舒适的网络教育体验。如果您有任何的意见、建议、需求，欢迎与我们的管理员高小思联系，我们会根据大家的意见和建议不断的优化系统。谢谢您的支持! 
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