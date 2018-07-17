package com.mybean.service;

import java.util.List;

import com.mybean.data.Operation;

public interface OperationService {
	public void add(Operation operation);		//��
	public void delete(int oTid);		//ɾ
	public void update(Operation operation);	//��
	public Operation get(int oTid);			//��
	public List<Operation> list();			//��ȡ����
}
