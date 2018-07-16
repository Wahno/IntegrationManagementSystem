package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.Goods;
import com.mybean.mapper.GoodsMapper;
import com.mybean.service.GoodsService;
@Service

public class GoodsServiceImpl implements GoodsService{
	@Autowired
	GoodsMapper goodsmapper;
	@Override
	public void add(Goods goods) {
		// TODO �Զ����ɵķ������
		goodsmapper.add(goods);
	}

	@Override
	public void delete(int Gid) {
		// TODO �Զ����ɵķ������
		goodsmapper.delete(Gid);
	}

	@Override
	public void update(Goods goods) {
		// TODO �Զ����ɵķ������
		goodsmapper.update(goods);
	}

	@Override
	public Goods get(int Gid) {
		// TODO �Զ����ɵķ������
		return goodsmapper.get(Gid);
	}

	@Override
	public List<Goods> list() {
		// TODO �Զ����ɵķ������
		return goodsmapper.list();
	}
}
