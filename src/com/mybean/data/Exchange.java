package com.mybean.data;

public class Exchange {
	private int Uid;			//用户ID
	private String Exdate;		//兑换日期
	private String Extime;		//兑换时间
	private int Gid;			//商品ID
	private int ExNum;			//兑换数量
	private int Credits;		//当前获得积分	
	private int Sid;			//员工ID
	public int getUid() {
		return Uid;
	}
	public void setUid(int Uid) {
		this.Uid = Uid;
	}
	public String getExdate() {
		return Exdate;
	}
	public void setExdate(String Exdate) {
		this.Exdate = Exdate;
	}
	public String getExtime() {
		return Extime;
	}
	public void setExtime(String Extime) {
		this.Extime = Extime;
	}
	public int getGid() {
		return Gid;
	}
	public void setGid(int Gid) {
		this.Gid = Gid;
	}
	public int getExNum() {
		return ExNum;
	}
	public void setExNum(int ExNum) {
		this.ExNum = ExNum;
	}
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int Credits) {
		this.Credits = Credits;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int Sid) {
		this.Sid = Sid;
	}


}
