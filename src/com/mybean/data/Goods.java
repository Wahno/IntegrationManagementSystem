package com.mybean.data;

public class Goods{
	private int 	gId;		//商品ID
	private String gName;		//商品名称
	private int	  gNum;			//商品数量
	private int  gCost;			//商品成本
	private int  gPrice;		//商品售价
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
	public int getgCost() {
		return gCost;
	}
	public void setgCost(int gCost) {
		this.gCost = gCost;
	}
	public int getgPrice() {
		return gPrice;
	}
	public void setgPrice(int gPrice) {
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
