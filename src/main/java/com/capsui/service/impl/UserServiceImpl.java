package com.capsui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsui.bean.User;
import com.capsui.dao.mapper.UserMapper;
import com.capsui.service.UserService;

/**
 * Created by tancw on 2016/6/23.
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User get(long id) {
		return userMapper.get(id);
	}
}
