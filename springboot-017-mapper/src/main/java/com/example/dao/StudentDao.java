package com.example.dao;

import com.example.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);

}
