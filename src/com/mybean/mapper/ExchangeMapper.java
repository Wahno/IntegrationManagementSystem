package com.mybean.mapper;

import java.util.List;


import com.mybean.data.Exchange;

public interface ExchangeMapper {
	public void add(Exchange exchange);		//增
	public void delete(int uId);		//删
	public void update(Exchange exchange);	//改
	public Exchange get(int uId);			//查
	public List<Exchange> list();			//获取所有
}
