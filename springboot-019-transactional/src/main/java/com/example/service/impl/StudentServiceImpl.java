package com.example.service.impl;

import com.example.dao.StudentMapper;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("add student");
        int rows = studentMapper.insert(student);
        System.out.println("execute sql sentence");

        // throw error
        // int m = 10 / 0;
        return rows;
    }
}
