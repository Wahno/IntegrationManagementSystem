package com.mybean.service;

import java.util.List;

import com.mybean.data.Goods;

public interface GoodsService {
	public void add(Goods goods);		//��
	public void delete(int Gid);		//ɾ
	public void update(Goods goods);	//��
	public Goods get(int Gid);			//��
	public List<Goods> list();			//��ȡ����
}
