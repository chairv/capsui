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
import com.capsui.bean.Temp;
import com.capsui.bean.TempFlow;
import com.capsui.secure.auth.AuthLogin;
import com.capsui.service.TempFlowService;
import com.capsui.service.TempService;
import com.capsui.weixin.API.TempAPI;

/**
 * Created by tancw on 2016/6/21.
 */
@Controller
@RequestMapping("flow")
public class TempFlowController {

	@Autowired
	private TempFlowService tempFlowService;

	@Autowired
	private TempService tempService;

	@RequestMapping(value = "loadUserTemp")
	@ResponseBody
	@AuthLogin
	public JsonResult register(@RequestParam("access_token") String access_token) {
		if (access_token == null || access_token.length() < 50) {
			return new JsonResult(40001, "入参不正确");
		}
		String temps = TempAPI.getTemps(access_token);
		JSONObject js = (JSONObject) JSONObject.parse(temps);
		if (js.getInteger("errcode") != null) {
			return new JsonResult(js.getInteger("errcode"), js.getString("errmsg"));
		}
		List<TempFlow> tempFlows = JSONArray.parseArray(js.getString("template_list"), TempFlow.class);
		// new Thread(new Runnable() {
		// @Override
		// public void run() {
		for (TempFlow flow : tempFlows) {
			flow.setAccess_token(access_token);
			flow.setCreateTime(new Date());
			Temp temp = new Temp(flow);
			Temp oldTmep = tempService.selectByTitleContent(temp.getTitle(),temp.getContent());
			if (oldTmep != null) {
				flow.setAs_temp_id(oldTmep.getId());
			} else {
				int result = tempService.save(temp);
				if (result > 0) {
					flow.setAs_temp_id(temp.getId());
				}
			}
			tempFlowService.saveOrUpdate(flow);

			//用户与模板之间的关系建立 TODO
		}
		// }
		// }).start();
		return new JsonResult(1, tempFlows);
	}

	@RequestMapping("list")
	@ResponseBody
	public JsonResult list() {
		List<Temp> rslst = tempFlowService.list();
		return new JsonResult(1, rslst);
	}
}
