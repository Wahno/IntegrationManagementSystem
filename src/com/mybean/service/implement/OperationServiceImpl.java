package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.Operation;
import com.mybean.mapper.OperationMapper;
import com.mybean.service.OperationService;
@Service
public class OperationServiceImpl implements OperationService{
	@Autowired
	OperationMapper operationMapper;
	@Override
	public void add(Operation operation) {
		// TODO �Զ����ɵķ������
		operationMapper.add(operation);
	}

	@Override
	public void delete(int OTid) {
		// TODO �Զ����ɵķ������
		operationMapper.delete(OTid);
	}

	@Override
	public void update(Operation operation) {
		// TODO �Զ����ɵķ������
		operationMapper.update(operation);
	}

	@Override
	public Operation get(int OTid) {
		// TODO �Զ����ɵķ������
		return operationMapper.get(OTid);
	}

	@Override
	public List<Operation> list() {
		// TODO �Զ����ɵķ������
		return operationMapper.list();
	}

}
