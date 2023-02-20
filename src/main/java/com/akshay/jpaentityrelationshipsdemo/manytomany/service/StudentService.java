package com.akshay.jpaentityrelationshipsdemo.manytomany.service;

import com.akshay.jpaentityrelationshipsdemo.manytomany.model.Student;
import com.akshay.jpaentityrelationshipsdemo.manytomany.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudent(Integer id) {
        return studentRepository.findById(id).get();
    }
}
