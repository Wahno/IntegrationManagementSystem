package com.mybean.mapper;

import java.util.List;


import com.mybean.data.Exchange;

public interface ExchangeMapper {
	public void add(Exchange exchange);		//��
	public void delete(int uId);		//ɾ
	public void update(Exchange exchange);	//��
	public Exchange get(int uId);			//��
	public List<Exchange> list();			//��ȡ����
}
