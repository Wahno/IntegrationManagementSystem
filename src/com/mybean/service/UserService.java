package com.mybean.service;

import java.util.List;

import com.mybean.data.User;

public interface UserService {
	public void add(User user);			//��
	public void delete(int uId);		//ɾ
	public void update(User user);		//��
	public User get(int uId);			//��
	public List<User> list();			//��ȡ����
}
