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
	
	@RequestMapping("ConsumeMain")  //�ͻ��ܽ���
	public ModelAndView ConsumeMain(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("ConsumeMain");
		return mav;
	}
	
	@RequestMapping("ConsumeInfo")  //���пͻ���Ϣ����
	public ModelAndView ConsumeInfo(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		/**
		 * �˴�������Ϣ��ѯ���
		 * */
		mav.setViewName("ConsumeInfo");
		return mav;
	}
	
	@RequestMapping("ConsumeCredits")  //���л�����Ϣ����
	public ModelAndView ConsumeCredits(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		/**
		 * �˴����û��ֲ�ѯ���
		 * */
		mav.setViewName("ConsumeCredits");
		return mav;
	}
	
	@RequestMapping("ConsumeExchange")  //���жһ���Ϣ����
	public ModelAndView ConsumeExchange(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		/**
		 * �˴����û��ֲ�ѯ���
		 * */
		mav.setViewName("ConsumeExchange");
		return mav;
	}
	
	@RequestMapping("toUserAdd")  //��ת����ӿͻ���Ϣ����
	public ModelAndView toUserAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("UserAdd");
		return mav;
	}
	
	@RequestMapping("UserAddToSql")  //��ӿͻ���Ϣ�����ݿ�   ��̨������ӳɹ�������ӽ���
	public ModelAndView UserAddToSql(User user) throws Exception {

		System.out.println(user);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("UserAdd");
		return mav;
		
	}
	@RequestMapping("toUserSelect")  //��ת����ѯ�ͻ���Ϣ����
	public ModelAndView toUserSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		
		
		if(request.getParameter("searchUser")==null)//����������ת����ѯҳ��
		{
			mav.setViewName("UserSelect");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			int Uid =Integer.parseInt(request.getParameter("searchUser")); 
			/**
			 * 
			 * �˴����ò�ѯ���
			 * */
			System.out.println(request.getParameter("searchUser"));
			System.out.println(Uid);
			User user=userservice.get(Uid);
			mav.addObject("usermessage", user);
			mav.setViewName("UserSelect");
		}
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("toExportExcel")  //��ת����ѯ�ͻ���Ϣ����
	public ModelAndView toExportExcel(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("ExportExcel");
		return mav;
	}
	
	
	@RequestMapping("toSystemDescription")  //��ת��ϵͳ����
	public ModelAndView toSystemDescriptiom(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("SystemDescription");
		return mav;
	}
	@RequestMapping("toSystemHelp")  //��ת��ϵͳ����
	public ModelAndView toSystemHelp(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("SystemHelp");
		return mav;
	}
	
}
