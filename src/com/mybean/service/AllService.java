package com.mybean.service;

import java.util.List;

import com.mybean.data.All;

public interface AllService {
	public void add(All all);			//��
	public void delete(int uId);		//ɾ
	public void update(All all);		//��
	public All get(int uId);			//��
	public List<All> list();			//��ȡ����
}
