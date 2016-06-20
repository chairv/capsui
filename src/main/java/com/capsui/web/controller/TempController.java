package com.capsui.web.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by qiao on 2016/6/17.
 */
@Controller
@RequestMapping("temp")
public class TempController {

    @RequestMapping("list")
    public String list(@RequestParam("token") String token,Model model){
        try {
            model.addAttribute("templst", TempAPI.getTempsByToken(token));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/resources/html/temp.html";
    }

}
