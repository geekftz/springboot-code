package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {
    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount() {
        return "visit user account";
    }


    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin() {
        return "visit user login";
    }
}
