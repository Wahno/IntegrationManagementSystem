package com.mybean.mapper;

import java.util.List;

import com.mybean.data.Buy;

public interface BuyMapper {
	public void add(Buy Buy);		//��
	public void delete(int BTid);		//ɾ
	public void update(Buy Buy);	//��
	public Buy get(int BTid);			//��
	public List<Buy> list();			//��ȡ����
}
