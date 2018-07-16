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
	StaffMapper staffMapper;
	@Override
	public void add(Staff staff) {
		// TODO �Զ����ɵķ������
		staffMapper.add(staff);
	}

	@Override
	public void delete(int Sid) {
		// TODO �Զ����ɵķ������
		staffMapper.delete(Sid);
	}

	@Override
	public void update(Staff staff) {
		// TODO �Զ����ɵķ������
		staffMapper.update(staff);
	}

	@Override
	public Staff get(int Sid) {
		// TODO �Զ����ɵķ������
		return staffMapper.get(Sid);
	}

	@Override
	public List<Staff> list() {
		// TODO �Զ����ɵķ������
		return staffMapper.list();
	}
}
