package com.capsui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tancw on 2016/6/17.
 */
@Controller
public class IndexController {

	@RequestMapping("home")
	public String home() {
		return "resources2/home.html";
	}


	@RequestMapping("go.do")
	public String go(@RequestParam String p) {
		return p;
	}
}
