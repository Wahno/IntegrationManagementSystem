package com.mybean.mapper;

import java.util.List;

import com.mybean.data.user;

public  interface userMapper {
	public void add(user user);			//��
	public void delete(int Uid);		//ɾ
	public void update(user user);		//��
	public user get(int Uid);			//��
	public List<user> list();			//��ȡ����
}
