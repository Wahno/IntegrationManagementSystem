package com.mybean.data;

public class Consume {
	private int Uid;			//用户ID
	private String Cdate;		//消费日期
	private String Ctime;		//消费时间
	private int Gid;			//商品ID
	private int Cnum;			//消费数量，用于统计成本和盈利
	private int OTid;			//操作类型ID
	private int BTid;			//购买类型ID
	private int Credits;		//获得积分
	private int Cremark;		//消费备注
	private int Sid;			//员工ID
	public int getUid() {
		return Uid;
	}
	public void setUid(int Uid) {
		this.Uid = Uid;
	}
	public String getCdate() {
		return Cdate;
	}
	public void setCdate(String Cdate) {
		this.Cdate = Cdate;
	}
	public String getCtime() {
		return Ctime;
	}
	public void setCtime(String Ctime) {
		this.Ctime = Ctime;
	}
	public int getGid() {
		return Gid;
	}
	public void setGid(int Gid) {
		this.Gid = Gid;
	}
	public int getCnum() {
		return Cnum;
	}
	public void setCnum(int Cnum) {
		this.Cnum = Cnum;
	}
	public int getOTid() {
		return OTid;
	}
	public void setOTid(int OTid) {
		this.OTid = OTid;
	}
	public int getBTid() {
		return BTid;
	}
	public void setBTid(int BTid) {
		this.BTid = BTid;
	}
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int Credits) {
		this.Credits = Credits;
	}
	public int getCremark() {
		return Cremark;
	}
	public void setCremark(int Cremark) {
		this.Cremark = Cremark;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int Sid) {
		this.Sid = Sid;
	}
	
}
