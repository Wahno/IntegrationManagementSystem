<%@ page language="java" import="java.util.*" import="com.mybean.data.*" pageEncoding="UTF-8" deferredSyntaxAllowedAsLiteral="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
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
	href='http://fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700'rel='stylesheet' type='text/css'>
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
        breakpoint: 768
      });

      $('#table-swap-axis').basictable({
        swapAxis: true
      });

      $('#table-force-off').basictable({
        forceResponsive: false
      });

      $('#table-no-resize').basictable({
        noResize: true
      });

      $('#table-two-axis').basictable();

      $('#table-max-height').basictable({
        tableWrapper: true
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
                	<li class="breadcrumb-item"><a href="./main">控制台</a><i class="fa fa-angle-right"></i>客户信息</li>
            	</ol>
				<!-- Item end -->
				<!-- Consume begin -->
			
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
						  <tr>
							<td>123</td>
							<td>王尼玛</td>
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
						<td>Jill Smith</td>
						<td>25</td>
						<td>Female</td>
						<td>5'4</td>
						<td>British Columbia</td>
						<td>Volleyball</td>
					  </tr>
					  <tr>
						<td>John Stone</td>
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

					 
			<!---728x90--->
				  <h3>所有客户兑换信息</h3>				 
				  <table id="table-force-off">
					<thead>
					  <tr>
						<th>客户姓名</th>
						<th>客户卡号</th>
						<th>客户性别</th>
						<th>客户手机</th>
						<th>兑换日期</th>
						<th>兑换时间</th>
						<th>操作类型</th>
						<th>原积分数</th>
						<th>兑换商品名</th>
						<th>兑换数量</th>
						<th>所需积分数</th>
						<th>服务职工</th>
						<th>备注</th>		
					  </tr>
					</thead>
					<tbody>
					  <tr>
						<td>王尼玛</td>
						<td>12345678951</td>
						<td>难</td>
						<td>ga1562</td>
						<td>5156132165</td>
						<td>兑换时间</td>
						<td>ga1562类型</td>
						<td>原ga1562数</td>
						<td>ga1562商品名</td>
						<td>兑换数量</td>
						<td>ga1562所需积分</td>
						<td>服务职工</td>
						<td>备注</td>
					  </tr>
					</tbody>
				  </table>
				  </div>
				</div>
				<!-- //tables -->
			</div>
<!-- script-for sticky-nav -->
		<script>
		$(document).ready(function() {
			 var navoffeset=$(".header-main").offset().top;
			 $(window).scroll(function(){
				var scrollpos=$(window).scrollTop(); 
				if(scrollpos >=navoffeset){
					$(".header-main").addClass("fixed");
				}else{
					$(".header-main").removeClass("fixed");
				}
			 });
			 
		});
		
		
		
		
		
		</script>
				<!-- Consume end -->
				
				
				
				<jsp:include page="baseJsp/Footer.jsp"></jsp:include>
			</div>
		</div>
		<jsp:include page="baseJsp/SidebarMenu.jsp"></jsp:include>
	</div>
	<jsp:include page="baseJsp/MenuScript.jsp"></jsp:include>
</body>
</html>

