package com.mybean.service;

import java.util.List;

import com.mybean.data.Consume;

public interface ConsumeService {
	public void add(Consume consume);			//��
	public void delete(int Uid);		//ɾ
	public void update(Consume consume);		//��
	public Consume get(int Uid);			//��
	public List<Consume> list();			//��ȡ����
}
