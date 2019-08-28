package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @RequestMapping("register")
    public String registerUser(){
        System.out.println("Clicked on registration page");
        return "register";
    }
}
