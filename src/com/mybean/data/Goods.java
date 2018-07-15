package com.mybean.data;

public class Goods{
	private int Gid;			//商品ID
	private String Gname;		//商品名称
	private int	  Gnum;			//商品数量
	private float  Gcost;		//商品成本
	private float  Gprice;		//商品售价
	private int Gexchange;		//商品兑换所需积分
	private String Gremark;		//商品备注

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
