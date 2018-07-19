package com.mybean.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybean.data.Consume;
import com.mybean.data.Credit;
import com.mybean.data.Goods;
import com.mybean.data.Staff;
import com.mybean.data.User;
import com.mybean.service.AdminService;
import com.mybean.service.ConsumeService;
import com.mybean.service.GoodsService;
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
	@Autowired
	GoodsService goodsservice;
	@Autowired
	ConsumeService consumeservice;
	
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
	/**��ѯ���ڲ�ѯ������ã��޸ģ�ɾ����������Ӳ�ѯ�������
	 * ������String toSrc:��ѯ��󷵻صĽ���
	 * */
	public ModelAndView selectUser(String toSrc,HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		int  uId;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		if(request.getParameter("searchUser")==null)//����������ת����ѯҳ��
		{
			mav.setViewName(toSrc);
			return mav;
		}
		//��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��	
		//����������������
		try{
			uId =Integer.parseInt(request.getParameter("searchUser"));//����û���ѯ��id,��idת����int
		}catch(Exception e)  //����û�������ǷǷ��ַ����ͻ��׳��쳣����Ϊinteger�޷�����������ַ�
		{
			 returnMessage="�ͻ�IDΪ������";
			 mav.addObject("returnMessage", returnMessage);
			 mav.setViewName(toSrc);
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
		mav.setViewName(toSrc);
		return mav;
	}
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
			returnMessage="��ӿͻ�     "+user.getuName()+"     ʧ��,������(δ֪ԭ��)";
			mav.setViewName("UserAdd");
			return mav;
		}
		userservice.add(user);
		returnMessage="�ͻ�   "+user.getuName()+"   ��ӳɹ���������ID�鿴";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("UserAdd");			
		return mav;		
	}
	@RequestMapping("toUserSelect")  //��ת����ѯ�ͻ���Ϣ����
	public ModelAndView toUserSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectUser("UserSelect",request, response,session);
		return mav;
	}
	
	
	@RequestMapping("toUserUpdate")  //��ת���޸Ŀͻ���Ϣ���� �Լ����޸�ҳ���ѯ
	public ModelAndView toUserUpdate(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectUser("UserUpdate",request, response,session);
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
		mav=selectUser("UserDelete",request, response,session);
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
	/**��ѯ���ڲ�ѯ������ã��޸ģ�ɾ����������Ӳ�ѯ�������
	 * ������String toSrc:��ѯ��󷵻صĽ���
	 * */
	public ModelAndView selectStaff(String toSrc,HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		int  sId;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		if(request.getParameter("searchStaff")==null)//����������ת����ѯҳ��
		{
			mav.setViewName(toSrc);
			return mav;	
		}
		//��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��	
		//����������������
		try{
			sId =Integer.parseInt(request.getParameter("searchStaff"));//����û���ѯ��id,��idת����int
		}catch(Exception e)  //����û�������ǷǷ��ַ����ͻ��׳��쳣����Ϊinteger�޷�����������ַ�
		{
			// e.printStackTrace();
			 returnMessage="Ա��IDΪ������";
			 mav.addObject("returnMessage", returnMessage);
			 mav.setViewName(toSrc);
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
		mav.setViewName(toSrc);
		return mav;	
	}
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
		returnMessage="ְ��  "+staff.getsName()+"  ��ӳɹ���������ID�鿴";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("StaffAdd");			
		return mav;		
	}

	@RequestMapping("toStaffSelect")  //��ת����ѯְ����Ϣ����
	public ModelAndView toStaffSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectStaff("StaffSelect",request,response,session);
		return mav;	
	}
	@RequestMapping("toStaffUpdate")  //��ת���޸�ְ����Ϣ���� �Լ�ְ��������Ϣ��ѯ
	public ModelAndView toStaffUpdate(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectStaff("StaffUpdate",request,response,session);
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
		mav=selectStaff("StaffDelete",request,response,session);
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
	
	/**
	 * ����Ϊ��Ʒ��Ϣ�������
	 * 
	 * */
	
	/**
	 * ��ѯ���ڲ�ѯ������ã��޸ģ�ɾ����������Ӳ�ѯ�������
	 * ������String toSrc:��ѯ��󷵻صĽ���
	 * */
	public ModelAndView selectGoods(String toSrc,HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		int  gId;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		if(request.getParameter("searchGoods")==null)//����������ת����ѯҳ��
		{
			System.out.println(request.getParameter("searchGoods"));
			mav.setViewName(toSrc);
			return mav;
		}
		//��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��	
		//����������������
		try{
			gId =Integer.parseInt(request.getParameter("searchGoods"));//����û���ѯ��id,��idת����int
		}catch(Exception e)  //����û�������ǷǷ��ַ����ͻ��׳��쳣����Ϊinteger�޷�����������ַ�
		{
			 returnMessage="��ƷIDΪ������";
			 mav.addObject("returnMessage", returnMessage);
			 mav.setViewName(toSrc);
			 return mav;
		}
		Goods goods=goodsservice.get(gId);
		if(goods==null){
			returnMessage="����Ʒ������Ŷ!";
		}
		else{
			returnMessage="��������IDΪ:  "+gId+"   ����Ʒ";
			mav.addObject("goodsmessage", goods);
		}		
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName(toSrc);
		return mav;
	}
	@RequestMapping("toGoodsAdd")  //��ת����ӿͻ���Ϣ����
	public ModelAndView toGoodsAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("GoodsAdd");
		return mav;
	}	
	@RequestMapping("GoodsAddToSql")  //��ӿͻ���Ϣ�����ݿ�   ��ӳɹ�������ӽ���
	public ModelAndView GoodsAddToSql(Goods goods,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
	
		int gId;
		int gNum;
		int gCost;
		int gPrice;
		int gExchange;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		try{
			//gName��gRemark�Զ�ת��
			gId=Integer.parseInt(request.getParameter("gIdStr"));
			gNum=Integer.parseInt(request.getParameter("gNumStr"));
			gCost=Integer.parseInt(request.getParameter("gCostStr"));
			gPrice=Integer.parseInt(request.getParameter("gPriceStr"));
			gExchange=Integer.parseInt(request.getParameter("gExchangeStr"));
			
		}catch(Exception e) //����ID�Ƿ�����,ʱ���ϵ�ҾͲ�һһ�����
		{
			returnMessage="һ���������벻�Ϸ�������������";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("GoodsAdd");
			return mav;
		}
		Goods goodsCheck=goodsservice.get(gId);//���ID�Ƿ������
		if(goodsCheck!=null)
		{
			returnMessage="��ƷID   "+gId+"   �Ѿ���ӣ��뻻��һ��ID.";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("GoodsAdd");
			return mav;
		}	
		try{
			goods.setgId(gId);
			goods.setgNum(gNum);
			goods.setgCost(gCost);
			goods.setgPrice(gPrice);
			goods.setgExchange(gExchange);
		}catch(Exception e)
		{
			e.printStackTrace();
			returnMessage="��Ʒ     "+goods.getgName()+"    ���ʧ��,������(δ֪ԭ��)";
			mav.setViewName("GoodsAdd");
			return mav;
		}
		goodsservice.add(goods);
		returnMessage="��Ʒ   "+goods.getgName()+"   ��ӳɹ���������ID�鿴";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("GoodsAdd");			
		return mav;		
	}
	@RequestMapping("toGoodsSelect")  //��ת����ѯ�ͻ���Ϣ����
	public ModelAndView toGoodsSelect(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectGoods("GoodsSelect",request, response,session);
		return mav;
	}
		
	@RequestMapping("toGoodsUpdate")  //��ת���޸Ŀͻ���Ϣ���� �Լ����޸�ҳ���ѯ
	public ModelAndView toGoodsUpdate(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav=selectGoods("GoodsUpdate",request, response,session);
		return mav;
	}
	
	@RequestMapping("GoodsUpDateToSql")//���޸ĺ����Ϣ�ύ�����ݿ�
	public ModelAndView GoodsUpDateToSql(Goods goods,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		//��ʱ�����Ƿ��иĶ��ļ�⣬����û�иĶ�Ҳ���Ķ��� д�����ݿ�
		int gId;
		int gNum;
		int gCost;
		int gPrice;
		int gExchange;
		String returnMessage="";	
		ModelAndView mav = new ModelAndView();
		
		if((request.getParameter("updateGoods")=="")|| (request.getParameter("updateGoods")==null))//ǰ��ͨ��${}��ֵ���˴����ܸ�Ϊnull ���û������ID�͵��ɾ��������䴦��
		{
			returnMessage="Ϊ�˰�ȫ����������Ҫ�޸ĵ���ƷID��������Ϣ�鿴ȷ��";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("GoodsUpdate");
			return mav;
		}
		 //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		try
		{
			//gName��gRemark�Զ�ת��
			gId=Integer.parseInt(request.getParameter("updateGoods"));//��֤Id���ᱻ�޸�
			gNum=Integer.parseInt(request.getParameter("gNumStr"));
			gCost=Integer.parseInt(request.getParameter("gCostStr"));
			gPrice=Integer.parseInt(request.getParameter("gPriceStr"));
			gExchange=Integer.parseInt(request.getParameter("gExchangeStr"));
		}catch(Exception e) //�˴���һһ��������һ�����벻�Ϸ���ʱ���ϵ
		{
			returnMessage="һ���������벻�ͷ�,������";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("GoodsUpdate");
			return mav;			
		}				
		try{
			//gName��gRemark�Զ�װ��
			goods.setgId(gId);
			goods.setgNum(gNum);
			goods.setgCost(gCost);
			goods.setgPrice(gPrice);
			goods.setgExchange(gExchange);
			goodsservice.update(goods);
		}catch(Exception e)
		{
			returnMessage="����IDΪ:  "+gId+"   ����Ʒʧ��(δ֪����)";
			e.printStackTrace();
		}			
		returnMessage="����IDΪ:  "+gId+"   ����Ʒ�ɹ�,������ID�鿴";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("GoodsUpdate");
		return mav;
	}		
	@RequestMapping("toGoodsDelete")  //��ת��ɾ���ͻ���Ϣ���� �Լ� ��ɾ������Ĳ�ѯ
	public ModelAndView toGoodsDelete(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav=selectGoods("GoodsDelete",request, response,session);
		return mav;
	}
	@RequestMapping("GoodsDeleteFromeSql")  //ȷ��ɾ����ť���º�  �����ݿ�  ɾ���ͻ���Ϣ
	public ModelAndView GoodsDeleteFromeSql(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		int gId;
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		
		if((request.getParameter("deleteGoods")=="")|| (request.getParameter("deleteGoods")==null))//ǰ��ͨ��${}��ֵ���˴����ܸ�Ϊnull ���û������ID�͵��ɾ��������䴦��
		{
			returnMessage="Ϊ�˰�ȫ����������Ҫɾ������ƷID��������Ϣ�鿴ȷ��";
			mav.addObject("returnMessage",returnMessage);
			mav.setViewName("GoodsDelete");
			return mav;
		}
		 //��ѯҳ������id�ύ�󣬰ѽ�����ز�ѯҳ��
		try
		{	//����û���ѯ��id
			gId=Integer.parseInt(request.getParameter("deleteGoods"));
		}catch(Exception e) //��������Ƿ��ַ������,���������ʵ���ü�
		{
			returnMessage="IDӦ���Ǵ�����";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("GoodsDelete");
			return mav;			
		}				
		try{
			goodsservice.delete(gId);
		}catch(Exception e)
		{
			returnMessage="ɾ��IDΪ:  "+gId+"   ����Ʒʧ��,������";
			e.printStackTrace();
		}
		returnMessage="ɾ��IDΪ:  "+gId+"   ����Ʒ�ɹ�";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("GoodsDelete");
		return mav;
	}
	
	/**
	 * ��Ʒ��Ϣ�������
	 * */
	
	/**
	 * �ͻ����Ѵ���ʼ
	 * */
	
	@RequestMapping("toConsumeAdd")  //��ת����ӿͻ����ѽ������ �Լ� ����ӽ������ѯ�ͻ�
	public ModelAndView toConsumeAdd(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav=selectUser("ConsumeAdd",request, response,session);//������ӽ���Ĳ�ѯ
		//mav.setViewName("ConsumeAdd");
		return mav;
	}
	
	@RequestMapping("ConsumeAddToSql")  //��ת����ӿͻ����ѽ������ �Լ� 
	public ModelAndView ConsumeAddToSql(Consume consume,HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		
		int uId;			//�û�ID
		String cDate;		//��������
		String cTime;		//����ʱ��
		int gId;			//��ƷID
		int cNum;			//��������������ͳ�Ƴɱ���ӯ��
		int oTid;			//��������ID
		int bTid;			//��������ID
		int cRedits;		//��û���
		String cRemark;		//���ѱ�ע
		int sId;	
		String returnMessage="";
		ModelAndView mav = new ModelAndView();
		try{
			//gName��gRemark�Զ�ת��
			uId=Integer.parseInt(request.getParameter("uIdStr"));
			gId=Integer.parseInt(request.getParameter("gIdStr"));
			cNum=Integer.parseInt(request.getParameter("cNumStr"));
			oTid=Integer.parseInt(request.getParameter("oTidStr"));
			bTid=Integer.parseInt(request.getParameter("gPriceStr"));
			cRedits=Integer.parseInt(request.getParameter("cReditsStr"));
			sId=Integer.parseInt(request.getParameter("sIdStr"));
		}catch(Exception e) //����ID�Ƿ�����,ʱ���ϵ�ҾͲ�һһ�����
		{
			e.printStackTrace();
			returnMessage="һ���������벻�Ϸ�������������";
			mav.addObject("returnMessage", returnMessage);
			mav.setViewName("ConsumeAdd");
			return mav;
		}
		//�˴��ŷ���������Ϣ���ݿ���������⣬�ǰѿͻ�uid���������������ζ��ÿ���ͻ�ֻ������һ��
		//��Ϊ�������ݿ���ֻ����һ������������ô��������������
		//�����Ұ������ĳ���cTime.��ʱ������������
			
		try{//Ctime,cDate,cRemark�Զ�װ��
			consume.setuId(uId);
			consume.setgId(gId);
			consume.setcNum(cNum);
			consume.setoTid(oTid);
			consume.setbTid(bTid);
			consume.setcRedits(cRedits);
			consume.setsId(sId);
		}catch(Exception e)
		{
			e.printStackTrace();
			returnMessage="�ͻ��������ʧ��,������(δ֪ԭ��)";
			mav.setViewName("ConseumeAdd");
			return mav;
		}
		consumeservice.add(consume);
		returnMessage="�ͻ�������ӳɹ���������ͻ�ID�鿴����ӭ�´ι���";
		mav.addObject("returnMessage", returnMessage);
		mav.setViewName("ConsumeAdd");			
		return mav;		
	}
	
	/**
	 * �������ÿ�ʼ
	 * */
	@RequestMapping("SetCredits")  
	public ModelAndView SetCredits(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		Credit credit = new Credit();
		String filePath = new ClassPathResource("credit.properties").getPath();// �ļ���·��
		System.out.println("Read propertiesPath:" + filePath);
		Properties pps = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
		pps.load(br);
		credit.setCustomer(pps.getProperty("customer"));
		credit.setSponsor(pps.getProperty("sponsor"));
		credit.setSponsorAndCostomer(pps.getProperty("sponsorAndCostomer"));
		mav.addObject("Credit", credit);
		mav.setViewName("SetCredits");
		return mav;
	}
	@RequestMapping("SetCreditsToFile")
	public ModelAndView SetCreditsToFile(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {

		ModelAndView mav = new ModelAndView();
		String filePath = new ClassPathResource("credit.properties").getPath();// �ļ���·��
		System.out.println("Write propertiesPath:" + filePath);
		Properties pps = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
		pps.load(br);
		pps.clear();
		pps.setProperty("customer", request.getParameter("customer"));
		pps.setProperty("sponsor", request.getParameter("sponsor"));
		pps.setProperty("sponsorAndCostomer", request.getParameter("sponsorAndCostomer"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new ClassPathResource("credit.properties").getPath())));
		pps.store(bw,"");
		mav.addObject("message", "���óɹ���");
		mav.addObject("nextPage", "SetCredits");//���ص�SetCredits
		mav.setViewName("MessagePage");
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
