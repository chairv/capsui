package com.capsui.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capsui.bean.JsonResult;
import com.capsui.bean.SecUser;
import com.capsui.bean.User;
import com.capsui.service.AuthService;
import com.capsui.service.UserService;

/**
 * Created by tancw on 2016/6/23.
 */
@Controller
public class AuthController extends BaseConroller{

	@Autowired
	private AuthService authService;

	@Autowired
	private UserService userService;

	@RequestMapping("login")
	@ResponseBody
	public JsonResult login(@ModelAttribute SecUser secUser) {
		if (authService.login(secUser)) {
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("id", request.getSession().getId());
            User user = userService.get(secUser.getId());
			result.put("user", user);
			result.put("role", "admin"); //暂未实现role TODO
			return new JsonResult(0, result);
		}
		return new JsonResult(40001, "校验失败");
	}
}
