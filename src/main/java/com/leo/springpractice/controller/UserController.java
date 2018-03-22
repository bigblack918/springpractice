package com.leo.springpractice.controller;

import com.leo.springpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/MyFirstPage")
    public String greeting(@RequestParam(value="title", required=false, defaultValue="xiao") String title, Model model) {
        model.addAttribute("id", userService.getUserId());
        model.addAttribute("name", title);
        return "index";
    }
}
