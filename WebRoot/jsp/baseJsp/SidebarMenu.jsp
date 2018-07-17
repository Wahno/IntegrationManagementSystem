<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!-- jsp:include SidebarMenu begin-->

<div class="sidebar-menu">
	<header class="logo1">
		<a href="./Main" class="sidebar-icon"> <span class="fa fa-bars"></span>
		</a>
	</header>
	<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
	<div class="menu">
		<ul id="menu">
			<li><a href="./Main"> <i class="fa fa-tachometer"></i>
				<span>控制台</span>
				<div class="clearfix"></div></a>
			</li>
					
			<li id="menu-academico"><a href="#"> <i class="fa fa-search"></i> 
				<span>查询操作</span>
				<span class="fa fa-angle-right" style="float: right"></span>
				<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="toUserSelect">查询客户信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">查询消费记录</a></li>
					<li id="menu-academico-avaliacoes"><a href="toStaffSelect">查询员工信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">查询员工业绩</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">查询商品信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">查询所有消费记录</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">查询所有积分兑换</a></li>
					<li id="menu-academico-avaliacoes"><a href="ConsumeInfo">查询所有客户信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">查询所有积分</a></li>
					<li id="menu-academico-avaliacoes"><a href="AdminMessage">查询个人信息</a></li>
				</ul>
			</li>
					
			<li id="menu-academico"><a href="./ConsumeMain"> <i class="fa fa-list-ul"></i> 
				<span>客户信息</span>
				<span class="fa fa-angle-right" style="float: right"></span>
				<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="toUserAdd">添加客户</a></li>
					<li id="menu-academico-avaliacoes"><a href="toUserSelect">查询客户</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">修改客户</a></li>
					<li id="menu-academico-avaliacoes"><a href="toUserDelete">移除客户</a></li>
				</ul>
			</li>
			
			<li><a href="#"> <i class="fa fa-bar-chart"></i>
				<span>客户消费</span>
				<span class="fa fa-angle-right" style="float: right"></span>
				<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="#">添加消费</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">查询消费</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">导出表格</a></li>
				</ul>
			</li>
			
			<li id="menu-academico"><a href="#"> <i class="fa fa-list-ul" aria-hidden="true"></i>
				<span>员工信息</span>
				<span class="fa fa-angle-right" style="float: right"></span>
				<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="toStaffAdd">添加员工信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="toStaffSelect">查询员工信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">修改员工信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">移除员工信息</a></li>
				</ul>
			</li>
			
			<li id="menu-academico"><a href="#"> <i class="fa fa-list-ul" aria-hidden="true"></i> 
				<span>商品信息</span> <span
				class="fa fa-angle-right" style="float: right"></span>
				<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="#">添加商品信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">查询商品信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">修改商品信息</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">移除商品信息</a></li>
				</ul>
			</li>
			
			<li id="menu-academico"><a href="#"> <i class="fa fa-bar-chart"></i> 
				<span>员工业绩</span>
				<div class="clearfix"></div></a>
			</li>
			
			<li><a href="#"> <i class="fa fa-leaf"></i> 
				<span>积分兑换</span>
				<div class="clearfix"></div></a>
			</li>
			
			
			
			<li><a href="#"> <i class="fa fa-cogs" aria-hidden="true"></i> 
				<span>积分设置</span>
				<div class="clearfix"></div></a>
			</li>
			
			<li id="menu-academico"><a href="#"> <i class="fa fa-file-text-o"></i> 
				<span>数据管理</span>
				<span class="fa fa-angle-right" style="float: right"></span>
				<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-boletim"><a href="#">备份数据</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">恢复数据</a></li>
					<li id="menu-academico-avaliacoes"><a href="#">统计数据</a></li>
					<li id="menu-academico-avaliacoes"><a href="./toExportExcel">导出数据</a></li>
				</ul>
			</li>
			
			<li><a href="#"> <i class="fa fa-gear"></i>
				<span>关于系统</span><span class="fa fa-angle-right"
				style="float: right"></span>
				<div class="clearfix"></div></a>
				<ul>
					<li><a href="#">系统设置</a></li>
					<li><a href="./toSystemDescription">系统说明</a></li>
					<li><a href="./toSystemHelp">系统帮助</a></li>
					<li><a href="Logout">注销退出</a></li>
				</ul>
			</li>
		</ul>
	</div>
</div>
<div class="clearfix"></div>

<!-- jsp:include SidebarMenu end-->

