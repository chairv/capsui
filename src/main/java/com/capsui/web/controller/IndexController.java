package com.capsui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tancw on 2016/6/17.
 */
@Controller
public class IndexController {

	@RequestMapping("home")
	public String home() {
		return "resources/html/home.html";
	}
}
