package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.Buy;
import com.mybean.mapper.BuyMapper;
import com.mybean.service.BuyService;
@Service
public class BuyServiceImpl implements BuyService{
	@Autowired
	BuyMapper buymapper;
	@Override
	public void add(Buy buy) {
		// TODO 自动生成的方法存根
		buymapper.add(buy);
	}

	@Override
	public void delete(int bTid) {
		// TODO 自动生成的方法存根
		buymapper.delete(bTid);
	}

	@Override
	public void update(Buy buy) {
		// TODO 自动生成的方法存根
		buymapper.update(buy);
	}

	@Override
	public Buy get(int bTid) {
		// TODO 自动生成的方法存根
		return buymapper.get(bTid);
	}

	@Override
	public List<Buy> list() {
		// TODO 自动生成的方法存根
		return buymapper.list();
	}

}
