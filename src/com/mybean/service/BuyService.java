package com.mybean.service;

import java.util.List;

import com.mybean.data.Buy;

public interface BuyService {
	public void add(Buy buy);			//��
	public void delete(int BTid);		//ɾ
	public void update(Buy buy);		//��
	public Buy get(int BTid);			//��
	public List<Buy> list();			//��ȡ����
}
