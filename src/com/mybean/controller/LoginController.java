package com.mybean.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybean.data.Admin;
import com.mybean.service.AdminService;

@Controller
@RequestMapping("")
public class LoginController {
	@Autowired
	AdminService adminservice;

	@RequestMapping("Login")
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		Admin admin = (Admin)session.getAttribute("adminmessage");
		//已登录直接跳转
		if(admin!=null){ 
			mav.addObject("admin", admin);
			mav.setViewName("Main");//返回到的JSP文件名
			return mav;
		}
		//用户名判断
		admin=adminservice.get((Integer.parseInt(request.getParameter("id"))));
		if(admin==null){
			mav.addObject("message", "用户名不正确！");
			mav.setViewName("../index");//返回到index
			return mav;
		}
		//密码判断
		String password =  request.getParameter("password");
		if(admin.getaPassword().equals(password)){
			mav.addObject("admin", admin);
			session.setAttribute("adminmessage", admin);
			mav.setViewName("Main");//返回到的JSP文件名
		}
		else{
			mav.addObject("message", "密码不正确！");
			mav.setViewName("../index");//返回到index
		}
		return mav;
	}
	
	@RequestMapping("Logout")
	public ModelAndView Logout(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		session.invalidate();
		mav.setViewName("../index");
		return mav;
	}
	@RequestMapping("Main")
	public ModelAndView Main(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		Admin admin = (Admin)session.getAttribute("adminmessage");
		//已登录直接跳转
		if(admin!=null){ 
			mav.addObject("admin", admin);
			mav.setViewName("Main");//返回到的JSP文件名
			return mav;
		}
		else
			mav.setViewName("../index");
		return mav;
	}
}
