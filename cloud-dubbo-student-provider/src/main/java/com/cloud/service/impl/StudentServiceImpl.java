package com.cloud.service.impl;

import com.api.entity.Student;
import com.api.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getInfo() {
        Student student = new Student();
        student.setId(1);
        student.setName("wyh");
        student.setAddress("adf");
        return student;
    }

    @Override
    public String test() {
        return "server : cloud-dubbo-student-provider";
    }
}
