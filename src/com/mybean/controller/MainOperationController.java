package com.mybean.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybean.data.Consume;
import com.mybean.data.Credit;
import com.mybean.data.Goods;
import com.mybean.data.Staff;
import com.mybean.data.User;
import com.mybean.service.AdminService;
import com.mybean.service.ConsumeService;
import com.mybean.service.GoodsService;
import com.mybean.service.StaffService;
import com.mybean.service.UserService;
/**
 * 以下方法中有许多代码段一样，只是参数不同
 * 为了按照功能分，并没有代码重用，二是重写
 * **/
@Controller
public class MainOperationController {
	@Autowired
	AdminService adminservice;
	@Autowired
	UserService userservice;
	@Autowired
	StaffService staffservice;
	@Autowired
	GoodsService goodsservice;
	@Autowired
	ConsumeService consumeservice;
	
	@RequestMapping("ConsumeMain")  //客户总界面
	public ModelAndView ConsumeMain(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("ConsumeMain");
		return mav;
	}
	
	@RequestMapping("ConsumeInfo")  //所有客户信息界面
	public ModelAndView ConsumeInfo(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		/**
		 * 此处调用信息查询语句
		 * */
		mav.setViewName("ConsumeInfo");
		return mav;
	}
	
	@RequestMapping("ConsumeCredits")  //所有积分信息界面
	public ModelAndView ConsumeCredits(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		/**
		 * 此处调用积分查询语句
		 * */
		mav.setViewName("ConsumeCredits");
		return mav;
	}
	
	@RequestMapping("ConsumeExchange")  //所有兑换信息界面
	public ModelAndView ConsumeExchange(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		/**
		 * 此处调用积分查询语句
		 * */
		mav.setViewName("ConsumeExchange");
		return mav;
	}
	
	/**
	 * 以下为客户信息处理服务
	 * 
	 * */
	/**查询，在查询界面调用，修改，删除，界面的子查询里面调用
	 * 参数：String toSrc:查询完后返回的界面
	 * */
	public ModelAndView selectUser(String toSrc,HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		int  uId;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		if(request.getParameter("searchUser")==null)//其他界面跳转到查询页面
		{
			mav.setViewName(toSrc);
			return mav;
		}
		//查询页面输入id提交后，把结果带回查询页面	
		//处理输入非数字情况
		try{
			uId =Integer.parseInt(request.getParameter("searchUser"));//获得用户查询的id,将id转化成int
		}catch(Exception e)  //如果用户输入的是非法字符，就会抛出异常，因为integer无法处理非数字字符
		{
			 returnMessage="客户ID为纯数字";
			 mav.addObject("returnMessage", returnMessage);
			 mav.setViewName(toSrc);
			 return mav;
		}
		User user=userservice.get(uId);
		if(user==null){
			returnMessage="该客户不存在哦!";
		}
		else{
			returnMessage="已搜索到ID为:  "+uId+"   的客户";
			mav.addObject("usermessage", user);
		}		
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName(toSrc);
		return mav;
	}
	@RequestMapping("toUserAdd")  //跳转到添加客户信息界面
	public ModelAndView toUserAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("UserAdd");
		return mav;
	}	
	@RequestMapping("UserAddToSql")  //添加客户信息到数据库   添加成功返回添加界面
	public ModelAndView UserAddToSql(User user,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		/*暂时没有加电话等合法性的判断*/		
		int uId;
		String returnMessage="";
		String uIdStr=request.getParameter("uIdStr");
		String uSexStr=request.getParameter("uSex");
		ModelAndView mav = new ModelAndView();
		try{
			uId=Integer.parseInt(uIdStr);
			
		}catch(Exception e) //处理ID非法输入
		{
			//e.printStackTrace();
			returnMessage="输入的ID   "+uIdStr+"   不为纯数字";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserAdd");
			return mav;
		}
		int uSex=Integer.parseInt(uSexStr);
		User userCheck=userservice.get(uId);//检测ID是否注册了
		if(userCheck!=null)
		{
			returnMessage="客户ID   "+uId+"   已经注册，请换一个ID.";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserAdd");
			return mav;
		}	
		try{
			user.setuId(uId);
			user.setuSex(uSex);
		}catch(Exception e)
		{
			e.printStackTrace();
			returnMessage="添加客户     "+user.getuName()+"     失败,请重试(未知原因)";
			mav.setViewName("UserAdd");
			return mav;
		}
		userservice.add(user);
		returnMessage="客户   "+user.getuName()+"   添加成功！请输入ID查看";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("UserAdd");			
		return mav;		
	}
	@RequestMapping("toUserSelect")  //跳转到查询客户信息界面
	public ModelAndView toUserSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectUser("UserSelect",request, response,session);
		return mav;
	}
	
	
	@RequestMapping("toUserUpdate")  //跳转到修改客户信息界面 以及在修改页面查询
	public ModelAndView toUserUpdate(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectUser("UserUpdate",request, response,session);
		return mav;
	}
	
	@RequestMapping("UserUpDateToSql")//将修改后的信息提交到数据库
	public ModelAndView UserUpDateToSql(User user,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		//暂时不加是否有改动的检测，就算没有改动也当改动来 写入数据库
		int uId;
		String returnMessage="";
		String uSexStr=request.getParameter("uSex");
		ModelAndView mav = new ModelAndView();
		if((request.getParameter("updateUser")=="")|| (request.getParameter("updateUser")==null))//前端通过${}赋值，此处不能改为null 如果没有输入ID就点击删除，由这句处理
		{
			returnMessage="为了安全，请输入需要修改的客户ID并搜索信息查看确认";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("UserUpdate");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			try
			{
				String updateUser=request.getParameter("updateUser");//获得用户查询的id
				uId=Integer.parseInt(updateUser);
			}catch(Exception e) //本来用户id被写入数据库，再读出来不会被修改，但我傲娇就要加这一句
			{
				returnMessage="ID解析出错(系统错误)";
				mav.addObject("returnMessage", returnMessage);
				mav.setViewName("UserUpdate");
				return mav;			
			}				
			try{
				int uSex=Integer.parseInt(uSexStr);//传过来的是string,需要把性别转换成int
				user.setuId(uId);					//uiD不是自动封装的
				user.setuSex(uSex);                //设置user性别，其他的都是自动封装的
				userservice.update(user);
			}catch(Exception e)
			{
				returnMessage="更新ID为:  "+uId+"   的客户失败(可能是性别设置错误)";
				e.printStackTrace();
			}			
			returnMessage="更新ID为:  "+uId+"   的客户成功,请输入ID查看";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserUpdate");
		}
		return mav;
	}		
	@RequestMapping("toUserDelete")  //跳转到删除客户信息界面 以及 在删除界面的查询
	public ModelAndView toUserDelete(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav=selectUser("UserDelete",request, response,session);
		return mav;
	}
	@RequestMapping("UserDeleteFromeSql")  //确认删除按钮按下后  从数据库  删除客户信息
	public ModelAndView UserDeleteFromeSql(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if((request.getParameter("deleteUser")=="")|| (request.getParameter("deleteUser")==null))//前端通过${}赋值，此处不能改为null 如果没有输入ID就点击删除，由这句处理
		{
			returnMessage="为了安全，请输入需要删除的客户ID并搜索信息查看确认";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("UserDelete");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			int uId;
			try
			{
				String deleteUser=request.getParameter("deleteUser");//获得用户查询的id
				uId=Integer.parseInt(deleteUser);
			}catch(Exception e) //捕获输入非法字符的情况
			{
				//e.printStackTrace();
				returnMessage="ID应该是纯数字";
				mav.addObject("returnMessage", returnMessage);
				mav.setViewName("UserDelete");
				return mav;
				
			}				
			try{
				userservice.delete(uId);
			}catch(Exception e)
			{
				returnMessage="删除ID为:  "+uId+"   的客户失败";
				e.printStackTrace();
			}
			returnMessage="删除ID为:  "+uId+"   的客户成功";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserDelete");
		}
		return mav;
	}
	
	/**
	 * 客户信息处理结束
	 * */
	
	
	/**
	 * 职工信息处理开始
	 * */
	/**查询，在查询界面调用，修改，删除，界面的子查询里面调用
	 * 参数：String toSrc:查询完后返回的界面
	 * */
	public ModelAndView selectStaff(String toSrc,HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		int  sId;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		if(request.getParameter("searchStaff")==null)//其他界面跳转到查询页面
		{
			mav.setViewName(toSrc);
			return mav;	
		}
		//查询页面输入id提交后，把结果带回查询页面	
		//处理输入非数字情况
		try{
			sId =Integer.parseInt(request.getParameter("searchStaff"));//获得用户查询的id,将id转化成int
		}catch(Exception e)  //如果用户输入的是非法字符，就会抛出异常，因为integer无法处理非数字字符
		{
			// e.printStackTrace();
			 returnMessage="员工ID为纯数字";
			 mav.addObject("returnMessage", returnMessage);
			 mav.setViewName(toSrc);
			 return mav;
		}
		Staff staff=staffservice.get(sId); 
		if(staff==null){
			returnMessage="该职工ID（卡号）不存在哦！";
		}
		else{
			returnMessage="已搜索到ID为:  "+sId+"   的员工";
			mav.addObject("staffmessage", staff);
		}		
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName(toSrc);
		return mav;	
	}
	@RequestMapping("toStaffAdd")  //跳转到添加职工信息界面
	public ModelAndView toStaffAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("StaffAdd");
		return mav;
	}
	
	@RequestMapping("StaffAddToSql") //添加职工信息到数据库   后台处理添加成功 返回添加界面
	public ModelAndView StaffAddToSql(Staff staff,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		/*暂时没有加电话等合法性的判断*/
		
		int sId;
		String returnMessage="";
		String sIdStr=request.getParameter("sIdStr");
		String sSexStr=request.getParameter("sSex");
		ModelAndView mav = new ModelAndView();
		try{
			sId=Integer.parseInt(sIdStr);
			
		}catch(Exception e) //处理ID非法输入
		{
			returnMessage="输入的ID  "+sIdStr+"   不为纯数字";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffAdd");
			return mav;
		}
		int sSex=Integer.parseInt(sSexStr);
		Staff staffCheck=staffservice.get(sId);//检测ID是否注册了
		if(staffCheck!=null)
		{
			returnMessage="职工ID   "+sId+"    已经注册添加，请换一个ID.";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffAdd");
			return mav;
		}	
		try{
			staff.setsId(sId);
			staff.setsSex(sSex);
		}catch(Exception e)
		{
			e.printStackTrace();
			mav.setViewName("StaffAdd");
			return mav;
		}
		staffservice.add(staff);
		returnMessage="职工  "+staff.getsName()+"  添加成功！请输入ID查看";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("StaffAdd");			
		return mav;		
	}

	@RequestMapping("toStaffSelect")  //跳转到查询职工信息界面
	public ModelAndView toStaffSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectStaff("StaffSelect",request,response,session);
		return mav;	
	}
	@RequestMapping("toStaffUpdate")  //跳转到修改职工信息界面 以及职工界面信息查询
	public ModelAndView toStaffUpdate(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectStaff("StaffUpdate",request,response,session);
		return mav;
	}
	
	@RequestMapping("StaffUpDateToSql")//将修改后的信息提交到数据库
	public ModelAndView StaffUpDateToSql(Staff staff,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		//暂时不加是否有改动的检测，就算没有改动也当改动来 写入数据库
		int sId;
		String returnMessage="";
		String sSexStr=request.getParameter("sSex");
		ModelAndView mav = new ModelAndView();
		if((request.getParameter("updateStaff")=="")|| (request.getParameter("updateStaff")==null))//前端通过${}赋值，此处不能改为null 如果没有输入ID就点击删除，由这句处理
		{
			returnMessage="为了安全，请输入需要修改的员工ID并搜索信息查看确认";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("StaffUpdate");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			try
			{
				String updateStaff=request.getParameter("updateStaff");//获得用户查询的id
				sId=Integer.parseInt(updateStaff);
			}catch(Exception e) //本来用户id被写入数据库，再读出来不会被修改，但我傲娇就要加这一句
			{
				returnMessage="ID解析出错(系统错误)";
				mav.addObject("returnMessage", returnMessage);
				mav.setViewName("StaffUpdate");
				return mav;			
			}				
			try{
				int sSex=Integer.parseInt(sSexStr);//传过来的是string,需要把性别转换成int
				staff.setsId(sId);					//uiD不是自动封装的
				staff.setsSex(sSex);                //设置user性别，其他的都是自动封装的
				staffservice.update(staff);
			}catch(Exception e)
			{
				returnMessage="更新ID为:  "+sId+"   的客户失败(可能是性别设置错误)";
				e.printStackTrace();
			}			
			returnMessage="更新ID为:  "+sId+"   的客户成功,请输入ID查看";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffUpdate");
		}
		return mav;
	}
	
	
	@RequestMapping("toStaffDelete")  //跳转到删除职工信息界面 以及  删除界面查询
	public ModelAndView toStaffDelete(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav=selectStaff("StaffDelete",request,response,session);
		return mav;	
	}
	
	@RequestMapping("StaffDeleteFromeSql")  //确认删除按钮按下后  从数据库  删除客户信息
	public ModelAndView StaffDeleteFromeSql(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if((request.getParameter("deleteUser")=="")||(request.getParameter("deleteStaff")==null))//前端通过${}赋值，此处不能改为null 如果没有输入ID就点击删除，由这句处理
		{
			returnMessage="为了安全，请输入需要删除的客户ID并搜索信息查看确认";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("StaffDelete");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			System.out.println("你好："+request.getParameter("deleteUser"));
			int sId;
			try
			{
				String deleteStaff=request.getParameter("deleteStaff");//获得用户查询的id
				sId=Integer.parseInt(deleteStaff);
			}catch(Exception e) //捕获输入非法字符的情况
			{
				//e.printStackTrace();
				returnMessage="ID应该是纯数字";
				mav.addObject("returnMessage", returnMessage);
				mav.setViewName("StaffDelete");
				return mav;
				
			}				
			try{
				userservice.delete(sId);
			}catch(Exception e)
			{
				returnMessage="删除ID为:  "+sId+"   的职工失败";
				e.printStackTrace();
			}
			returnMessage="删除ID为:  "+sId+"   的职工成功";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffDelete");
		}
		return mav;
	}
	
	/**
	 * 职工信息处理结束
	 * */
	
	/**
	 * 以下为商品信息处理服务
	 * 
	 * */
	
	/**
	 * 查询，在查询界面调用，修改，删除，界面的子查询里面调用
	 * 参数：String toSrc:查询完后返回的界面
	 * */
	public ModelAndView selectGoods(String toSrc,HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		int  gId;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		if(request.getParameter("searchGoods")==null)//其他界面跳转到查询页面
		{
			System.out.println(request.getParameter("searchGoods"));
			mav.setViewName(toSrc);
			return mav;
		}
		//查询页面输入id提交后，把结果带回查询页面	
		//处理输入非数字情况
		try{
			gId =Integer.parseInt(request.getParameter("searchGoods"));//获得用户查询的id,将id转化成int
		}catch(Exception e)  //如果用户输入的是非法字符，就会抛出异常，因为integer无法处理非数字字符
		{
			 returnMessage="商品ID为纯数字";
			 mav.addObject("returnMessage", returnMessage);
			 mav.setViewName(toSrc);
			 return mav;
		}
		Goods goods=goodsservice.get(gId);
		if(goods==null){
			returnMessage="该商品不存在哦!";
		}
		else{
			returnMessage="已搜索到ID为:  "+gId+"   的商品";
			mav.addObject("goodsmessage", goods);
		}		
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName(toSrc);
		return mav;
	}
	@RequestMapping("toGoodsAdd")  //跳转到添加客户信息界面
	public ModelAndView toGoodsAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("GoodsAdd");
		return mav;
	}	
	@RequestMapping("GoodsAddToSql")  //添加客户信息到数据库   添加成功返回添加界面
	public ModelAndView GoodsAddToSql(Goods goods,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
	
		int gId;
		int gNum;
		int gCost;
		int gPrice;
		int gExchange;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		try{
			//gName和gRemark自动转入
			gId=Integer.parseInt(request.getParameter("gIdStr"));
			gNum=Integer.parseInt(request.getParameter("gNumStr"));
			gCost=Integer.parseInt(request.getParameter("gCostStr"));
			gPrice=Integer.parseInt(request.getParameter("gPriceStr"));
			gExchange=Integer.parseInt(request.getParameter("gExchangeStr"));
			
		}catch(Exception e) //处理ID非法输入,时间关系我就不一一检测了
		{
			returnMessage="一个或多个输入不合法，请重新输入";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("GoodsAdd");
			return mav;
		}
		Goods goodsCheck=goodsservice.get(gId);//检测ID是否添加了
		if(goodsCheck!=null)
		{
			returnMessage="商品ID   "+gId+"   已经添加，请换另一个ID.";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("GoodsAdd");
			return mav;
		}	
		try{
			goods.setgId(gId);
			goods.setgNum(gNum);
			goods.setgCost(gCost);
			goods.setgPrice(gPrice);
			goods.setgExchange(gExchange);
		}catch(Exception e)
		{
			e.printStackTrace();
			returnMessage="商品     "+goods.getgName()+"    添加失败,请重试(未知原因)";
			mav.setViewName("GoodsAdd");
			return mav;
		}
		goodsservice.add(goods);
		returnMessage="商品   "+goods.getgName()+"   添加成功！请输入ID查看";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("GoodsAdd");			
		return mav;		
	}
	@RequestMapping("toGoodsSelect")  //跳转到查询客户信息界面
	public ModelAndView toGoodsSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectGoods("GoodsSelect",request, response,session);
		return mav;
	}
		
	@RequestMapping("toGoodsUpdate")  //跳转到修改客户信息界面 以及在修改页面查询
	public ModelAndView toGoodsUpdate(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectGoods("GoodsUpdate",request, response,session);
		return mav;
	}
	
	@RequestMapping("GoodsUpDateToSql")//将修改后的信息提交到数据库
	public ModelAndView GoodsUpDateToSql(Goods goods,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		//暂时不加是否有改动的检测，就算没有改动也当改动来 写入数据库
		int gId;
		int gNum;
		int gCost;
		int gPrice;
		int gExchange;
		String returnMessage="";	
		ModelAndView mav = new ModelAndView();
		
		if((request.getParameter("updateGoods")=="")|| (request.getParameter("updateGoods")==null))//前端通过${}赋值，此处不能改为null 如果没有输入ID就点击删除，由这句处理
		{
			returnMessage="为了安全，请输入需要修改的商品ID并搜索信息查看确认";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("GoodsUpdate");
			return mav;
		}
		 //查询页面输入id提交后，把结果带回查询页面
		try
		{
			//gName和gRemark自动转入
			gId=Integer.parseInt(request.getParameter("updateGoods"));//保证Id不会被修改
			gNum=Integer.parseInt(request.getParameter("gNumStr"));
			gCost=Integer.parseInt(request.getParameter("gCostStr"));
			gPrice=Integer.parseInt(request.getParameter("gPriceStr"));
			gExchange=Integer.parseInt(request.getParameter("gExchangeStr"));
		}catch(Exception e) //此处不一一检验是哪一个输入不合法，时间关系
		{
			returnMessage="一个或多个输入不和法,请重试";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("GoodsUpdate");
			return mav;			
		}				
		try{
			//gName和gRemark自动装入
			goods.setgId(gId);
			goods.setgNum(gNum);
			goods.setgCost(gCost);
			goods.setgPrice(gPrice);
			goods.setgExchange(gExchange);
			goodsservice.update(goods);
		}catch(Exception e)
		{
			returnMessage="更新ID为:  "+gId+"   的商品失败(未知错误)";
			e.printStackTrace();
		}			
		returnMessage="更新ID为:  "+gId+"   的商品成功,请输入ID查看";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("GoodsUpdate");
		return mav;
	}		
	@RequestMapping("toGoodsDelete")  //跳转到删除客户信息界面 以及 在删除界面的查询
	public ModelAndView toGoodsDelete(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav=selectGoods("GoodsDelete",request, response,session);
		return mav;
	}
	@RequestMapping("GoodsDeleteFromeSql")  //确认删除按钮按下后  从数据库  删除客户信息
	public ModelAndView GoodsDeleteFromeSql(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		int gId;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		
		if((request.getParameter("deleteGoods")=="")|| (request.getParameter("deleteGoods")==null))//前端通过${}赋值，此处不能改为null 如果没有输入ID就点击删除，由这句处理
		{
			returnMessage="为了安全，请输入需要删除的商品ID并搜索信息查看确认";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("GoodsDelete");
			return mav;
		}
		 //查询页面输入id提交后，把结果带回查询页面
		try
		{	//获得用户查询的id
			gId=Integer.parseInt(request.getParameter("deleteGoods"));
		}catch(Exception e) //捕获输入非法字符的情况,这个捕获其实不用加
		{
			returnMessage="ID应该是纯数字";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("GoodsDelete");
			return mav;			
		}				
		try{
			goodsservice.delete(gId);
		}catch(Exception e)
		{
			returnMessage="删除ID为:  "+gId+"   的商品失败,请重试";
			e.printStackTrace();
		}
		returnMessage="删除ID为:  "+gId+"   的商品成功";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("GoodsDelete");
		return mav;
	}
	
	/**
	 * 商品信息处理结束
	 * */
	
	/**
	 * 客户消费处理开始
	 * */
	
	@RequestMapping("toConsumeAdd")  //跳转到添加客户消费界面界面 以及 在添加界面里查询客户
	public ModelAndView toConsumeAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav=selectUser("ConsumeAdd",request, response,session);//处理添加界面的查询
		//mav.setViewName("ConsumeAdd");
		return mav;
	}
	
	@RequestMapping("ConsumeAddToSql")  //跳转到添加客户消费界面界面 以及 
	public ModelAndView ConsumeAddToSql(Consume consume,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		int uId;			//用户ID
		String cDate;		//消费日期
		String cTime;		//消费时间
		int gId;			//商品ID
		int cNum;			//消费数量，用于统计成本和盈利
		int oTid;			//操作类型ID
		int bTid;			//购买类型ID
		int cRedits;		//获得积分
		String cRemark;		//消费备注
		int sId;	
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		try{
			//gName和gRemark自动转入
			uId=Integer.parseInt(request.getParameter("uIdStr"));
			gId=Integer.parseInt(request.getParameter("gIdStr"));
			cNum=Integer.parseInt(request.getParameter("cNumStr"));
			oTid=Integer.parseInt(request.getParameter("oTidStr"));
			bTid=Integer.parseInt(request.getParameter("gPriceStr"));
			cRedits=Integer.parseInt(request.getParameter("cReditsStr"));
			sId=Integer.parseInt(request.getParameter("sIdStr"));
		}catch(Exception e) //处理ID非法输入,时间关系我就不一一检测了
		{
			e.printStackTrace();
			returnMessage="一个或多个输入不合法，请重新输入";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("ConsumeAdd");
			return mav;
		}
		//此处才发觉消费信息数据库设计有问题，是把客户uid当做主键，这就意味着每个客户只能消费一次
		//因为主键数据库中只能有一个，，我日你么啊，整个几把了
		//所以我把主键改成了cTime.用时间来当做主键
			
		try{//Ctime,cDate,cRemark自动装入
			consume.setuId(uId);
			consume.setgId(gId);
			consume.setcNum(cNum);
			consume.setoTid(oTid);
			consume.setbTid(bTid);
			consume.setcRedits(cRedits);
			consume.setsId(sId);
		}catch(Exception e)
		{
			e.printStackTrace();
			returnMessage="客户消费添加失败,请重试(未知原因)";
			mav.setViewName("ConseumeAdd");
			return mav;
		}
		consumeservice.add(consume);
		returnMessage="客户消费添加成功！请输入客户ID查看，欢迎下次光临";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("ConsumeAdd");			
		return mav;		
	}
	
	/**
	 * 积分设置开始
	 * */
	@RequestMapping("SetCredits")  
	public ModelAndView SetCredits(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		Credit credit = new Credit();
		String filePath = new ClassPathResource("credit.properties").getPath();// 文件的路径
		System.out.println("Read propertiesPath:" + filePath);
		Properties pps = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
		pps.load(br);
		credit.setCustomer(pps.getProperty("customer"));
		credit.setSponsor(pps.getProperty("sponsor"));
		credit.setSponsorAndCostomer(pps.getProperty("sponsorAndCostomer"));
		mav.addObject("Credit", credit);
		mav.setViewName("SetCredits");
		return mav;
	}
	@RequestMapping("SetCreditsToFile")
	public ModelAndView SetCreditsToFile(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String filePath = new ClassPathResource("credit.properties").getPath();// 文件的路径
		System.out.println("Write propertiesPath:" + filePath);
		Properties pps = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
		pps.load(br);
		pps.clear();
		pps.setProperty("customer", request.getParameter("customer"));
		pps.setProperty("sponsor", request.getParameter("sponsor"));
		pps.setProperty("sponsorAndCostomer", request.getParameter("sponsorAndCostomer"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new ClassPathResource("credit.properties").getPath())));
		pps.store(bw,"");
		mav.addObject("message", "设置成功！");
		mav.addObject("nextPage", "SetCredits");//返回到SetCredits
		mav.setViewName("MessagePage");
		return mav;
	}
		
	@RequestMapping("toExportExcel")  //跳转到查询客户信息界面
	public ModelAndView toExportExcel(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("ExportExcel");
		return mav;
	}
	
	@RequestMapping("toSystemDescription")  //跳转到系统界面
	public ModelAndView toSystemDescriptiom(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("SystemDescription");
		return mav;
	}
	@RequestMapping("toSystemHelp")  //跳转到系统界面
	public ModelAndView toSystemHelp(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("SystemHelp");
		return mav;
	}
	
}
