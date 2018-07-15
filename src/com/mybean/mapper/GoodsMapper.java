package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Goods;

public interface GoodsMapper{
	public void add(Goods Goods);			//增
	public void delete(int Gid);		//删
	public void update(Goods Goods);		//改
	public Goods get(int Gid);			//查
	public List<Goods> list();			//获取所有
}
