package com.mybean.data;

public class Goods{
	private int Gid;			//��ƷID
	private String Gname;		//��Ʒ����
	private int	  Gnum;			//��Ʒ����
	private float  Gcost;		//��Ʒ�ɱ�
	private float  Gprice;		//��Ʒ�ۼ�
	private int Gexchange;		//��Ʒ�һ��������
	private String Gremark;		//��Ʒ��ע

	public int getGid() {
		return Gid;
	}
	public void setGid(int Gid) {
		this.Gid = Gid;
	}
	public String getGname() {
		return Gname;
	}
	public void setGname(String Gname) {
		this.Gname = Gname;
	}
	public int getGnum() {
		return Gnum;
	}
	public void setGnum(int Gnum) {
		this.Gnum = Gnum;
	}
	public float getGcost() {
		return Gcost;
	}
	public void setGcost(float Gcost) {
		this.Gcost = Gcost;
	}
	
	
	public float getGprice() {
		return Gprice;
	}
	public void setGprice(float Gprice) {
		this.Gprice = Gprice;
	}
	public int getGexchange() {
		return Gexchange;
	}
	public void setGexchange(int Gexchange) {
		this.Gexchange = Gexchange;
	}
	public String getGremark() {
		return Gremark;
	}
	public void setGremark(String Gremark) {
		this.Gremark = Gremark;
	}
	
}
