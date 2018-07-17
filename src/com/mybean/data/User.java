package com.mybean.data;

public class User{
	private int uId;		//客户ID
	private String uName;	//客户姓名
	private int	uSex;	    //客户性别,0->男，1->女
	private String uBirth;	//客户生日
	private String uTel;	//客户电话
	private String uPhoNum;	//客户手机
	private String uAddr;	//客户地址
	private String uRegDate;//客户注册日期
	private String uRemark;	//客户权限
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
