package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Goods;

public interface GoodsMapper{
	public void add(Goods Goods);			//��
	public void delete(int Gid);		//ɾ
	public void update(Goods Goods);		//��
	public Goods get(int Gid);			//��
	public List<Goods> list();			//��ȡ����
}
