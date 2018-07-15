package com.mybean.mapper;

import java.util.List;


import com.mybean.data.Exchange;

public interface ExchangeMapper {
	public void add(Exchange Exchange);		//增
	public void delete(int Uid);		//删
	public void update(Exchange Exchange);	//改
	public Exchange get(int Uid);			//查
	public List<Exchange> list();			//获取所有
}
