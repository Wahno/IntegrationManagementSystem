package com.mybean.service;

import java.util.List;

import com.mybean.data.Consume;

public interface ConsumeService {
	public void add(Consume consume);			//��
	public void delete(int uId);		//ɾ
	public void update(Consume consume);		//��
	public Consume get(int uId);			//��
	public List<Consume> list();			//��ȡ����
}
