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
		// TODO �Զ����ɵķ������
		buymapper.add(buy);
	}

	@Override
	public void delete(int bTid) {
		// TODO �Զ����ɵķ������
		buymapper.delete(bTid);
	}

	@Override
	public void update(Buy buy) {
		// TODO �Զ����ɵķ������
		buymapper.update(buy);
	}

	@Override
	public Buy get(int bTid) {
		// TODO �Զ����ɵķ������
		return buymapper.get(bTid);
	}

	@Override
	public List<Buy> list() {
		// TODO �Զ����ɵķ������
		return buymapper.list();
	}

}
