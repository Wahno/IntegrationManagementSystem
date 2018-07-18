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

<style>
/*按钮样式。我把它写在这，懒得写在css里*/
	.button-delete{
	 	background-color: #cc41ff; /* 紫色 */
	    border: none;
	    color: white;
	    padding: 15px 32px;
	    text-align: center;
	    text-decoration: none;
	    display: inline-block;
	    font-size: 20px; /*按钮大小*/
	    border-radius: 15px; /*按钮圆角*/
	    transition-duration: 0.4s; /*hover渐变的时间*/
	}
	.button-delete:hover {
	    background-color: #4CAF50; /* Green */
	    color: white;
	    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);	/*鼠标悬停后显示阴影*/
 	}
 .button-delete:active {/*按钮动态效果*/
	  background-color: #3e8e41;
	  box-shadow: 0 5px #666;
	  transform: translateY(4px);
}
</style>
</head>

<body>
	<div class="page-container">
		<div class="left-content">
			<div class="mother-grid-inner">
				<jsp:include page="baseJsp/Header.jsp"></jsp:include>
				<!-- Item begin -->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="index.html">客户信息</a><i
						class="fa fa-angle-right"></i>移除客户
				</ol>
				<div class="breadcrumb" style=" height:70px;"> <!-- 这是搜索框后面的白色背景 -->
					<div class="w3layouts-left" style="width:300px;height:60px;background-color:#cc41ff;"> 
						<!--search-box-->
							<div class="w3-search-box" >
								<form action="toUserDelete" method="post">
									<input name ="searchUser" type="text" placeholder="输入客户ID搜索" required=""/>	
									<input type="submit" value="">					
								</form>
							</div>
							<!--//end-search-box-->
					 </div>
					 
					 <div style="height:60px;width:130px;float:left;margin-left:50px;">
					 	<form action="UserDeleteFromeSql" method="post">	
					 				<input name="deleteUser" type="hidden" value="${usermessage.uId}"/>
									<input class="button-delete" type="submit" value="删除用户"/>					
						</form>											
					</div>							
				</div>
			</div>
			
				<!-- Item end -->
				<!-- Main begin -->
				<div class="grid_3 grid_4 w3_agileits_icons_page">
					<div class="alert alert-warning" role="alert">
						<strong>${returnMessage}</strong>
					</div>
					<div class="grid_3 grid_5 w3ls">
						<h3>客户信息</h3>
						<div class="alert alert-success" role="alert">
							<strong>你的卡号：</strong>${usermessage.uId}
						</div>
						<div class="alert alert-info" role="alert">
							<strong>姓名：</strong>${usermessage.uName }
						</div>
						<div class="alert alert-warning" role="alert">
						<%!String sex=""; %>
						<c:if test="${usermessage.uSex==0}"><%sex="男"; %></c:if>
						<c:if test="${usermessage.uSex==1}"><%sex="女"; %> </c:if>
						<strong> 性别：</strong><%=sex %>
						<%sex=""; %>
						</div>
						<div class="alert alert-danger" role="alert">
							<strong>电话：</strong>${usermessage.uTel}
						</div>
						<div class="alert alert-success" role="alert">
							<strong>手机：</strong>${usermessage.uPhoNum}
						</div>
						<div class="alert alert-info" role="alert">
							<strong>生日：</strong>${usermessage.uBirth }
						</div>
						<div class="alert alert-info" role="alert">
							<strong>注册日期：</strong>${usermessage.uRegDate }
						</div>
						<div class="alert alert-info" role="alert">
							<strong>地址：</strong>${usermessage.uAddr }
						</div>
						<div class="alert alert-info" role="alert">
							<strong>备注：</strong>${usermessage.uRemark }
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