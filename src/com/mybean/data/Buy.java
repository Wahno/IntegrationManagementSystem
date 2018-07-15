package com.mybean.data;

public class Buy {	
	private int 	BTid;				//购买类型ID
	private String  BTname;				//类型名称
	private int	 	BTCredit;			//对应1元的积分
	public int getBTid() {
		return BTid;
	}
	public void setBTid(int BTid) {
		this.BTid = BTid;
	}
	public String getBTname() {
		return BTname;
	}
	public void setBTname(String BTname) {
		this.BTname = BTname;
	}
	public int getBTCredit() {
		return BTCredit;
	}
	public void setBTCredit(int BTCredit) {
		this.BTCredit = BTCredit;
	}
}
