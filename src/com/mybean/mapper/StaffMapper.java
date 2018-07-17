package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Staff;


public interface StaffMapper {
	public void add(Staff staff);			//增
	public void delete(int sId);		//删
	public void update(Staff staff);		//改
	public Staff get(int sId);			//查
	public List<Staff> list();			//获取所有
}
