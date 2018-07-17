package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Staff;


public interface StaffMapper {
	public void add(Staff staff);			//��
	public void delete(int sId);		//ɾ
	public void update(Staff staff);		//��
	public Staff get(int sId);			//��
	public List<Staff> list();			//��ȡ����
}
