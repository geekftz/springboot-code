package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {


    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable(value = "stuId") Integer stuId) {
        return "student id is -->" + stuId;
    }
}
