package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {


    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable(value = "stuId") Integer stuId) {
        return "student id is -->" + stuId;
    }


    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable(value="name") String name,@PathVariable(value="age") Integer age) {
        return "create student info -->" + name + age;
    }

    @PutMapping("/student/{id}/{age}")
    public String modifyStudent(@PathVariable Integer id, @PathVariable Integer age) {
        return "update resource, execute put request method" + id + age;
    }

    @DeleteMapping("/student/{id}")
    public String removeStudentById(@PathVariable Integer id) {
        return "remove student, id is: " + id;
    }
}
