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
<!-- table样式 -->
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
function t(){
var now= new Date();
var y=now.getFullYear();
var mo=now.getMonth()+1;
var d=now.getDay();
var h=now.getHours();
var mi=now.getMinutes();
var s=now.getSeconds(); 
var date=y+"-"+mo+"-"+d;
var time=h+"-"+mi+"-"+s;
document.getElementById("cDate").value=date;
document.getElementById("cTime").value=time;
}
setInterval('t()',500);
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
			tableWrapper :true
		});
	});
</script>
<style type="text/css">
	input{
			border-style:none none solid none;  /*上右下左*/
			background-color:transparent;
			
	}
	.input-info{/*个人信息显示输入框宽度*/
			width:100px;
	}
	table{
	cellspacing:"0";
	cellpadding:"0";
	}
	table thead th{
	background-color:#ffcc66;/*表格头背景*/
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
					<li class="breadcrumb-item"><a href="index.html">客户消费</a><i
						class="fa fa-angle-right"></i>添加客户消费</li>
				</ol>
				<div class="breadcrumb" style=" height:70px;"> <!-- 这是搜索框后面的白色背景 -->
					<div class="w3layouts-left" style="width:300px;height:60px;background-color:#ffcc00;float:left;"> 
						<!--search-box-->
							<div class="w3-search-box" >
								<form action="toCosumeAdd" method="post">
									<input name ="searchUser" type="text" placeholder="输入消费客户ID搜索" required=""/>	
									<input type="submit" value="">					
								</form>					
							</div>
							<!--//end-search-box-->
					 </div>
					 <div class="alert alert-warning" style="height:60px;" >
								<strong>Tip:<br>${returnMessage}</strong>		<!-- 这是提示信息显示栏 -->
					 </div>					
				</div>
			</div>			
				<!-- Item end -->
				<!-- Main begin -->		
				<div class="agile-grids">
					<div class="breadcrumb">
						<div class="agile-tables" style="padding-top:0px;padding-bottom:0px;"><!-- 设置表格和div的内边距 -->
							<div class="w3l-table-info" >
								<h2>正在消费的客户信息</h2>
									<table id="table">
										<thead>
											<tr>
												<th>客户卡号</th>
												<th>客户姓名</th>
												<th>性别</th>
												<th>电话</th>
												<th>手机</th>
												<th>地址</th>
												<th>当前总积分</th>
												<th>备注</th>
											</tr>
										</thead>
										<tbody>
										<!-- 上右下左 -->
											<tr>
												<td><input class="input-info" name="id" type="text"  placeholder="123456" value="${usermessage.uId}" readonly="readonly" /></td>
												<td><input class="input-info" name="id" type="text"  placeholder="张三" value="${usermessage.uName}"readonly="readonly"  /></td>
												<td><input class="input-info" name="id" type="text"  placeholder="男" value="${usermessage.uSex}" readonly="readonly" /></td>
												<td><input class="input-info" name="id" type="text"  placeholder="123456" value="${usermessage.uTel}" readonly="readonly" /></td>
												<td><input class="input-info" name="id" type="text"  placeholder="123456" value="${usermessage.uPhoNum}" readonly="readonly" /></td>
												<td><input class="input-info" name="id" type="text"  placeholder="北京" value="${usermessage.uAddr}" readonly="readonly" /></td>
												<td><input class="input-info" name="id" type="text"  placeholder="120" value="${allcreditsmessage.aCredits}" readonly="readonly" /></td>
												<td><input class="input-info" name="id" type="text"  placeholder="很帅" value="${usermessage.uRemark}" readonly="readonly" /></td>
											</tr>
										</tbody>
									</table>
							</div>
						</div>
					</div>
					<!-- tables -->
					<div class="agile-tables" style="padding-top:5px;padding-bottom:0px;">
						<div class="w3l-table-info">
							<h2>添加消费信息</h2>
							<form action="StaffAddToSql" method="post">
							<table id="table">
								<thead>  <!-- 此处写入数据库包含：用户iD,商品Id,消费时间，消费日期，消费数量，购买类型，操作类型，获得积分，员工ID,备注 -->
									<tr>
										<th>商品ID</th>
										<th>商品名字</th>
										<th>消费日期</th>
										<th>消费时间</th>
										<th>消费金额</th>
										<th>消费数量</th>
										<th>购买类型</th>
										<th>操作类型</th>
										<th>获得积分</th>
										<th>员工ID</th>
										<th>备注</th>
									</tr>
								</thead>
								<tbody>
								<!-- 上右下左 -->
									
									<tr>
								
										<td><input name="gIdStr" type="text" placeholder="123456"  required="" style="width:50px;"/></td>
										<td><input name="gName" type="text" placeholder="橘子"  required="" style="width:60px;"/></td>
										<td><input id="cDate" name="cDate" type="text" 
												   class="form-control1 ng-invalid ng-invalid-required"
												   ng-model="model.date"  readonly="readonly" style="width:70px;"/>
										</td>
										<td><input  id="cTime" name="cTime" type="text" 
												   class="form-control1 ng-invalid ng-invalid-required"
												   ng-model="model.date"  readonly="readonly" style="width:70px;"/>
										</td>
										<td><input name="gPriceStr" type="text" placeholder="1209元"  required="" style="width:50px;"/></td>
										<td><input name="cNumStr" type="text" placeholder="件"  required="" style="width:50px;"/></td>
										<td> <select name="bTidStr" style="width:100px; height:50px;">
												<option value="0">自己购买</option>
												<option value="1">别人介绍</option>
											</select>
										</td>
										<td> <select name="oTidStr" style="width:100px; height:50px;">
												<option value="0">消费购买</option>
												<option value="1">返还现金</option>
											</select>
										</td>
										<td><input name="cReditsStr" type="text" placeholder="1209分" value="" style="width:50px;"/></td>
										<td><input name="sIdStr" type="text" placeholder="5" value="" required="" style="width:50px;"/></td>
										<td><input name="cRemark" type="text" placeholder="购买备注哦" value="" style="width:100px;"/></td>
									</tr>
								</tbody>
							</table>
							<div class="col-md-12 form-group">
								<input type="hidden" value="${usermessage.uId}"/>
								<button type="submit" class="btn btn-primary">添加</button>
								<button type="reset" class="btn btn-default">重置</button>
							</div>
							<div class="clearfix"></div>
							</form>
						</div>	 
					</div>
				</div>
				
				<!-- Main end -->
				<jsp:include page="baseJsp/Footer.jsp"></jsp:include>
			</div>
		</div>
		<jsp:include page="baseJsp/SidebarMenu.jsp"></jsp:include>
	<jsp:include page="baseJsp/MenuScript.jsp"></jsp:include>
</body>
</html>