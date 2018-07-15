package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Buy;

public interface BuyMapper {
	public void add(Buy Buy);		//增
	public void delete(int BTid);		//删
	public void update(Buy Buy);	//改
	public Buy get(int BTid);			//查
	public List<Buy> list();			//获取所有
}
