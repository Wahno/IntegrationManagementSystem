package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Goods;

public interface GoodsMapper{
	public void add(Goods goods);			//��
	public void delete(int gId);		//ɾ
	public void update(Goods goods);		//��
	public Goods get(int gId);			//��
	public List<Goods> list();			//��ȡ����
}
