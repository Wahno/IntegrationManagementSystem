package com.mybean.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybean.data.Staff;
import com.mybean.data.User;
import com.mybean.service.AdminService;
import com.mybean.service.GoodsService;
import com.mybean.service.StaffService;
import com.mybean.service.UserService;

@Controller
@RequestMapping("")
public class TestController {
	@Autowired
	AdminService adminservice;

	@RequestMapping("Admin")
	public ModelAndView Admin(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		List<com.mybean.data.Admin> admin= adminservice.list();
		mav.addObject("admin", admin);
		mav.setViewName("TestJsp/Admin");//返回到的JSP文件名
		return mav;
	}
	
	@Autowired
	UserService userservice;

	@RequestMapping("User")
	public ModelAndView User(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		List<User> user= userservice.list();
		mav.addObject("user", user);
		mav.setViewName("TestJsp/User");//返回到的JSP文件名
		return mav;
	}
	
	@Autowired
	StaffService staffservice;

	@RequestMapping("Staff")
	public ModelAndView Staff(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		List<Staff> staff= staffservice.list();
		mav.addObject("staff", staff);
		mav.setViewName("TestJsp/Staff");//返回到的JSP文件名
		return mav;
	}
	
	@Autowired
	GoodsService goodsservice;

	@RequestMapping("Goods")
	public ModelAndView Goods(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		List<com.mybean.data.Goods> goods= goodsservice.list();
		mav.addObject("goods", goods);
		mav.setViewName("TestJsp/Goods");//返回到的JSP文件名
		return mav;
	}
	
	
	
}
