package com.mybean.service;

import java.util.List;

import com.mybean.data.All;

public interface AllService {
	public void add(All all);			//增
	public void delete(int Uid);		//删
	public void update(All all);		//改
	public All get(int Uid);			//查
	public List<All> list();			//获取所有
}
