package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.Staff;
import com.mybean.mapper.StaffMapper;
import com.mybean.service.StaffService;
@Service

public class StaffServiceImpl implements StaffService{
	@Autowired
	StaffMapper staffmapper;
	@Override
	public void add(Staff staff) {
		// TODO �Զ����ɵķ������
		staffmapper.add(staff);
	}

	@Override
	public void delete(int sId) {
		// TODO �Զ����ɵķ������
		staffmapper.delete(sId);
	}

	@Override
	public void update(Staff staff) {
		// TODO �Զ����ɵķ������
		staffmapper.update(staff);
	}

	@Override
	public Staff get(int sId) {
		// TODO �Զ����ɵķ������
		return staffmapper.get(sId);
	}

	@Override
	public List<Staff> list() {
		// TODO �Զ����ɵķ������
		return staffmapper.list();
	}
}
