package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.Consume;
import com.mybean.mapper.ConsumeMapper;
import com.mybean.service.ConsumeService;
@Service
public class ConsumeServiceImpl implements ConsumeService{
	@Autowired
	ConsumeMapper consumemapper;
	@Override
	public void add(Consume consume) {
		// TODO �Զ����ɵķ������
		consumemapper.add(consume);
	}

	@Override
	public void delete(int Uid) {
		// TODO �Զ����ɵķ������
		consumemapper.delete(Uid);
	}

	@Override
	public void update(Consume consume) {
		// TODO �Զ����ɵķ������
		consumemapper.update(consume);
	}

	@Override
	public Consume get(int Uid) {
		// TODO �Զ����ɵķ������
		return consumemapper.get(Uid);
	}

	@Override
	public List<Consume> list() {
		// TODO �Զ����ɵķ������
		return consumemapper.list();
	}

}
