package com.it.de_one.controller;

import com.it.de_one.bean.User;
import com.it.de_one.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUsers")
    public String selectUsers(Model model){
        List users=userService.selectUsers();
        model.addAttribute("users",users);
        return "list";
    }
}
