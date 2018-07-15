<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="headerid1">
	<base target="_self">
	<title>个人中心</title>	
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="强强系统">
	<meta http-equiv="description" content="贵州强强科技积分系统">
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">

</head>
<body>



<style type="text/css">
body {color:#FFF;font-size: 14px;font-family: "微软雅黑";}
ul,dl,dd,h1,h2,h3,h4,h5,h6,form,p,{ padding:0; margin:0;}
font{ color:#FFF;}
.wap{position:relative;height:450px; width:910px;margin:0 auto;}
.block1{width:265px; height:287px; background:#09619F;}
.block1 img{position:absolute;top:92px;left:28px;}
.block1tex{position:absolute;top:169px;left:33px;}
.block1text{position:absolute;top:120px;left:135px;width: 150px;height:73px;line-height:21px;}
.block1pc{background:#2271A9;position:absolute;width:90px;height:117px;left: 141px;top:31px;}
.block1pc img{position:absolute;width:90px;height:117px;left:0;top:0;}

.block2{position:absolute;width:153px;height:287px;background:#4FB5C7;left:270px;top:0px;}
.block2 img{position:absolute;top:92px;left:43px;}
.block2tex{position:absolute;top:164px;left:48px;}

.block3{position:absolute;width:173px;height:141px;background:#1978D8;left:428px;top:0px;}
.block3 img{position:absolute;top:29px;left:38px;}
.block3tex{position:absolute;top:91px;left:58px;}

.block4{position:absolute;width:173px;height:141px;background:#90A8E3;left:428px;top:146px;}
.block4 img{position:absolute;top:21px;left:48px;}
.block4tex{position:absolute;top:91px;left:57px;}

.block5{position:absolute;width:304px;height:141px;background:#DB6987;right:0px;top:0px;}
.block5 img{position:absolute;top:28px;left:21px;}
.block5tex{position:absolute;top:96px;left:35px;}
.block5text{line-height:21px;position:absolute;top:30px;left:112px;width: 172px;height:87px;}

.block6{position:absolute;width:304px;height:141px;background:#8E7AAA;right:0px;top:146px;}
.block6 img{position:absolute;top:12px;left:21px;}
.block6tex{position:absolute;top:96px;left:35px;}
.block6text{line-height:21px;position:absolute;top:30px;left:112px;width: 172px;height:87px;}

.block7{position:absolute;width:130px;height:138px;background:#187D9A;top:292px;}
.block7 img{position:absolute;top:26px;left:30px;}
.block7tex{position:absolute;top:94px;left:36px;}

.block8{position:absolute;width:130px;height:138px;background:#A0CF41;left:135px;top:292px;}
.block8 img{position:absolute;top:26px;left:30px;}
.block8tex{position:absolute;top:94px;left:35px;}

.block9{position:absolute;width:153px;height:138px;background:#EAAF76;left:270px;top:292px;}
.block9 img{position:absolute;top:26px;left:41px;}
.block9tex{position:absolute;top:94px;left:46px;}

.block10{position:absolute;width:173px;height:138px;background:#88BAD9;left:428px;top:292px;}
.block10 img{position:absolute;top:22px;left:51px;}
.block10tex{position:absolute;top:94px;left:53px;}

.block11{position:absolute;width:149px;height:138px;background:#B69CCC;left:606px;top:292px;}
.block11 img{position:absolute;top:19px;left:45px;}
.block11tex{position:absolute;top:94px;left:47px;}

.block12{position:absolute;width:149px;height:138px;background:#09619F;right:0px;top:292px;}
.block12 img{position:absolute;top:26px;left:45px;}
.block12tex{position:absolute;top:94px;left:46px;}
a{color:#db7093;}

.block1app{background:#2271A9;position:absolute;width:80px;height:80px;left: 28px;top:192px;}
.block1app img{position:absolute;width:80px;height:80px;left:0;top:0;}
.Nsb_menu_pw{color:#FFF;font-size: 14px;font-family: "微软雅黑";float:left;} 

</style>
<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="./Main">导航桌面</a> <i class="fa fa-angle-right"></i></li>
				</ol>
<div class="Nsb_menu_pw">
  <div class="Nsb_pw">
    <div class="Nsb_menu menu_cn" id="divFirstMenuClass">
      <ul>         
         <li title="首页" class="Nsb_menu_li_now">
         	<a class="Nsb_menu_li_h" id="homepage" href=""><span></span></a>
         </li>
         
         	<li title="我的桌面">
         		<a id="calender_user_schedule" href="">我的导航</a>
         	</li>
         
         	<li title="学籍成绩">
         		<a id="calender_user_schedule" href="">快速搜索</a>
         	</li>
         
         	<li title="培养管理">
         		<a id="calender_user_schedule" href="">在线计算器</a>
         	</li>
         
         	<li title="考试报名">
         		<a id="calender_user_schedule" href="">文件上传</a>
         	</li>
         
         	<li title="教学评价">
         		<a id="calender_user_schedule" href="">表格导入</a>
         	</li>
         
         	<li title="实践教学">
         		<a id="calender_user_schedule" href="">实践教学</a>
         	</li>
         
         	<li title="教育科研">
         		<a id="calender_user_schedule" href="">教育科研</a>
         	</li>
         
      </ul>
    </div>
  </div>
</div>
<div class="h"></div>
<div class="h"></div>
<!-- 学生 --> 
<div class="wap">
 <div class="block1">
    <div>
    	<img width="72" height="64" src="images/nav/app.png">
    </div>
    <div class="block1tex">个人信息</div>
    <div class="block1text"> 
    	姓名：管理员<br> 
    	ID号：8000116112<br>
    </div>
    <div class="block1app">
    	<img src="images/nav/erweima.png">
    </div>      
  </div>
  
  
	  <a href="">
	  	<div class="block2"> 
	  		<div>
	  			<img width="65" height="65" src="images/nav/consumer.png">
	  		</div>
			<div class="block2tex">管理客户信息</div>
		</div>
	  </a>
  
  
  
  
	  <a href="">
	  	<div class="block3"> 
	  		<div>
	  			<img width="92" height="55" src="images/nav/staff.png">
	  		</div>
			<div class="block3tex">管理职工信息</div>
		</div>
	  </a>
  
  
  
  
	  <a href="">
	  	<div class="block4"> 
	  		<div>
	  			<img width="71" height="62" src="images/nav/pay.png">
	  		</div>
			<div class="block4tex">客户消费操作</div>
		</div>
	  </a>
  
  
  
	  <a href="">
	  	<div class="block5"> 
	  		<div>
	  			<img width="80" height="57" src="images/nav/yeji.png">
	  		</div>
			<div class="block5tex">员工业绩</div>
			<div class="block5text" id="grxx"></div>
		</div>
	  </a>
  
  
  
  
	  <a href="">
	  	<div class="block6"> 
	  		<div>
	  			<img width="67" height="79" src="images/nav/search.png">
	  		</div>
			<div class="block6tex">查询操作</div>
			<div class="block6text" id="ggtz"></div>
		</div>
	  </a>
  
  
  
  
	  <a href="">
	  	<div class="block7"> 
	  		<div>
	  			<img width="66" height="59" src="images/nav/calculate.png">
	  		</div>
			<div class="block7tex">数据统计</div> 
		</div>
	  </a>
  
  
  
	  <a href="">
	  	<div class="block8"> 
	  		<div>
	  			<img width="64" height="60" src="images/nav/goods.png">
	  		</div>
			<div class="block8tex">商品管理</div> 
		</div>
	  </a>
  
  
  
	  <a href="">
	  	<div class="block9"> 
	  		<div>
	  			<img width="66" height="66" src="images/nav/credits.png">
	  		</div>
			<div class="block9tex">积分设置</div> 
		</div>
	  </a>
  
  
  
	  <a href="">
	  	<div class="block10"> 
	  		<div>
	  			<img width="71" height="69" src="images/nav/backup.png">
	  		</div>
			<div class="block10tex">数据备份与恢复</div> 
		</div>
	  </a>
  
  
  
	  <a href="">
	  	<div class="block11"> 
	  		<div>
	  			<img width="62" height="73" src="images/nav/description.png">
	  		</div>
			<div class="block11tex">系统说明</div> 
		</div>
	  </a>
  
 
   
	  <a href="">
	  	<div class="block12"> 
	  		<div>
	  			<img width="55" height="67" src="images/nav/over.png">
	  		</div>
			<div class="block12tex">玩完</div> 
		</div>
	  </a>
   
  
</div>


<div class="Nsb_pw" id="Footer1_divCopyright" style="display:;">
  <div class="Nsb_rights">Copyright (C) 强强科技发展有限公司 2003-2013 All Rights Reserved  备12010071号</div>
</div>

</body></html>

