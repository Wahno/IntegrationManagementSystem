package com.mybean.mapper;

import java.util.List;

import com.mybean.data.All;


public interface AllMapper {
	public void add(All All);		//��
	public void delete(int Uid);		//ɾ
	public void update(All All);	//��
	public All get(int Uid);			//��
	public List<All> list();			//��ȡ����
}
