package com.akshay.jpaentityrelationshipsdemo.manytomany.controller;

import com.akshay.jpaentityrelationshipsdemo.manytomany.model.Student;
import com.akshay.jpaentityrelationshipsdemo.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
}
