package com.contactmanager.contactmanager.controller;

import com.contactmanager.contactmanager.entity.Contact;
import com.contactmanager.contactmanager.entity.User;
import com.contactmanager.contactmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    public UserRepository userRepository;
    @Autowired
    public MyController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
