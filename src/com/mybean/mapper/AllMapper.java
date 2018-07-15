package com.mybean.mapper;

import java.util.List;

import com.mybean.data.All;


public interface AllMapper {
	public void add(All All);		//增
	public void delete(int Uid);		//删
	public void update(All All);	//改
	public All get(int Uid);			//查
	public List<All> list();			//获取所有
}
