package com.mybean.mapper;

import java.util.List;


import com.mybean.data.Exchange;

public interface ExchangeMapper {
	public void add(Exchange exchange);		//��
	public void delete(int Uid);		//ɾ
	public void update(Exchange exchange);	//��
	public Exchange get(int Uid);			//��
	public List<Exchange> list();			//��ȡ����
}
