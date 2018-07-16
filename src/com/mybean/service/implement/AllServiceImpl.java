package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.All;
import com.mybean.mapper.AllMapper;
import com.mybean.service.AllService;
@Service

public class AllServiceImpl implements AllService{
	@Autowired
	AllMapper allmapper;
	@Override
	public void add(All all) {
		// TODO �Զ����ɵķ������
		allmapper.add(all);
	}

	@Override
	public void delete(int Uid) {
		// TODO �Զ����ɵķ������
		allmapper.delete(Uid);
	}

	@Override
	public void update(All all) {
		// TODO �Զ����ɵķ������
		allmapper.update(all);
	}

	@Override
	public All get(int Uid) {
		// TODO �Զ����ɵķ������
		return allmapper.get(Uid);
	}

	@Override
	public List<All> list() {
		// TODO �Զ����ɵķ������
		return allmapper.list();
	}

}
