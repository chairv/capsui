package com.capsui.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.capsui.bean.JsonResult;
import com.capsui.bean.MsgTemp;
import com.capsui.weixin.API.TempAPI;

/**
 * Created by tancw on 2016/6/21.
 */
@Controller
public class RegisterController {

	@RequestMapping(value = "register")
	@ResponseBody
	public JsonResult register(@RequestParam("access_token") String access_token) {
        String temps = TempAPI.getTemps(access_token);
		JSONObject js = (JSONObject) JSONObject.parse(temps);
		if(js.getInteger("errcode") != null){
          return new JsonResult(js.getInteger("errcode"),js.getString("errmsg"));
		}
		List<MsgTemp> result = (List<MsgTemp>) JSONArray.parse(js.getString("template_list"));

		return new JsonResult(1, result);
	}
}
