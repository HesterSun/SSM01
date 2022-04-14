package com.it.ssm.controller;

import com.it.ssm.pojo.User;
import com.it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("toUser")
    public String  toUser(int id, Model model){
       User u =  userService.getUser(id);
       model.addAttribute("user",u);
        return "index";
    }

}
