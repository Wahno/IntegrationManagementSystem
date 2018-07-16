package com.mybean.service;

import java.util.List;

import com.mybean.data.Goods;

public interface GoodsService {
	public void add(Goods goods);		//增
	public void delete(int Gid);		//删
	public void update(Goods goods);	//改
	public Goods get(int Gid);			//查
	public List<Goods> list();			//获取所有
}
