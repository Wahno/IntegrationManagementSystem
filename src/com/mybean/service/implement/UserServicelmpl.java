package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.User;
import com.mybean.mapper.UserMapper;
import com.mybean.service.UserService;
@Service
public class UserServicelmpl implements UserService {
	@Autowired
	UserMapper usermapper;
	@Override
	public void add(User user) {
		// TODO 自动生成的方法存根
		usermapper.add(user);
	}

	@Override
	public void delete(int Uid) {
		// TODO 自动生成的方法存根
		usermapper.delete(Uid);
	}

	@Override
	public void update(User user) {
		// TODO 自动生成的方法存根
		usermapper.update(user);
	}

	@Override
	public User get(int Uid) {
		// TODO 自动生成的方法存根
		return usermapper.get(Uid);
	}

	@Override
	public List<User> list() {
		// TODO 自动生成的方法存根
		return usermapper.list();
	}

}
