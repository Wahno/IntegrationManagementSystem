package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Admin;

public interface AdminMapper {
	public void add(Admin admin);		//��
	public void delete(int id);			//ɾ
	public void update(Admin admin);	//��
	public Admin get(int id);			//��
	public List<Admin> list();			//��ȡ����
}
