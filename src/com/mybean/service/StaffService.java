package com.mybean.service;

import java.util.List;

import com.mybean.data.Staff;

public interface StaffService {
	public void add(Staff staff);		//增
	public void delete(int Sid);		//删
	public void update(Staff staff);	//改
	public Staff get(int Sid);			//查
	public List<Staff> list();			//获取所有
}
