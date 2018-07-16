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
		// TODO 自动生成的方法存根
		exchangemapper.add(exchange);
	}

	@Override
	public void delete(int Uid) {
		// TODO 自动生成的方法存根
		exchangemapper.delete(Uid);
	}

	@Override
	public void update(Exchange exchange) {
		// TODO 自动生成的方法存根
		exchangemapper.update(exchange);
	}

	@Override
	public Exchange get(int Uid) {
		// TODO 自动生成的方法存根
		return exchangemapper.get(Uid);
	}

	@Override
	public List<Exchange> list() {
		// TODO 自动生成的方法存根
		return exchangemapper.list();
	}

}
