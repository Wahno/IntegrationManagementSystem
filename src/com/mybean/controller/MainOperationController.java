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
	/**
	 * ����Ϊ�ͻ���Ϣ�������
	 * */
	@RequestMapping("toUserAdd")  //��ת����ӿͻ���Ϣ����
	public ModelAndView toUserAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("UserAdd");
		return mav;
	}
	
/*	@RequestMapping("UserAddToSql")  //��ӿͻ���Ϣ�����ݿ�   ��̨������ӳɹ�������ӽ���
	public ModelAndView UserAddToSql(User user) throws Exception {

		System.out.println(user);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("UserAdd");
		return mav;
		
	}
*/
	@RequestMapping("UserAddToSql")  //��ӿͻ���Ϣ�����ݿ�   ��̨������ӳɹ�������ӽ���
	public ModelAndView UserAddToSql(User user,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
/*��ʱû�мӵ绰�ȺϷ��Ե��ж�*/
		
		int uId;
		String returnMessage="";
		String uIdStr=request.getParameter("uIdStr");
		String uSexStr=request.getParameter("uSex");
		ModelAndView mav = new ModelAndView();
		try{
			uId=Integer.parseInt(uIdStr);
			
		}catch(Exception e) //����ID�Ƿ�����
		{
			e.printStackTrace();
			returnMessage="�����ID"+uIdStr+"��Ϊ������";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserAdd");
			return mav;
		}
		int uSex=Integer.parseInt(uSexStr);
		User userCheck=userservice.get(uId);//���ID�Ƿ�ע����
		if(userCheck!=null)
		{
			returnMessage="�ͻ�ID"+uId+"�Ѿ�ע�ᣬ�뻻һ��ID.";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserAdd");
			return mav;
		}
		//����ע�͵������Ŵ�������Ƿ������ã���Ϊ���ύ��uId��uSex��Bean�е����Ͳ�һ����������request��ȡ
		//������ע�͵�������һ����ͬ����Spring���Զ�ƥ��
		
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
			System.out.println("���ﲻ�а�");
			mav.setViewName("UserAdd");
			return mav;
		}
		userservice.add(user);
		returnMessage="�ͻ���ӳɹ���";
		mav.setViewName("UserAdd");
				
		return mav;
		
	}
	@RequestMapping("toUserSelect")  //��ת����ѯ�ͻ���Ϣ����
	public ModelAndView toUserSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchUser")==null)//����������ת����ѯҳ��
		{
			mav.setViewName("UserDelete");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			int  uId;
			//����������������
			try{
				String searchUser=request.getParameter("searchUser");//����û���ѯ��id
				uId =Integer.parseInt(searchUser);//��idת����int
			}catch(Exception e)  //����û�������ǷǷ��ַ����ͻ��׳��쳣����Ϊinteger�޷�����������ַ�
			{
				 e.printStackTrace();
				 returnMessage="�ͻ�IDΪ������";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("UserSelect");
				 return mav;
			}
			User user=userservice.get(uId);
			if(user==null){
				returnMessage="�ÿͻ�������Ŷ!";
			}
			else{
				returnMessage="��������IDΪ:  "+uId+"   �Ŀͻ�";
				mav.addObject("usermessage", user);
			}
			
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserSelect");
		}
		return mav;
	}
	
	@RequestMapping("toUserDelete")  //��ת��ɾ���ͻ���Ϣ�����Լ�ɾ�������ѯ
	public ModelAndView toUserDelete(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchUser")==null)//����������ת����ѯҳ��
		{
			mav.setViewName("UserDelete");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			int  uId;
			//����������������
			try{
				String searchUser=request.getParameter("searchUser");//����û���ѯ��id
				uId =Integer.parseInt(searchUser);//��idת����int
			}catch(Exception e)  //����û�������ǷǷ��ַ����ͻ��׳��쳣����Ϊinteger�޷�����������ַ�
			{
				 e.printStackTrace();
				 returnMessage="�ͻ�IDΪ������";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("UserDelete");
				 return mav;
			}
			User user=userservice.get(uId);
			if(user==null){
				returnMessage="�ÿͻ�������Ŷ!";
			}
			else{
				returnMessage="��������IDΪ:  "+uId+"   �Ŀͻ�";
				mav.addObject("usermessage", user);
			}		
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserDelete");
		}
		return mav;
	}
	@RequestMapping("UserDeleteFromeSql")  //ȷ��ɾ����ť���º�  �����ݿ�  ɾ���ͻ���Ϣ
	public ModelAndView UserDeleteFromeSql(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if((request.getParameter("deleteUser")=="")|| (request.getParameter("deleteUser")==null))//ǰ��ͨ��${}��ֵ���˴����ܸ�Ϊnull ���û������ID�͵��ɾ��������䴦��
		{
			returnMessage="Ϊ�˰�ȫ����������Ҫɾ���Ŀͻ�ID��������Ϣ�鿴ȷ��";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("UserDelete");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			System.out.println("��ã�"+request.getParameter("deleteUser"));
			int uId;
			try
			{
				String deleteUser=request.getParameter("deleteUser");//����û���ѯ��id
				 uId=Integer.parseInt(deleteUser);
			}catch(Exception e) //��������Ƿ��ַ������
			{
				e.printStackTrace();
				returnMessage="ID�Ǵ�����";
				mav.addObject("returnMessage", returnMessage);
				mav.setViewName("UserDelete");
				return mav;
				
			}				
			try{
				userservice.delete(uId);
			}catch(Exception e)
			{
				returnMessage="ɾ��IDΪ:  "+uId+"   �Ŀͻ�ʧ��";
				e.printStackTrace();
			}
			returnMessage="ɾ��IDΪ:  "+uId+"   �Ŀͻ��ɹ�";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserDelete");
		}
		return mav;
	}
	
	/**
	 * �ͻ���Ϣ�������
	 * */
	
	
	/**
	 * ְ����Ϣ����ʼ
	 * */
	@RequestMapping("toStaffAdd")  //��ת�����ְ����Ϣ����
	public ModelAndView toStaffAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("StaffAdd");
		return mav;
	}
	
	@RequestMapping("StaffAddToSql")  //���ְ����Ϣ�����ݿ�   ��̨������ӳɹ� ������ӽ���
	public ModelAndView StaffAddToSql(Staff staff,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("StaffAdd");
		return mav;
		
	}
	@RequestMapping("toStaffSelect")  //��ת����ѯְ����Ϣ����
	public ModelAndView toStaffSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchStaff")==null)//����������ת����ѯҳ��
		{
			mav.setViewName("StaffSelect");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			int  sId;
			//����������������
			try{
				String searchStaff=request.getParameter("searchStaff");//����û���ѯ��id
				sId =Integer.parseInt(searchStaff);//��idת����int
			}catch(Exception e)  //����û�������ǷǷ��ַ����ͻ��׳��쳣����Ϊinteger�޷�����������ַ�
			{
				 e.printStackTrace();
				 returnMessage="Ա��IDΪ������";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("StaffSelect");
				 return mav;
			}
			Staff staff=staffservice.get(sId); 
			if(staff==null){
				returnMessage="��ְ��ID�����ţ�������Ŷ��";
			}
			else{
				returnMessage="��������IDΪ:  "+sId+"   ��Ա��";
				mav.addObject("staffmessage", staff);
			}		
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffSelect");
		}
		return mav;	
	}
	
	@RequestMapping("toStaffDelete")  //��ת��ɾ���ͻ���Ϣ�����Լ�ɾ�������ѯ
	public ModelAndView toStaffDelete(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchStaff")==null)//����������ת����ѯҳ��
		{
			mav.setViewName("StaffDelete");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			int  sId;
			//����������������
			try{
				String searchStaff=request.getParameter("searchStaff");//����û���ѯ��id
				sId =Integer.parseInt(searchStaff);//��idת����int
			}catch(Exception e)  //����û�������ǷǷ��ַ����ͻ��׳��쳣����Ϊinteger�޷�����������ַ�
			{
				 e.printStackTrace();
				 returnMessage="Ա��IDΪ������";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("StaffDelete");
				 return mav;
			}
			Staff staff=staffservice.get(sId); 
			if(staff==null){
				returnMessage="��ְ��ID�����ţ�������Ŷ��";
			}
			else{
				returnMessage="��������IDΪ:  "+sId+"   ��Ա��";
				mav.addObject("staffmessage", staff);
			}		
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffDelete");
		}
		return mav;	
	}
	
	@RequestMapping("StaffDeleteFromeSql")  //ȷ��ɾ����ť���º�  �����ݿ�  ɾ���ͻ���Ϣ
	public ModelAndView StaffDeleteFromeSql(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if((request.getParameter("deleteUser")=="")||(request.getParameter("deleteStaff")==null))//ǰ��ͨ��${}��ֵ���˴����ܸ�Ϊnull ���û������ID�͵��ɾ��������䴦��
		{
			returnMessage="Ϊ�˰�ȫ����������Ҫɾ���Ŀͻ�ID��������Ϣ�鿴ȷ��";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("StaffDelete");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			System.out.println("��ã�"+request.getParameter("deleteUser"));
			int sId;
			try
			{
				String deleteStaff=request.getParameter("deleteStaff");//����û���ѯ��id
				 sId=Integer.parseInt(deleteStaff);
			}catch(Exception e) //��������Ƿ��ַ������
			{
				e.printStackTrace();
				returnMessage="ID�Ǵ�����";
				mav.addObject("returnMessage", returnMessage);
				mav.setViewName("StaffDelete");
				return mav;
				
			}				
			try{
				userservice.delete(sId);
			}catch(Exception e)
			{
				returnMessage="ɾ��IDΪ:  "+sId+"   ��ְ��ʧ��";
				e.printStackTrace();
			}
			returnMessage="ɾ��IDΪ:  "+sId+"   ��ְ���ɹ�";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffDelete");
		}
		return mav;
	}
	
	/**
	 * ְ����Ϣ�������
	 * */
	
	
	
	
	
	
	
	
	
	
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
