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
		// TODO 自动生成的方法存根
		consumemapper.add(consume);
	}

	@Override
	public void delete(int Uid) {
		// TODO 自动生成的方法存根
		consumemapper.delete(Uid);
	}

	@Override
	public void update(Consume consume) {
		// TODO 自动生成的方法存根
		consumemapper.update(consume);
	}

	@Override
	public Consume get(int Uid) {
		// TODO 自动生成的方法存根
		return consumemapper.get(Uid);
	}

	@Override
	public List<Consume> list() {
		// TODO 自动生成的方法存根
		return consumemapper.list();
	}

}
