package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Staff;


public interface StaffMapper {
	public void add(Staff Staff);			//增
	public void delete(int Sid);		//删
	public void update(Staff Staff);		//改
	public Staff get(int Sid);			//查
	public List<Staff> list();			//获取所有
}
