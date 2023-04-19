package com.contactmanager.contactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String userDashboard(){
        return "user/user_dashboard";
    }

}
