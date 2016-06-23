package com.capsui.service;

import com.capsui.bean.SecUser;

/**
 * Created by tancw on 2016/6/23.
 */
public interface AuthService {
    boolean login(SecUser user);
}
