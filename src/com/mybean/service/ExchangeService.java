package com.mybean.service;

import java.util.List;

import com.mybean.data.Exchange;

public interface ExchangeService {
	public void add(Exchange exchange);			//��
	public void delete(int Uid);		//ɾ
	public void update(Exchange exchange);		//��
	public Exchange get(int Uid);			//��
	public List<Exchange> list();			//��ȡ����
}
