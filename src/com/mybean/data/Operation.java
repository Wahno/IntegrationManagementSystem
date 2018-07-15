package com.mybean.data;

public class Operation {
	private int 	OTid;		//操作类型ID
	private String OTName;		//操作类型名称(消费购买/返还现金/消费金额充值)
	public int getOTid() {
		return OTid;
	}
	public void setOTid(int OTid) {
		this.OTid = OTid;
	}
	public String getOTName() {
		return OTName;
	}
	public void setOTName(String OTName) {
		this.OTName = OTName;
	}
}
