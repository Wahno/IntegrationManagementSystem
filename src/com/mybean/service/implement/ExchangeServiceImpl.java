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
	public void delete(int Uid) {
		// TODO �Զ����ɵķ������
		exchangemapper.delete(Uid);
	}

	@Override
	public void update(Exchange exchange) {
		// TODO �Զ����ɵķ������
		exchangemapper.update(exchange);
	}

	@Override
	public Exchange get(int Uid) {
		// TODO �Զ����ɵķ������
		return exchangemapper.get(Uid);
	}

	@Override
	public List<Exchange> list() {
		// TODO �Զ����ɵķ������
		return exchangemapper.list();
	}

}
