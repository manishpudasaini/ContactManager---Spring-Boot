package com.contactmanager.contactmanager.controller;

import com.contactmanager.contactmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
    public UserRepository userRepository;
    @Autowired
    public MyController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
