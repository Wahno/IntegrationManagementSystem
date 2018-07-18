package com.mybean.data;

public class Exchange {
	private int uId;			//用户ID
	private String exDate;		//兑换日期
	private String exTime;		//兑换时间
	private int gId;			//商品ID
	private int exNum;			//兑换数量
	private int cRedits;		//当前获得积分	
	private int sId;			//员工ID
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getexDate() {
		return exDate;
	}
	public void setexDate(String exDate) {
		this.exDate = exDate;
	}
	public String getexTime() {
		return exTime;
	}
	public void setexTime(String exTime) {
		this.exTime = exTime;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public int getexNum() {
		return exNum;
	}
	public void setexNum(int exNum) {
		this.exNum = exNum;
	}
	public int getcRedits() {
		return cRedits;
	}
	public void setcRedits(int cRedits) {
		this.cRedits = cRedits;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}


}
