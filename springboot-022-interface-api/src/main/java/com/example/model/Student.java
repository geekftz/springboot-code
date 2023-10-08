package com.example.model;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 3941539077791951521L;
    private Integer age;
    private String name;
    private Integer id;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
