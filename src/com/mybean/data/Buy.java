package com.mybean.data;

public class Buy {	
	private int 	bTid;				//购买类型ID
	private String  bTname;				//类型名称
	private int	 	bTCredit;			//对应1元的积分
	public int getbTid() {
		return bTid;
	}
	public void setbTid(int bTid) {
		this.bTid = bTid;
	}
	public String getbTname() {
		return bTname;
	}
	public void setbTname(String bTname) {
		this.bTname = bTname;
	}
	public int getbTCredit() {
		return bTCredit;
	}
	public void setbTCredit(int bTCredit) {
		this.bTCredit = bTCredit;
	}
}
