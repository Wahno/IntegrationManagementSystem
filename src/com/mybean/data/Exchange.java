package com.mybean.data;

public class Exchange {
	private int uId;			//�û�ID
	private String exDate;		//�һ�����
	private String exTime;		//�һ�ʱ��
	private int gId;			//��ƷID
	private int exNum;			//�һ�����
	private int cRedits;		//��ǰ��û���	
	private int sId;			//Ա��ID
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
