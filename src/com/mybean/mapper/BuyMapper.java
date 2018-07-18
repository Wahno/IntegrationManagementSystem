package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Buy;

public interface BuyMapper {
	public void add(Buy buy);		//增
	public void delete(int bTid);		//删
	public void update(Buy buy);	//改
	public Buy get(int bTid);			//查
	public List<Buy> list();			//获取所有
}
