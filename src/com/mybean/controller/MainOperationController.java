package com.mybean.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybean.data.Staff;
import com.mybean.data.User;
import com.mybean.service.AdminService;
import com.mybean.service.StaffService;
import com.mybean.service.UserService;

@Controller
public class MainOperationController {
	@Autowired
	AdminService adminservice;
	@Autowired
	UserService userservice;
	@Autowired
	StaffService staffservice;
	
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
	 * */
	@RequestMapping("toUserAdd")  //跳转到添加客户信息界面
	public ModelAndView toUserAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("UserAdd");
		return mav;
	}
	
/*	@RequestMapping("UserAddToSql")  //添加客户信息到数据库   后台处理添加成功返回添加界面
	public ModelAndView UserAddToSql(User user) throws Exception {

		System.out.println(user);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("UserAdd");
		return mav;
		
	}
*/
	@RequestMapping("UserAddToSql")  //添加客户信息到数据库   后台处理添加成功返回添加界面
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
			e.printStackTrace();
			returnMessage="输入的ID"+uIdStr+"不为纯数字";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserAdd");
			return mav;
		}
		int uSex=Integer.parseInt(uSexStr);
		User userCheck=userservice.get(uId);//检测ID是否注册了
		if(userCheck!=null)
		{
			returnMessage="客户ID"+uId+"已经注册，请换一个ID.";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserAdd");
			return mav;
		}
		//以下注释掉的留着待会儿做非法处理用，因为表单提交的uId和uSex和Bean中的类型不一样，所以用request获取
		//但以下注释掉的类型一样且同名。Spring会自动匹配
		
		/*String uName=request.getParameter("uName");
		String uBirth=request.getParameter("uBirth");
		String uTel=request.getParameter("uTel");
		String uPhoNum=request.getParameter("uPhoNUm");
		String uAddr=request.getParameter("uAddr");
		String uRegDate=request.getParameter("uRegDate");
		String uRemark=request.getParameter("uRemark");
		*/
		
		try{
			user.setuId(uId);
			user.setuSex(uSex);
			/*user.setuName(uName);
			user.setuBirth(uBirth);			
			user.setuTel(uTel);
			user.setuPhoNum(uPhoNum);
			user.setuAddr(uAddr);
			user.setuRegDate(uRegDate);
			user.setuRemark(uRemark);*/
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("这里不行啊");
			mav.setViewName("UserAdd");
			return mav;
		}
		userservice.add(user);
		returnMessage="客户添加成功！";
		mav.setViewName("UserAdd");
				
		return mav;
		
	}
	@RequestMapping("toUserSelect")  //跳转到查询客户信息界面
	public ModelAndView toUserSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchUser")==null)//其他界面跳转到查询页面
		{
			mav.setViewName("UserDelete");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			int  uId;
			//处理输入非数字情况
			try{
				String searchUser=request.getParameter("searchUser");//获得用户查询的id
				uId =Integer.parseInt(searchUser);//将id转化成int
			}catch(Exception e)  //如果用户输入的是非法字符，就会抛出异常，因为integer无法处理非数字字符
			{
				 e.printStackTrace();
				 returnMessage="客户ID为纯数字";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("UserSelect");
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
			mav.setViewName("UserSelect");
		}
		return mav;
	}
	
	@RequestMapping("toUserDelete")  //跳转到删除客户信息界面以及删除界面查询
	public ModelAndView toUserDelete(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchUser")==null)//其他界面跳转到查询页面
		{
			mav.setViewName("UserDelete");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			int  uId;
			//处理输入非数字情况
			try{
				String searchUser=request.getParameter("searchUser");//获得用户查询的id
				uId =Integer.parseInt(searchUser);//将id转化成int
			}catch(Exception e)  //如果用户输入的是非法字符，就会抛出异常，因为integer无法处理非数字字符
			{
				 e.printStackTrace();
				 returnMessage="客户ID为纯数字";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("UserDelete");
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
			mav.setViewName("UserDelete");
		}
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
			System.out.println("你好："+request.getParameter("deleteUser"));
			int uId;
			try
			{
				String deleteUser=request.getParameter("deleteUser");//获得用户查询的id
				 uId=Integer.parseInt(deleteUser);
			}catch(Exception e) //捕获输入非法字符的情况
			{
				e.printStackTrace();
				returnMessage="ID是纯数字";
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
	@RequestMapping("toStaffAdd")  //跳转到添加职工信息界面
	public ModelAndView toStaffAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("StaffAdd");
		return mav;
	}
	
	@RequestMapping("StaffAddToSql")  //添加职工信息到数据库   后台处理添加成功 返回添加界面
	public ModelAndView StaffAddToSql(Staff staff,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("StaffAdd");
		return mav;
		
	}
	@RequestMapping("toStaffSelect")  //跳转到查询职工信息界面
	public ModelAndView toStaffSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchStaff")==null)//其他界面跳转到查询页面
		{
			mav.setViewName("StaffSelect");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			int  sId;
			//处理输入非数字情况
			try{
				String searchStaff=request.getParameter("searchStaff");//获得用户查询的id
				sId =Integer.parseInt(searchStaff);//将id转化成int
			}catch(Exception e)  //如果用户输入的是非法字符，就会抛出异常，因为integer无法处理非数字字符
			{
				 e.printStackTrace();
				 returnMessage="员工ID为纯数字";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("StaffSelect");
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
			mav.setViewName("StaffSelect");
		}
		return mav;	
	}
	
	@RequestMapping("toStaffDelete")  //跳转到删除客户信息界面以及删除界面查询
	public ModelAndView toStaffDelete(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchStaff")==null)//其他界面跳转到查询页面
		{
			mav.setViewName("StaffDelete");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			int  sId;
			//处理输入非数字情况
			try{
				String searchStaff=request.getParameter("searchStaff");//获得用户查询的id
				sId =Integer.parseInt(searchStaff);//将id转化成int
			}catch(Exception e)  //如果用户输入的是非法字符，就会抛出异常，因为integer无法处理非数字字符
			{
				 e.printStackTrace();
				 returnMessage="员工ID为纯数字";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("StaffDelete");
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
			mav.setViewName("StaffDelete");
		}
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
				e.printStackTrace();
				returnMessage="ID是纯数字";
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
