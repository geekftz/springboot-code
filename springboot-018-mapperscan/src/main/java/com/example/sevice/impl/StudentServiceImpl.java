package com.example.sevice.impl;

import com.example.dao.StudentDao;
import com.example.model.Student;
import com.example.sevice.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {
        return studentDao.selectById(id);
    }
}
