package com.mybean.data;

public class User{
	private int uId;		//�ͻ�ID
	private String uName;	//�ͻ�����
	private int	uSex;	    //�ͻ��Ա�,0->�У�1->Ů
	private String uBirth;	//�ͻ�����
	private String uTel;	//�ͻ��绰
	private String uPhoNum;	//�ͻ��ֻ�
	private String uAddr;	//�ͻ���ַ
	private String uRegDate;//�ͻ�ע������
	private String uRemark;	//�ͻ�Ȩ��
		public int getuId() {
			return uId;
		}
		public void setuId(int uId) {
			this.uId = uId;
		}
		public String getuName() {
			return uName;
		}
		public void setuName(String uName) {
			this.uName = uName;
		}
		public int getuSex() {
			return uSex;
		}
		public void setuSex(int uSex) {
			this.uSex = uSex;
		}
		
		public String getuBirth() {
			return uBirth;
		}
		public void setuBirth(String uBirth) {
			this.uBirth = uBirth;
		}
		public String getuTel() {
			return uTel;
		}
		public void setuTel(String uTel) {
			this.uTel = uTel;
		}
		public String getuPhoNum() {
			return uPhoNum;
		}
		public void setuPhoNum(String uPhoNum) {
			this.uPhoNum = uPhoNum;
		}
		public String getuAddr() {
			return uAddr;
		}
		public void setuAddr(String uAddr) {
			this.uAddr = uAddr;
		}
		public String getuRegDate() {
			return uRegDate;
		}
		public void setuRegDate(String uRegDate) {
			this.uRegDate = uRegDate;
		}
		public String getuRemark() {
			return uRemark;
		}
		public void setuRemark(String uRemark) {
			this.uRemark = uRemark;
		}
		
}
