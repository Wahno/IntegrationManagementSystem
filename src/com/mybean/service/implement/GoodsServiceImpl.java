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
		// TODO 自动生成的方法存根
		goodsmapper.add(goods);
	}

	@Override
	public void delete(int Gid) {
		// TODO 自动生成的方法存根
		goodsmapper.delete(Gid);
	}

	@Override
	public void update(Goods goods) {
		// TODO 自动生成的方法存根
		goodsmapper.update(goods);
	}

	@Override
	public Goods get(int Gid) {
		// TODO 自动生成的方法存根
		return goodsmapper.get(Gid);
	}

	@Override
	public List<Goods> list() {
		// TODO 自动生成的方法存根
		return goodsmapper.list();
	}
}
