package com.mybean.mapper;

import java.util.List;


import com.mybean.data.Exchange;

public interface ExchangeMapper {
	public void add(Exchange Exchange);		//��
	public void delete(int Uid);		//ɾ
	public void update(Exchange Exchange);	//��
	public Exchange get(int Uid);			//��
	public List<Exchange> list();			//��ȡ����
}
