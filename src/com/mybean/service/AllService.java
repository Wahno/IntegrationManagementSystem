package com.mybean.service;

import java.util.List;

import com.mybean.data.All;

public interface AllService {
	public void add(All all);			//��
	public void delete(int Uid);		//ɾ
	public void update(All all);		//��
	public All get(int Uid);			//��
	public List<All> list();			//��ȡ����
}
