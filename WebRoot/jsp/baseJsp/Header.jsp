<%@ page language="java" import="java.util.*" import="com.mybean.data.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- jsp:include Header begin-->
<div class="header-main">
	<div class="logo-w3-agile">

		<h1>
			<a href="./Main">积分管理系统</a>
		</h1>
	</div>
	<%
		Admin admin = (Admin)session.getAttribute("adminmessage");
	%>
	<div class="profile_details w3l">
		<ul>
			<li class="dropdown profile_details_drop"><a href="#"
				class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
					<div class="profile_img">
						<%
							if (admin.getaSex() == 1) {
						%>
						<span class="prfil-img"><img src="images/woman.png" alt="">
						</span>
						<%
							} else {
						%>
						<span class="prfil-img"><img src="images/man.png" alt="">
						</span>
						<%
							}
						%>
						<div class="user-name">

							<p><%=admin.getaName()%></p>
							<%
								String str = "";
								if (admin.getaLimit() == 0)
									str = "管理员";
								else if (admin.getaLimit() == 1)
									str = "操作员";
								else
									str = "其他";
							%>
							<span><%=str%></span>
						</div>
						<i class="fa fa-angle-down"></i> <i class="fa fa-angle-up"></i>
						<div class="clearfix"></div>
					</div>
				</a>
				<ul class="dropdown-menu drp-mnu">
					<li><a href="#"><i class="fa fa-cog"></i> 设置</a></li>
					<li><a href="./AdminMessage"><i class="fa fa-user"></i>个人信息</a></li>
					<li><a href="./Logout"><i class="fa fa-sign-out"></i>退出</a></li>
				</ul>
			</li>
		</ul>
	</div>
	<div class="clearfix"></div>
</div>
<!-- jsp:include Header end-->