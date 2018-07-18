package com.mybean.mapper;

import java.util.List;


import com.mybean.data.Operation;

public interface OperationMapper {
	public void add(Operation operation);			//增
	public void delete(int oTid);					//删
	public void update(Operation operation);		//改
	public Operation get(int oTid);					//查
	public List<Operation> list();					//获取所有
}
