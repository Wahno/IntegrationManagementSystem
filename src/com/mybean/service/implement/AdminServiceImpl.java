package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.Admin;
import com.mybean.mapper.AdminMapper;
import com.mybean.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminMapper adminmapper;
	public void add(Admin admin) {
		adminmapper.add(admin);
	}
	public void delete(int aId) {
		adminmapper.delete(aId);
	}
	public void update(Admin admin) {
		adminmapper.update(admin);
	}
	public Admin get(int aId) {
		return adminmapper.get(aId);
	}
	public List<Admin> list() {
		return adminmapper.list();
	}

}
