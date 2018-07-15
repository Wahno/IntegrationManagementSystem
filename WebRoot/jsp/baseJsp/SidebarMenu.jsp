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
			<li><a href="./Main"> <i class="fa fa-tachometer"></i> <span>控制台</span>
					<div class="clearfix"></div></a></li>
					
			<li id="menu-academico"><a href="./ConsumeMain"> 
				<i class="fa fa-list-ul"></i> <span>客户信息</span>
				<span class="fa fa-angle-right" style="float: right"></span>
					<div class="clearfix"></div></a>
					<ul id="menu-academico-sub">
						<li id="menu-academico-avaliacoes"><a href="#">添加客户</a></li>
						<li id="menu-academico-avaliacoes"><a href="#">查询客户</a></li>
						<li id="menu-academico-avaliacoes"><a href="#">修改客户</a></li>
						<li id="menu-academico-avaliacoes"><a href="#">移除客户</a></li>
					</ul>
			</li>
			<li><a href="gallery.html"> <i class="fa fa-bar-chart"></i>
					<span>客户消费</span>
					<span class="fa fa-angle-right" style="float: right"></span>
					<div class="clearfix"></div></a>
					<ul id="menu-academico-sub">
						<li id="menu-academico-avaliacoes"><a href="#">添加消费</a></li>
						<li id="menu-academico-avaliacoes"><a href="#">查询消费</a></li>
						<li id="menu-academico-avaliacoes"><a href="#">导出表格</a></li>
					</ul>
			</li>
			<li id="menu-academico"><a href="charts.html"> <i
					class="fa fa-list-ul" aria-hidden="true"></i> <span>员工信息</span>
					<span class="fa fa-angle-right" style="float: right"></span>
					<div class="clearfix"></div></a>
					<ul id="menu-academico-sub">
						<li id="menu-academico-avaliacoes"><a href="#">添加员工</a></li>
						<li id="menu-academico-avaliacoes"><a href="#">查询员工</a></li>
						<li id="menu-academico-avaliacoes"><a href="#">修改员工</a></li>
						<li id="menu-academico-avaliacoes"><a href="#">移除员工</a></li>
					</ul>
			</li>
			<li id="menu-academico"><a href="#"> <i
					class="fa fa-bar-chart"></i> <span>员工业绩</span>
					<span class="fa fa-angle-right" style="float: right"></span>
					<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="icons.html">Icons</a></li>
					<li id="menu-academico-avaliacoes"><a href="typography.html">Typography</a></li>
					<li id="menu-academico-avaliacoes"><a href="faq.html">Faq</a></li>
				</ul></li>
			<li id="menu-academico"><a href="errorpage.html"> <i
					class="fa fa-table"></i> <span>查询操作</span>
					<div class="clearfix"></div></a></li>
			<li><a href="tabels.html"> <i class="fa fa-table"></i> <span>数据统计</span>
					<div class="clearfix"></div></a></li>
			<li id="menu-academico"><a href="#"> <i class="fa fa-cogs"
					aria-hidden="true"></i> <span>管理商品</span> <span
					class="fa fa-angle-right" style="float: right"></span>
					<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-avaliacoes"><a href="button.html">Buttons</a></li>
					<li id="menu-academico-avaliacoes"><a href="grid.html">Grids</a></li>
				</ul></li>
			<li><a href="maps.html"> <i class="fa fa-cogs"
					aria-hidden="true"></i> <span>积分设置</span>
					<div class="clearfix"></div></a></li>
			<li id="menu-academico"><a href="#"> <i
					class="fa fa-file-text-o"></i> <span>数据管理</span><span
					class="fa fa-angle-right" style="float: right"></span>
					<div class="clearfix"></div></a>
				<ul id="menu-academico-sub">
					<li id="menu-academico-boletim"><a href="calendar.html">Calendar</a></li>
					<li id="menu-academico-avaliacoes"><a href="signin.html">Sign
							In</a></li>
					<li id="menu-academico-avaliacoes"><a href="signup.html">Sign
							Up</a></li>
				</ul></li>
			<li><a href="#"> <i class="fa fa-check-square-o nav_icon"></i>
					<span>系统说明</span><span class="fa fa-angle-right"
					style="float: right"></span>
					<div class="clearfix"></div></a>
				<ul>
					<li><a href="input.html"> Input</a></li>
					<li><a href="validation.html">Validation</a></li>
				</ul></li>
		</ul>
	</div>
</div>
<div class="clearfix"></div>

<!-- jsp:include SidebarMenu end-->

