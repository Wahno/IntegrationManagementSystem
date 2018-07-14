package com.mybean.mapper;

import java.util.List;

import com.mybean.data.user;

public  interface userMapper {
	public void add(user user);			//增
	public void delete(int Uid);		//删
	public void update(user user);		//改
	public user get(int Uid);			//查
	public List<user> list();			//获取所有
}
