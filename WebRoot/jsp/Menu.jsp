<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div class="grid_3 grid_4 w3_agileits_icons_page">
	<div class="icons">
		<h2 class="agileits-icons-title">控制台</h2>
		<section id="new">
			<div class="row fontawesome-icon-list">
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="toUserSelect"><i
						class="fa fa-search" aria-hidden="true"></i>
						查询客户信息 </a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-search"
						aria-hidden="true"></i>
						查询消费记录</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="toStaffSelect"><i class="fa fa-search"
						aria-hidden="true"></i>
						查询员工信息</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-search"
						aria-hidden="true"></i> 
						查询员工业绩</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-search"
						aria-hidden="true"></i> 
						查询商品信息</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-search"
						aria-hidden="true"></i> 
						查询所有消费记录</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./ConsumeExchange"><i class="fa fa-search"
						aria-hidden="true"></i> 
						查询所有积分兑换</a>
				</div>


				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./ConsumeInfo"><i class="fa fa-search"
						aria-hidden="true"></i>
						查询所有客户信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="ConsumeCredits"><i class="fa fa-search"
						aria-hidden="true"></i> 
						查询所有积分</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="AdminMessage"><i class="fa fa-search"
						aria-hidden="true"></i> 
						查询个人信息</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="toUserAdd"><i
						class="fa fa-plus" aria-hidden="true"></i>
						添加客户信息</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-plus"
						aria-hidden="true"></i>
						 添加消费记录</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-plus"
						aria-hidden="true"></i> 
						添加商品信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="toUserDelete"><i
						class="fa fa-minus" aria-hidden="true"></i>
						删除客户信息</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-minus" aria-hidden="true"></i>
						删除商品信息 </a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-pencil"
						aria-hidden="true"></i> 
						修改客户信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-pencil" aria-hidden="true"></i>
						修改商品信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-leaf"
						aria-hidden="true"></i>
						积分商品兑换</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="toStaffAdd"><i class="fa fa-group"
						aria-hidden="true"></i> 
						注册新员工</a>
				</div>
	
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-gears"
						aria-hidden="true"></i> 
						积分设置</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-copy" aria-hidden="true"></i>
						备份数据信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-repeat"
						aria-hidden="true"></i> 
						恢复数据信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-bar-chart-o"
						aria-hidden="true"></i> 
						数据整合统计 </a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-table"
						aria-hidden="true"></i>
						导出表格信息</a>
				</div>
				
				
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-gear"
						aria-hidden="true"></i> 
						系统设置</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./toSystemDescription"><i class="fa fa-file-text-o"
						aria-hidden="true"></i> 
						系统说明</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./toSystemHelp"><i class="fa fa-question"
						aria-hidden="true"></i> 
						系统帮助</a>
				</div>
				
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./Logout"><i
						class="fa fa-sign-out" aria-hidden="true"></i>
						注销系统</a>
				</div>
			</div>
		</section>
	</div>
</div>