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

</head>

<body>
	<div class="page-container">
		<div class="left-content">
			<div class="mother-grid-inner">
				<jsp:include page="baseJsp/Header.jsp"></jsp:include>
				<!-- Item begin -->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="index.html">客户信息</a><i
						class="fa fa-angle-right"></i>修改客户</li>
				</ol>
				<div class="breadcrumb" style=" height:70px;"> <!-- 这是搜索框后面的白色背景 -->
					<div class="w3layouts-left" style="width:300px;height:60px;background-color:#ffcc00;float:left;"> 
						<!--search-box-->
							<div class="w3-search-box" >
								<form action="toUserUpdate" method="post">
									<input name ="searchUser" type="text" placeholder="输入客户ID搜索" required=""/>	
									<input type="submit" value="">					
								</form>
							
							</div>
							<!--//end-search-box-->
					 </div>
					<div class="alert alert-warning" style="height:60px;" >
								<strong>客户ID和注册时间不可修改<br>${returnMessage}</strong>		<!-- 这是提示信息显示栏 -->
					</div>			
				</div>
			</div>
				<!-- Item end -->
				<!-- Main begin -->
				<div class="validation-system">
					<!-- 这是大背景 -->
					
					<div class="validation-form">
						<!---->

						<form action="UserUpDateToSql" method="post">
							<div class="vali-form">
								<div class="col-md-6 form-group1">
									<label class="control-label">客户卡号</label> <input name="uIdStr"
										type="text" placeholder="123456" value ="${usermessage.uId}" required="" readonly="readonly"><!-- id不可以修改 -->
								</div>																				
								<div class="col-md-6 form-group1 form-last">
									<label class="control-label">客户姓名</label> <input name="uName"
										type="text" value ="${usermessage.uName }" required="">
								</div>
								<div class="clearfix"></div>
							</div>

							<div class="col-md-12 form-group2 group-mail">
								<label class="control-label">客户性别</label> <select name="uSex" >
								 <!-- 此处 c:if /c:if不能放进option中，代码正确，但eclipse会报错 -->
									<c:if test="${usermessage.uSex==0}" >     
										<option value="0">男</option>
										<option  value="1">女</option>
									</c:if>
									<c:if test="${usermessage.uSex==1}">
										<option  value="1">女</option>
										<option value="0">男</option>
									</c:if>
								</select>
							</div>
							<div class="col-md-12 form-group1 group-mail">
								<label class="control-label ">出生日期</label> <input name="uBirth"
									type="Date"
									class="form-control1 ng-invalid ng-invalid-required"
									ng-model="model.date" value ="${usermessage.uBirth }">
							</div>
							<div class="clearfix"></div>
							<div class="vali-form">
								<div class="col-md-6 form-group1">
									<label class="control-label">客户电话</label> <input name="uTel"
										type="text" value ="${usermessage.uTel }">
								</div>
								<div class="col-md-6 form-group1 form-last">
									<label class="control-label">客户手机</label> <input name="uPhoNum"
										type="text" value ="${usermessage.uPhoNum }" required="">
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="col-md-12 form-group1 group-mail">
								<label class="control-label">客户地址</label> <input name="uAddr"
									type="text" value ="${usermessage.uAddr }">
								<p class=" hint-block">格式:X省X市X县X街道</p>
							</div>
							<div class="col-md-12 form-group1 group-mail">
								<label class="control-label ">注册日期</label> <input id="uRegDate" name="uRegDate"
									type="text"
									class="form-control1 ng-invalid ng-invalid-required"
									ng-model="model.date"  value ="${usermessage.uRegDate }" readonly="readonly">
							</div>

							<div class="clearfix"></div>
							<div class="col-md-12 form-group1 ">
								<label class="control-label">备注</label>
								<textarea name="uRemark">${usermessage.uRemark}</textarea>
							</div>
							<div class="clearfix"></div>

							<div class="clearfix"></div>

							<div class="col-md-12 form-group">
								<input  type="hidden" name="updateUser"value="${usermessage.uId}"/>
								<button type="submit" class="btn btn-primary">修改</button>
								<button type="reset" class="btn btn-default">重置</button>
							</div>
							<div class="clearfix"></div>
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