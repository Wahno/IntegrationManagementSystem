package com.mybean.data;

public class Operation {
	private int 	oTid;		//��������ID
	private String oTName;		//������������(���ѹ���/�����ֽ�/���ѽ���ֵ)
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
