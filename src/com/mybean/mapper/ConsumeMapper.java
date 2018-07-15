package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Consume;

public interface ConsumeMapper {
	public void add(Consume Consume);		//增
	public void delete(int Uid);		//删
	public void update(Consume Consume);	//改
	public Consume get(int Uid);			//查
	public List<Consume> list();			//获取所有
}
