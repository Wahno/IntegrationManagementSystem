package com.mybean.service;

import java.util.List;

import com.mybean.data.Exchange;

public interface ExchangeService {
	public void add(Exchange exchange);			//��
	public void delete(int uId);		//ɾ
	public void update(Exchange exchange);		//��
	public Exchange get(int uId);			//��
	public List<Exchange> list();			//��ȡ����
}
