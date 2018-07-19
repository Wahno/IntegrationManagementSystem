package com.mybean.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class DataController {
	
	
	
	@RequestMapping("Data")
	public ModelAndView DataMessage(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("DataJsp/Data");//���ص���JSP�ļ���
		return mav;
	}
	
	@RequestMapping("DataBackup")
	public ModelAndView DataBackUp(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("DataJsp/DataBackup");//���ص���JSP�ļ���
		return mav;
	}
	@RequestMapping("DataRestore")
	public ModelAndView DataRestore(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("DataJsp/DataRestore");//���ص���JSP�ļ���
		return mav;
	}

}
