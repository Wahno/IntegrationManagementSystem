package com.mybean.data;

public class Goods{
	private int 	gId;		//商品ID
	private String gName;		//商品名称
	private int	  gNum;			//商品数量
	private float  gCost;		//商品成本
	private float  gPrice;		//商品售价
	private int gExchange;		//商品兑换所需积分
	private String gRemark;		//商品备注

	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public int getgNum() {
		return gNum;
	}
	public void setgNum(int gNum) {
		this.gNum = gNum;
	}
	public float getgCost() {
		return gCost;
	}
	public void setgCost(float gCost) {
		this.gCost = gCost;
	}
	
	
	public float getgPrice() {
		return gPrice;
	}
	public void setgPrice(float gPrice) {
		this.gPrice = gPrice;
	}
	public int getgExchange() {
		return gExchange;
	}
	public void setgExchange(int gExchange) {
		this.gExchange = gExchange;
	}
	public String getgRemark() {
		return gRemark;
	}
	public void setgRemark(String gRemark) {
		this.gRemark = gRemark;
	}
	
}
