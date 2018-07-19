package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Consume;

public interface ConsumeMapper {
	public void add(Consume consume);		//增
	public void delete(int uId);		//删
	public void update(Consume consume);	//改
	public List<Consume> get(int uId);			//查
	public List<Consume> list();			//获取所有
}
