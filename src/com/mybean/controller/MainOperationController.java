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
/**
 * ���·��������������һ����ֻ�ǲ�����ͬ
 * Ϊ�˰��չ��ܷ֣���û�д������ã�������д
 * **/
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
	 * 
	 * */
	@RequestMapping("toUserAdd")  //��ת����ӿͻ���Ϣ����
	public ModelAndView toUserAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("UserAdd");
		return mav;
	}	
	@RequestMapping("UserAddToSql")  //��ӿͻ���Ϣ�����ݿ�   ��ӳɹ�������ӽ���
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
			//e.printStackTrace();
			returnMessage="�����ID   "+uIdStr+"   ��Ϊ������";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserAdd");
			return mav;
		}
		int uSex=Integer.parseInt(uSexStr);
		User userCheck=userservice.get(uId);//���ID�Ƿ�ע����
		if(userCheck!=null)
		{
			returnMessage="�ͻ�ID   "+uId+"   �Ѿ�ע�ᣬ�뻻һ��ID.";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserAdd");
			return mav;
		}	
		try{
			user.setuId(uId);
			user.setuSex(uSex);
		}catch(Exception e)
		{
			e.printStackTrace();
			mav.setViewName("UserAdd");
			return mav;
		}
		userservice.add(user);
		returnMessage="�ͻ�   "+user.getuName()+"   ��ӳɹ���";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("UserAdd");			
		return mav;		
	}
	@RequestMapping("toUserSelect")  //��ת����ѯ�ͻ���Ϣ����
	public ModelAndView toUserSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchUser")==null)//����������ת����ѯҳ��
		{
			mav.setViewName("UserSelect");
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
				// e.printStackTrace();
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
	
	
	@RequestMapping("toUserUpdate")  //��ת���޸Ŀͻ���Ϣ���� �Լ����޸�ҳ���ѯ
	public ModelAndView toUserUpdate(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchUser")==null)//����������ת����ѯҳ��
		{
			mav.setViewName("UserUpdate");
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
				// e.printStackTrace();
				 returnMessage="�ͻ�IDӦΪ������";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("UserUpdate");
				 return mav;
			}
			User user=userservice.get(uId); //��ѯ
			if(user==null){
				returnMessage="�ÿͻ�������Ŷ!";
			}
			else{
				returnMessage="��������IDΪ:  "+uId+"   �Ŀͻ�";
				mav.addObject("usermessage", user);
			}		
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserUpdate");
		}
		return mav;
	}
	
	@RequestMapping("UserUpDateToSql")//���޸ĺ����Ϣ�ύ�����ݿ�
	public ModelAndView UserUpDateToSql(User user,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		//��ʱ�����Ƿ��иĶ��ļ�⣬����û�иĶ�Ҳ���Ķ��� д�����ݿ�
		int uId;
		String returnMessage="";
		String uSexStr=request.getParameter("uSex");
		ModelAndView mav = new ModelAndView();
		if((request.getParameter("updateUser")=="")|| (request.getParameter("updateUser")==null))//ǰ��ͨ��${}��ֵ���˴����ܸ�Ϊnull ���û������ID�͵��ɾ��������䴦��
		{
			returnMessage="Ϊ�˰�ȫ����������Ҫ�޸ĵĿͻ�ID��������Ϣ�鿴ȷ��";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("UserUpdate");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			try
			{
				String updateUser=request.getParameter("updateUser");//����û���ѯ��id
				uId=Integer.parseInt(updateUser);
			}catch(Exception e) //�����û�id��д�����ݿ⣬�ٶ��������ᱻ�޸ģ����Ұ�����Ҫ����һ��
			{
				returnMessage="ID��������(ϵͳ����)";
				mav.addObject("returnMessage", returnMessage);
				mav.setViewName("UserUpdate");
				return mav;			
			}				
			try{
				int uSex=Integer.parseInt(uSexStr);//����������string,��Ҫ���Ա�ת����int
				user.setuId(uId);					//uiD�����Զ���װ��
				user.setuSex(uSex);                //����user�Ա������Ķ����Զ���װ��
				userservice.update(user);
			}catch(Exception e)
			{
				returnMessage="����IDΪ:  "+uId+"   �Ŀͻ�ʧ��(�������Ա����ô���)";
				e.printStackTrace();
			}			
			returnMessage="����IDΪ:  "+uId+"   �Ŀͻ��ɹ�,������ID�鿴";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("UserUpdate");
		}
		return mav;
	}
	
	
	@RequestMapping("toUserDelete")  //��ת��ɾ���ͻ���Ϣ���� �Լ� ��ɾ������Ĳ�ѯ
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
				// e.printStackTrace();
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
			int uId;
			try
			{
				String deleteUser=request.getParameter("deleteUser");//����û���ѯ��id
				uId=Integer.parseInt(deleteUser);
			}catch(Exception e) //��������Ƿ��ַ������
			{
				//e.printStackTrace();
				returnMessage="IDӦ���Ǵ�����";
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
	
	@RequestMapping("StaffAddToSql") //���ְ����Ϣ�����ݿ�   ��̨������ӳɹ� ������ӽ���
	public ModelAndView StaffAddToSql(Staff staff,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
/*��ʱû�мӵ绰�ȺϷ��Ե��ж�*/
		
		int sId;
		String returnMessage="";
		String sIdStr=request.getParameter("sIdStr");
		String sSexStr=request.getParameter("sSex");
		ModelAndView mav = new ModelAndView();
		try{
			sId=Integer.parseInt(sIdStr);
			
		}catch(Exception e) //����ID�Ƿ�����
		{
			//e.printStackTrace(); 
			returnMessage="�����ID  "+sIdStr+"   ��Ϊ������";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffAdd");
			return mav;
		}
		int sSex=Integer.parseInt(sSexStr);
		Staff staffCheck=staffservice.get(sId);//���ID�Ƿ�ע����
		if(staffCheck!=null)
		{
			returnMessage="ְ��ID   "+sId+"    �Ѿ�ע����ӣ��뻻һ��ID.";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffAdd");
			return mav;
		}	
		try{
			staff.setsId(sId);
			staff.setsSex(sSex);
		}catch(Exception e)
		{
			e.printStackTrace();
			mav.setViewName("StaffAdd");
			return mav;
		}
		staffservice.add(staff);
		returnMessage="ְ��  "+staff.getsName()+"  ��ӳɹ���";
		mav.addObject("returnMessage", returnMessage);
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
				// e.printStackTrace();
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
	@RequestMapping("toStaffUpdate")  //��ת���޸�ְ����Ϣ���� �Լ�ְ��������Ϣ��ѯ
	public ModelAndView toStaffUpdate(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String returnMessage="";
		if(request.getParameter("searchStaff")==null)//����������ת����ѯҳ��
		{
			mav.setViewName("StaffUpdate");
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
				 returnMessage="�ͻ�IDӦΪ������";
				 mav.addObject("returnMessage", returnMessage);
				 mav.setViewName("StaffUpdate");
				 return mav;
			}
			Staff staff=staffservice.get(sId); //��ѯ
			if(staff==null){
				returnMessage="��Ա��������Ŷ!";
			}
			else{
				returnMessage="��������IDΪ:  "+sId+"   ��Ա��";
				mav.addObject("staffmessage", staff);
			}		
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffUpdate");
		}
		return mav;
	}
	
	@RequestMapping("StaffUpDateToSql")//���޸ĺ����Ϣ�ύ�����ݿ�
	public ModelAndView StaffUpDateToSql(Staff staff,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		//��ʱ�����Ƿ��иĶ��ļ�⣬����û�иĶ�Ҳ���Ķ��� д�����ݿ�
		int sId;
		String returnMessage="";
		String sSexStr=request.getParameter("sSex");
		ModelAndView mav = new ModelAndView();
		if((request.getParameter("updateStaff")=="")|| (request.getParameter("updateStaff")==null))//ǰ��ͨ��${}��ֵ���˴����ܸ�Ϊnull ���û������ID�͵��ɾ��������䴦��
		{
			returnMessage="Ϊ�˰�ȫ����������Ҫ�޸ĵ�Ա��ID��������Ϣ�鿴ȷ��";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("StaffUpdate");
		}
		else  //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		{
			try
			{
				String updateStaff=request.getParameter("updateStaff");//����û���ѯ��id
				sId=Integer.parseInt(updateStaff);
			}catch(Exception e) //�����û�id��д�����ݿ⣬�ٶ��������ᱻ�޸ģ����Ұ�����Ҫ����һ��
			{
				returnMessage="ID��������(ϵͳ����)";
				mav.addObject("returnMessage", returnMessage);
				mav.setViewName("StaffUpdate");
				return mav;			
			}				
			try{
				int sSex=Integer.parseInt(sSexStr);//����������string,��Ҫ���Ա�ת����int
				staff.setsId(sId);					//uiD�����Զ���װ��
				staff.setsSex(sSex);                //����user�Ա������Ķ����Զ���װ��
				staffservice.update(staff);
			}catch(Exception e)
			{
				returnMessage="����IDΪ:  "+sId+"   �Ŀͻ�ʧ��(�������Ա����ô���)";
				e.printStackTrace();
			}			
			returnMessage="����IDΪ:  "+sId+"   �Ŀͻ��ɹ�,������ID�鿴";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("StaffUpdate");
		}
		return mav;
	}
	
	
	@RequestMapping("toStaffDelete")  //��ת��ɾ��ְ����Ϣ���� �Լ�  ɾ�������ѯ
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
				 returnMessage="Ա��IDӦ��Ϊ������";
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
				//e.printStackTrace();
				returnMessage="IDӦ���Ǵ�����";
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
