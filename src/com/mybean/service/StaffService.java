package com.mybean.service;

import java.util.List;

import com.mybean.data.Staff;

public interface StaffService {
	public void add(Staff staff);		//��
	public void delete(int Sid);		//ɾ
	public void update(Staff staff);	//��
	public Staff get(int Sid);			//��
	public List<Staff> list();			//��ȡ����
}
