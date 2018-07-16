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
		// TODO 自动生成的方法存根
		staffmapper.add(staff);
	}

	@Override
	public void delete(int Sid) {
		// TODO 自动生成的方法存根
		staffmapper.delete(Sid);
	}

	@Override
	public void update(Staff staff) {
		// TODO 自动生成的方法存根
		staffmapper.update(staff);
	}

	@Override
	public Staff get(int Sid) {
		// TODO 自动生成的方法存根
		return staffmapper.get(Sid);
	}

	@Override
	public List<Staff> list() {
		// TODO 自动生成的方法存根
		return staffmapper.list();
	}
}
