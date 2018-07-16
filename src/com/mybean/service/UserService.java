package com.mybean.service;

import java.util.List;

import com.mybean.data.User;

public interface UserService {
	public void add(User user);			//增
	public void delete(int Uid);		//删
	public void update(User user);		//改
	public User get(int Uid);			//查
	public List<User> list();			//获取所有
}
