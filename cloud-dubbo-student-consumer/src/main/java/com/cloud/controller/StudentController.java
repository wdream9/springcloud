package com.cloud.controller;

import com.api.entity.Student;
import com.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student/info")
    public Student info(){
        return studentService.getInfo();
    }
}
