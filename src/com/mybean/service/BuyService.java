package com.mybean.service;

import java.util.List;

import com.mybean.data.Buy;

public interface BuyService {
	public void add(Buy buy);			//增
	public void delete(int BTid);		//删
	public void update(Buy buy);		//改
	public Buy get(int BTid);			//查
	public List<Buy> list();			//获取所有
}
