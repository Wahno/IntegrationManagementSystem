package com.mybean.service;

import java.util.List;

import com.mybean.data.Admin;

public interface AdminService {
	
	public void add(Admin admin);		//��
	public void delete(int aId);		//ɾ
	public void update(Admin admin);	//��
	public Admin get(int aId);			//��
	public List<Admin> list();			//��ȡ����
}
