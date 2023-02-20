package com.akshay.jpaentityrelationshipsdemo.manytomany.service;

import com.akshay.jpaentityrelationshipsdemo.manytomany.model.Course;
import com.akshay.jpaentityrelationshipsdemo.manytomany.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course getCourse(Integer id) {
        return courseRepository.findById(id).get();
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
}
