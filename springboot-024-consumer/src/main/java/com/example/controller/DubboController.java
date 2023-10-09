package com.example.controller;


import com.example.model.Student;
import com.example.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @DubboReference(interfaceClass = StudentService.class, version = "1.0")
    private StudentService studentService;


    @GetMapping("/query")
    public String queryStudent() {
        Student student = studentService.queryStudent(1001);

        return "query result is " + student;
    }
}
