package com.contactmanager.contactmanager.controller;

import com.contactmanager.contactmanager.entity.User;
import com.contactmanager.contactmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


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

    @GetMapping("/signup")
    public String signup(Model model){

        model.addAttribute("user", new User());
        return "signup";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, Model model){
        System.out.println(user);
        user.setRole("Software developer");
        User user1 = userRepository.save(user);
        model.addAttribute("userData",user1);
        return "signup";
    }
}
