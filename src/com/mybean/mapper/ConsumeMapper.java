package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Consume;

public interface ConsumeMapper {
	public void add(Consume consume);		//��
	public void delete(int uId);		//ɾ
	public void update(Consume consume);	//��
	public List<Consume> get(int uId);			//��
	public List<Consume> list();			//��ȡ����
}
