package com.capsui.service.impl;

import org.springframework.stereotype.Service;

import com.capsui.bean.SecUser;
import com.capsui.service.AuthService;

/**
 * Created by tancw on 2016/6/23.
 */
@Service
public class AuthServiceImpl implements AuthService {

	@Override
	public boolean login(SecUser user) {
		return true; //TODO
	}
}
