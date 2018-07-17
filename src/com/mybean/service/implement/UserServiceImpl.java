package com.mybean.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybean.data.User;
import com.mybean.mapper.UserMapper;
import com.mybean.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper usermapper;
	@Override
	public void add(User user) {
		// TODO 自动生成的方法存根
		usermapper.add(user);
	}

	@Override
	public void delete(int uId) {
		// TODO 自动生成的方法存根
		usermapper.delete(uId);
	}

	@Override
	public void update(User user) {
		// TODO 自动生成的方法存根
		usermapper.update(user);
	}

	@Override
	public User get(int uId) {
		// TODO 自动生成的方法存根
		return usermapper.get(uId);
	}

	@Override
	public List<User> list() {
		// TODO 自动生成的方法存根
		return usermapper.list();
	}

}
