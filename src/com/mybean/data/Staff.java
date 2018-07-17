package com.mybean.data;

public class Staff{
	private int sId;		//员工ID
	private String sName;	//员工姓名
	private String sMark;	//员工助记符
	private int sSex;		//员工性别,0->男，1->女
	private String sTel;	//员工电话
	private String sPhoNum;	//员工手机
	private String sAddr;	//员工地址
	private String sRegDate;//员工注册日期
	private String sRemark;	//员工备注
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsMark() {
		return sMark;
	}
	public void setsMark(String sMark) {
		this.sMark = sMark;
	}
	public int getsSex() {
		return sSex;
	}
	public void setsSex(int sSex) {
		this.sSex = sSex;
	}
	
	
	public String getsTel() {
		return sTel;
	}
	public void setsTel(String sTel) {
		this.sTel = sTel;
	}
	public String getsPhoNum() {
		return sPhoNum;
	}
	public void setsPhoNum(String sPhoNum) {
		this.sPhoNum = sPhoNum;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	public String getsRegDate() {
		return sRegDate;
	}
	public void setsRegDate(String sRegDate) {
		this.sRegDate = sRegDate;
	}
	public String getsRemark() {
		return sRemark;
	}
	public void setsRemark(String sRemark) {
		this.sRemark = sRemark;
	}
	
}
