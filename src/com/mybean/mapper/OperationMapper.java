package com.mybean.mapper;

import java.util.List;


import com.mybean.data.Operation;

public interface OperationMapper {
	public void add(Operation operation);			//��
	public void delete(int OTid);					//ɾ
	public void update(Operation operation);		//��
	public Operation get(int OTid);					//��
	public List<Operation> list();					//��ȡ����
}
