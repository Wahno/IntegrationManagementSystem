package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Staff;


public interface StaffMapper {
	public void add(Staff Staff);			//��
	public void delete(int Sid);		//ɾ
	public void update(Staff Staff);		//��
	public Staff get(int Sid);			//��
	public List<Staff> list();			//��ȡ����
}
