package com.mybean.mapper;

import java.util.List;


import com.mybean.data.Operation;

public interface OperationMapper {
	public void add(Operation operation);			//��
	public void delete(int oTid);					//ɾ
	public void update(Operation operation);		//��
	public Operation get(int oTid);					//��
	public List<Operation> list();					//��ȡ����
}
