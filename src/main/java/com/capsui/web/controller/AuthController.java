package com.capsui.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capsui.bean.JsonResult;
import com.capsui.bean.SecUser;
import com.capsui.service.AuthService;

/**
 * Created by tancw on 2016/6/23.
 */
@Controller
public class AuthController {

	@Autowired
	private AuthService authService;

	@RequestMapping("login")
	@ResponseBody
	public JsonResult login(SecUser user, HttpServletRequest request) {
		if (authService.login(user)) {
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("id", request.getSession().getId());
			result.put("user", user);
			result.put("role", "admin");
			return new JsonResult(0, result);
		}
		return new JsonResult(40001, "校验失败");
	}
}
