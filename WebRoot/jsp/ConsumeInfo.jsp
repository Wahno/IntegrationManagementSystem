<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>客户信息</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
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
<!-- tables -->
<link rel="stylesheet" type="text/css" href="css/table-style.css" />
<link rel="stylesheet" type="text/css" href="css/basictable.css" />
<script type="text/javascript" src="js/jquery.basictable.min.js"></script>
<script type="application/x-javascript">addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);
	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#table').basictable();

		$('#table-breakpoint').basictable({
			breakpoint : 768
		});

		$('#table-swap-axis').basictable({
			swapAxis : true
		});

		$('#table-force-off').basictable({
			forceResponsive : false
		});

		$('#table-no-resize').basictable({
			noResize : true
		});

		$('#table-two-axis').basictable();

		$('#table-max-height').basictable({
			tableWrapper : true
		});
	});
</script>
<style type="text/css">
	/*
	 这是输入框的样式
	可以直接定义input{color:#ccc;border:   ;}等全局属性。所有Input的文本框都会应用该样式。
	可以定义某种类型文本框，比如 input[type='text']{}就是所有文本框类型为text的都应用该样式。
	可以直接给某个input添加class，然后给指定的class进行样式渲染，比如<input type="button" class="inp-btn"/>那么就给 .inp-btn{}添加样式即可。
	*/
	input{
			border-style:none none solid none;  /*上右下左*/
			background-color:transparent;
			width:40px;
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
					<li class="breadcrumb-item"><a href="./Main">控制台</a> <i
						class="fa fa-angle-right"></i></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->

				<div class="agile-grids">
					<!-- tables -->

					<div class="agile-tables">
						<div class="w3l-table-info">
							<h2>所有客户信息</h2>
							<table id="table">
								<thead>
									<tr>
										<th>客户卡号</th>
										<th>客户姓名</th>
										<th>性别</th>
										<th>电话</th>
										<th>手机</th>
										<th>地址</th>
										<th>余积分数</th>
										<th>总消费</th>
										<th>总成本</th>
										<th>总盈利</th>
										<th>登记日期</th>
										<th>职工姓名</th>
										<th>备注</th>
									</tr>
								</thead>
								<tbody>
								<!-- 上右下左 -->
									<tr>
										<td><input name="id" type="text" value="123456789" style="border-style: none none solid none ;background-color:transparent;"/></td>
										<td><input name="id" type="text" value="wagnniam" style="border-style: none none solid none ;background-color:transparent;"/></td>
										<td>aaa</td>
										<td>0129</td>
										<td>1209</td>
										<td>谢家村</td>
										<td>0192</td>
										<td>50</td>
										<td>60</td>
										<td>10</td>
										<td>10.20</td>
										<td>等日天</td>
										<td>这是个穷逼</td>
									</tr>
							
								</tbody>
							</table>
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

