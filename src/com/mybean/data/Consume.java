package com.mybean.data;

public class Consume {
	private int uId;			//用户ID
	private String cDate;		//消费日期
	private String cTime;		//消费时间
	private int gId;			//商品ID
	private int cNum;			//消费数量，用于统计成本和盈利
	private int oTid;			//操作类型ID
	private int bTid;			//购买类型ID
	private int cRedits;		//获得积分
	private String cRemark;		//消费备注
	private int sId;			//员工ID
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getcDate() {
		return cDate;
	}
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}
	public String getcTime() {
		return cTime;
	}
	public void setcTime(String cTime) {
		this.cTime = cTime;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}
	public int getoTid() {
		return oTid;
	}
	public void setoTid(int oTid) {
		this.oTid = oTid;
	}
	public int getbTid() {
		return bTid;
	}
	public void setbTid(int bTid) {
		this.bTid = bTid;
	}
	public int getcRedits() {
		return cRedits;
	}
	public void setcRedits(int cRedits) {
		this.cRedits = cRedits;
	}
	public String getcRemark() {
		return cRemark;
	}
	public void setcRemark(String cRemark) {
		this.cRemark = cRemark;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	
}
