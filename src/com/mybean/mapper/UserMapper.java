package com.mybean.mapper;

import java.util.List;

import com.mybean.data.User;

public  interface UserMapper {
	public void add(User user);			//��
	public void delete(int Uid);		//ɾ
	public void update(User user);		//��
	public User get(int Uid);			//��
	public List<User> list();			//��ȡ����
}