package com.mybean.data;

public class Staff{
	private int Sid;		//员工ID
	private String Sname;	//员工姓名
	private String Smark;	//员工助记符
	private int Ssex;		//员工性别,0->男，1->女
	private String Stel;	//员工电话
	private String SphoNum;	//员工手机
	private String Saddr;	//员工地址
	private String SregDate;//员工注册日期
	private String Sremark;	//员工备注
	public int getSid() {
		return Sid;
	}
	public void setSid(int Sid) {
		this.Sid = Sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String Sname) {
		this.Sname = Sname;
	}
	public String getSmark() {
		return Smark;
	}
	public void setSmark(String Smark) {
		this.Smark = Smark;
	}
	public int getSsex() {
		return Ssex;
	}
	public void setSsex(int Ssex) {
		this.Ssex = Ssex;
	}
	
	
	public String getStel() {
		return Stel;
	}
	public void setStel(String Stel) {
		this.Stel = Stel;
	}
	public String getSphoNum() {
		return SphoNum;
	}
	public void setSphoNum(String SphoNum) {
		this.SphoNum = SphoNum;
	}
	public String getSaddr() {
		return Saddr;
	}
	public void setSaddr(String Saddr) {
		this.Saddr = Saddr;
	}
	public String getSregDate() {
		return SregDate;
	}
	public void setSregDate(String SregDate) {
		this.SregDate = SregDate;
	}
	public String getSremark() {
		return Sremark;
	}
	public void setSremark(String Sremark) {
		this.Sremark = Sremark;
	}
	
}
