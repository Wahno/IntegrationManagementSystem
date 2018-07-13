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
public class LoginController {
	@Autowired
	AdminService adminservice;

	@RequestMapping("Login")
	public ModelAndView Admin(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		Admin admin = new Admin();
		admin=adminservice.get((Integer.parseInt(request.getParameter("id"))));
		String password =  request.getParameter("password");
		if(admin.getaPassword().equals(password)){
			mav.addObject("admin", admin);
			mav.setViewName("Login");//���ص���JSP�ļ���
		}
		else{
			mav.addObject("message", "�û��������벻��ȷ��");
			mav.setViewName("../");//���ص���JSP�ļ���
		}
		return mav;
	}
}
