package com.mybean.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybean.data.User;
import com.mybean.service.AdminService;
import com.mybean.service.UserService;

@Controller
public class MainOperationController {
	@Autowired
	AdminService adminservice;
	UserService userservice;
	
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
	
	@RequestMapping("toUserAdd")  //跳转到添加客户信息界面
	public ModelAndView toUserAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("UserAdd");
		return mav;
	}
	
	@RequestMapping("UserAddToSql")  //添加客户信息到数据库   后台处理添加成功返回添加界面
	public ModelAndView UserAddToSql(User user) throws Exception {

		System.out.println(user);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("UserAdd");
		return mav;
		
	}
	@RequestMapping("toUserSelect")  //跳转到查询客户信息界面
	public ModelAndView toUserSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		
		
		if(request.getParameter("searchUser")==null)//其他界面跳转到查询页面
		{
			mav.setViewName("UserSelect");
		}
		else  //查询页面输入id提交后，把结果带回查询页面
		{
			int Uid =Integer.parseInt(request.getParameter("searchUser")); 
			/**
			 * 
			 * 此处调用查询语句
			 * */
			System.out.println(request.getParameter("searchUser"));
			System.out.println(Uid);
			User user=userservice.get(Uid);
			mav.addObject("usermessage", user);
			mav.setViewName("UserSelect");
		}
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
