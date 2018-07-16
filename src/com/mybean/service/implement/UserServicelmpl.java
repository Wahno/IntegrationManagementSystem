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
		// TODO �Զ����ɵķ������
		usermapper.add(user);
	}

	@Override
	public void delete(int Uid) {
		// TODO �Զ����ɵķ������
		usermapper.delete(Uid);
	}

	@Override
	public void update(User user) {
		// TODO �Զ����ɵķ������
		usermapper.update(user);
	}

	@Override
	public User get(int Uid) {
		// TODO �Զ����ɵķ������
		return usermapper.get(Uid);
	}

	@Override
	public List<User> list() {
		// TODO �Զ����ɵķ������
		return usermapper.list();
	}

}
