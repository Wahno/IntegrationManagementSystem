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
</head>
<body>
	<div class="page-container">
		<div class="left-content">
			<div class="mother-grid-inner">
				<jsp:include page="baseJsp/Header.jsp"></jsp:include>
				<!-- Item begin -->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="Main">控制台</a> <i
						class="fa fa-angle-right"></i></li>
				</ol>
				<!-- Item end -->
				<!-- Main begin -->

				<div class="agile-grids">
					<!-- tables -->

					<div class="agile-tables">
						<div class="w3l-table-info">
							<h3>所有客户积分信息</h3>
				  	<table id="table-breakpoint">
					<thead>
					  <tr>
						<th>客户卡号</th>
						<th>客户姓名</th>
						<th>客户性别</th>
						<th>客户手机</th>
						<th>当前积分</th>
						<th>备注</th>
					  </tr>
					</thead>
					<tbody>
					  <tr>
						<td>wangnima</td>
						<td>30</td>
						<td>Male</td>
						<td>5'9</td>
						<td>Ontario</td>
						<td>Badminton</td>
					  </tr>
					  <tr>
						<td>Jane Strip</td>
						<td>29</td>
						<td>Female</td>
						<td>5'6</td>
						<td>Manitoba</td>
						<td>Hockey</td>
					  </tr>
					  <tr>
						<td>Gary Mountain</td>
						<td>21</td>
						<td>Male</td>
						<td>5'8</td>
						<td>Alberta</td>
						<td>Curling</td>
					  </tr>
					  <tr>
						<td>James Camera</td>
						<td>31</td>
						<td>Male</td>
						<td>6'1</td>
						<td>British Columbia</td>
						<td>Hiking</td>
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

