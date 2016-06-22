package com.capsui.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.capsui.bean.JsonResult;
import com.capsui.bean.TempFlow;
import com.capsui.service.TempFlowService;
import com.capsui.weixin.API.TempAPI;

/**
 * Created by tancw on 2016/6/21.
 */
@Controller
public class TempFlowController {

	@Autowired
	private TempFlowService tempFlowService;

	@RequestMapping(value = "loadUserTemp")
	@ResponseBody
	public JsonResult register(@RequestParam("access_token") String access_token) {
		String temps = TempAPI.getTemps(access_token);
		JSONObject js = (JSONObject) JSONObject.parse(temps);
		if (js.getInteger("errcode") != null) {
			return new JsonResult(js.getInteger("errcode"), js.getString("errmsg"));
		}
		List<TempFlow> tempFlows =  JSONArray.parseArray(js.getString("template_list"),TempFlow.class);
		// new Thread(new Runnable() {
		// @Override
		// public void run() {
		for (TempFlow flow : tempFlows) {
			flow.setAccess_token(access_token);
			flow.setCreateTime(new Date());
			tempFlowService.saveOrUpdate(flow);
		}
		// }
		// }).start();
		return new JsonResult(1, tempFlows);
	}
}
