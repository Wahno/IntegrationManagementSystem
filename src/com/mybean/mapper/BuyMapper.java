package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Buy;

public interface BuyMapper {
	public void add(Buy buy);		//��
	public void delete(int bTid);		//ɾ
	public void update(Buy buy);	//��
	public Buy get(int bTid);			//��
	public List<Buy> list();			//��ȡ����
}
