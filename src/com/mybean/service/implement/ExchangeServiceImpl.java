package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.Exchange;
import com.mybean.mapper.ExchangeMapper;
import com.mybean.service.ExchangeService;
@Service
public class ExchangeServiceImpl implements ExchangeService{
	@Autowired
	ExchangeMapper exchangemapper;
	@Override
	public void add(Exchange exchange) {
		// TODO �Զ����ɵķ������
		exchangemapper.add(exchange);
	}

	@Override
	public void delete(int uId) {
		// TODO �Զ����ɵķ������
		exchangemapper.delete(uId);
	}

	@Override
	public void update(Exchange exchange) {
		// TODO �Զ����ɵķ������
		exchangemapper.update(exchange);
	}

	@Override
	public Exchange get(int uId) {
		// TODO �Զ����ɵķ������
		return exchangemapper.get(uId);
	}

	@Override
	public List<Exchange> list() {
		// TODO �Զ����ɵķ������
		return exchangemapper.list();
	}

}
