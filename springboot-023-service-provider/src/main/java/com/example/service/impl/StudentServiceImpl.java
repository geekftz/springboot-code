package com.example.service.impl;

import com.example.model.Student;
import com.example.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService(interfaceClass = StudentService.class, version = "1.0", timeout = 5000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudent(Integer id) {
        Student student = new Student();

        if (1001 == id) {
            student.setId(1001);
            student.setName("1001-zhangsan");
            student.setAge(11);
        } else if (1002 == id) {
            student.setId(1002);
            student.setName("1002-lisi");
            student.setAge(12);
        }

        return student;
    }
}
