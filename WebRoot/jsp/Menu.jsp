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
					<a class="agile-icon" href="#"><i
						class="fa fa-asl-interpreting" aria-hidden="true"></i>
						查询客户信息 </a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-assistive-listening-systems" aria-hidden="true"></i>
						添加客户信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-audio-description" aria-hidden="true"></i>
						删除客户信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-blind"
						aria-hidden="true"></i> 
						修改客户信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-braille"
						aria-hidden="true"></i>
						查询消费记录</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-deaf"
						aria-hidden="true"></i>
						 添加消费记录</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-deafness"
						aria-hidden="true"></i>
						积分商品兑换</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-envira"
						aria-hidden="true"></i>
						导出表格信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-fa"
						aria-hidden="true"></i>
						查询员工信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-first-order"
						aria-hidden="true"></i> 
						注册员工信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-font-awesome"
						aria-hidden="true"></i> 
						查询职工业绩</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-gitlab"
						aria-hidden="true"></i> 
						积分设置</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-glide"
						aria-hidden="true"></i> 
						查询商品信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-glide-g"
						aria-hidden="true"></i> 
						添加商品信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-google-plus-circle" aria-hidden="true"></i>
						移除商品信息 </a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-google-plus-official" aria-hidden="true"></i>
						修改商品信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-hard-of-hearing"
						aria-hidden="true"></i> 查询所有消费记录</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./ConsumeExchange"><i class="fa fa-instagram"
						aria-hidden="true"></i> 
						查询所有积分兑换</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-low-vision"
						aria-hidden="true"></i> 
						查询详细积分兑换</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./ConsumeInfo"><i class="fa fa-pied-piper"
						aria-hidden="true"></i>
						查询所有客户信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./ConsumeCredits"><i class="fa fa-yoast"
						aria-hidden="true"></i> 查询所有积分</a>
				</div>
				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-question-circle-o" aria-hidden="true"></i>
						备份数据信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-sign-language"
						aria-hidden="true"></i> 
						恢复数据信息</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-signing"
						aria-hidden="true"></i> 
						数据整合统计 </a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-snapchat"
						aria-hidden="true"></i> 
						系统设置</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-snapchat-ghost"
						aria-hidden="true"></i> 
						系统说明</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-snapchat-square"
						aria-hidden="true"></i> 
						系统帮助</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-themeisle"
						aria-hidden="true"></i> 强强科集团简介</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i
						class="fa fa-universal-access" aria-hidden="true"></i>
						注册新账户</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-viadeo"
						aria-hidden="true"></i> fa-viadeo</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-viadeo-square"
						aria-hidden="true"></i> 
						个人信息查询</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="./Logout"><i
						class="fa fa-volume-control-phone" aria-hidden="true"></i>
						注销系统</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-wheelchair-alt"
						aria-hidden="true"></i> fa-wheelchair-alt</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-wpbeginner"
						aria-hidden="true"></i> fa-wpbeginner</a>
				</div>

				<div class="icon-box col-md-3 col-sm-4">
					<a class="agile-icon" href="#"><i class="fa fa-wpforms"
						aria-hidden="true"></i> fa-wpforms</a>
				</div>

				

			</div>

		</section>
	</div>
</div>