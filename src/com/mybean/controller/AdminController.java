package com.mybean.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybean.data.Admin;
import com.mybean.service.AdminService;

@Controller
@RequestMapping("")
public class AdminController {
	@Autowired
	AdminService adminservice;
	
	@RequestMapping(value="Admin")
	public ModelAndView Admin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		Admin admin= adminservice.get(1);
		mav.addObject("admin", admin);
		mav.setViewName("Admin");//���ص��ļ���
		return mav;
		}
}
