package com.domain.springbootthymeleafbootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String home(){
        return "auth-login";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "auth-login";
    }

    @RequestMapping("/home")
    public String loginSubmit(){
        return "pages/landing_page";
    }

//    @RequestMapping("/home")
//    public String loginSubmit(){
//        return "layout/dashboard";
//    }

}
