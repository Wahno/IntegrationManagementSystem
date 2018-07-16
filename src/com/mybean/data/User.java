package com.mybean.data;

public class User{
	private int Uid;		//客户ID
	private String Uname;	//客户姓名
	private int	Usex;	    //客户性别,0->男，1->女
	private String Ubirth;	//客户生日
	private String Utel;	//客户电话
	private String UphoNum;	//客户手机
	private String Uaddr;	//客户地址
	private String UregDate;//客户注册日期
	private String Uremark;	//客户权限
		public int getUid() {
			return Uid;
		}
		public void setUid(int Uid) {
			this.Uid = Uid;
		}
		public String getUname() {
			return Uname;
		}
		public void setUname(String Uname) {
			this.Uname = Uname;
		}
		public int getUsex() {
			return Usex;
		}
		public void setUsex(int Usex) {
			this.Usex = Usex;
		}
		
		public String getUbirth() {
			return Ubirth;
		}
		public void setUbirth(String Ubirth) {
			this.Ubirth = Ubirth;
		}
		public String getUtel() {
			return Utel;
		}
		public void setUtel(String Utel) {
			this.Utel = Utel;
		}
		public String getUphoNum() {
			return UphoNum;
		}
		public void setUphoNum(String UphoNum) {
			this.UphoNum = UphoNum;
		}
		public String getUaddr() {
			return Uaddr;
		}
		public void setUaddr(String Uaddr) {
			this.Uaddr = Uaddr;
		}
		public String getUregDate() {
			return UregDate;
		}
		public void setUregDate(String UregDate) {
			this.UregDate = UregDate;
		}
		public String getUremark() {
			return Uremark;
		}
		public void setUremark(String Uremark) {
			this.Uremark = Uremark;
		}
		
}
