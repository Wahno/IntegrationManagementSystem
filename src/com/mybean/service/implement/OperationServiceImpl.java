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
	OperationMapper operationmapper;
	@Override
	public void add(Operation operation) {
		// TODO 自动生成的方法存根
		operationmapper.add(operation);
	}

	@Override
	public void delete(int oTid) {
		// TODO 自动生成的方法存根
		operationmapper.delete(oTid);
	}

	@Override
	public void update(Operation operation) {
		// TODO 自动生成的方法存根
		operationmapper.update(operation);
	}

	@Override
	public Operation get(int oTid) {
		// TODO 自动生成的方法存根
		return operationmapper.get(oTid);
	}

	@Override
	public List<Operation> list() {
		// TODO 自动生成的方法存根
		return operationmapper.list();
	}

}
