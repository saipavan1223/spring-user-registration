package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserDetailsController {
    @RequestMapping("/userDetails")
    public String showUserDetails(){
        System.out.println("clicked on login");
        return "userdetails";
    }

}
