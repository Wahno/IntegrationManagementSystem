package com.mybean.mapper;

import java.util.List;

import com.mybean.data.All;


public interface AllMapper {
	public void add(All all);		//��
	public void delete(int uId);		//ɾ
	public void update(All all);	//��
	public All get(int uId);			//��
	public List<All> list();			//��ȡ����
}
