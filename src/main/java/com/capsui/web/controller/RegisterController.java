package com.capsui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capsui.bean.JsonResult;
import com.capsui.weixin.API.TempAPI;

/**
 * Created by tancw on 2016/6/21.
 */
@Controller
public class RegisterController {
	@RequestMapping("register")
	@ResponseBody
	public JsonResult register(@RequestParam("openId") String openId, @RequestParam("access_token") String access_token,Model model) {
        String temps = TempAPI.getTemps(access_token);
		return new JsonResult(1, temps);
	}
}
