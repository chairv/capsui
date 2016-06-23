package com.capsui.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capsui.bean.Temp;
import com.capsui.dao.Page;
import com.capsui.service.TempService;

/**
 * Created by tancw on 2016/6/23.
 */
@Controller
@RequestMapping("temp")
public class TempController {

    @Autowired
    private TempService tempService;

    public Page<Temp> list() {
        Map<String, Object> param = new HashMap<String, Object>();
        return Page.create(tempService.list(param), tempService.count(param));
    }
}
