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
	
	@RequestMapping("")
	public ModelAndView Index(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("../index");
		return mav;
	}
	@RequestMapping("Login")
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		Admin admin = (Admin)session.getAttribute("adminmessage");
		//�ѵ�¼ֱ����ת
		if(admin!=null){ 
			mav.addObject("admin", admin);
			mav.setViewName("Main");//���ص���JSP�ļ���
			return mav;
		}
		//�û����ж�
		admin=adminservice.get((Integer.parseInt(request.getParameter("id"))));
		if(admin==null){
			mav.addObject("message", "�û�������ȷ��");
			mav.addObject("nextPage", "./");//���ص�index
			mav.setViewName("MessagePage");//�м̽���
			return mav;
		}
		//�����ж�
		String password =  request.getParameter("password");
		if(admin.getaPassword().equals(password)){
			mav.addObject("admin", admin);
			session.setAttribute("adminmessage", admin);
			mav.setViewName("Main");//���ص���JSP�ļ���
		}
		else{
			mav.addObject("message", "���벻��ȷ��");
			mav.addObject("nextPage", "./");//���ص�index
			mav.setViewName("MessagePage");//�м̽���
		}
		return mav;
	}
	
	@RequestMapping("Logout")
	public ModelAndView Logout(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		session.invalidate();
		mav.setViewName("./");
		return mav;
	}
	@RequestMapping("Main")
	public ModelAndView Main(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		Admin admin = (Admin)session.getAttribute("adminmessage");
		
		//�ѵ�¼ֱ����ת
		if(admin!=null){ 
			mav.addObject("admin", admin);
			mav.setViewName("Main");//���ص���JSP�ļ���
			return mav;
		}
		else
			mav.setViewName("./");
		return mav;
	}
	@RequestMapping("Forget")
	public ModelAndView Forget(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ForgetPassword");
		return mav;
	}
	@RequestMapping("ForgetPassword")
	public ModelAndView ForgetPassword(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		Admin admin=new Admin();
		if(request.getParameter("password").equals(request.getParameter("passwordAgain"))){
			admin=adminservice.get(Integer.parseInt(request.getParameter("id")));
			if(admin.getaPhoNum().equals(request.getParameter("phone"))){
				admin.setaPassword(request.getParameter("password"));
				adminservice.update(admin);
				mav.addObject("message", "�޸ĳɹ���");
				mav.addObject("nextPage", "./");//���ص�index
				mav.setViewName("MessagePage");//�м̽���
				return mav;
			}
			else{
				mav.addObject("message", "�ֻ�������");
				mav.addObject("nextPage", "Forget");//���ص�Forget
				mav.setViewName("MessagePage");//�м̽���
			}
		}
		else{
			mav.addObject("message", "�������벻һ�£�");
			mav.addObject("nextPage", "Forget");//���ص�Forget
			mav.setViewName("MessagePage");//�м̽���
		}
			
		return mav;
	}
}
