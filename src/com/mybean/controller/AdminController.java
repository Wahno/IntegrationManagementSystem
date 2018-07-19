package com.mybean.controller;

import java.util.List;

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

	@RequestMapping("AdminMessage")
	public ModelAndView AdminMessage(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("AdminMessage");//返回到的JSP文件名
		return mav;
	}
}
