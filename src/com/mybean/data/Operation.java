package com.mybean.data;

public class Operation {
	private int 	oTid;		//操作类型ID
	private String oTName;		//操作类型名称(消费购买/返还现金/消费金额充值)
	public int getoTid() {
		return oTid;
	}
	public void setoTid(int oTid) {
		this.oTid = oTid;
	}
	public String getoTName() {
		return oTName;
	}
	public void setoTName(String oTName) {
		this.oTName = oTName;
	}
}
