package com.akshay.jpaentityrelationshipsdemo.manytomany.controller;

import com.akshay.jpaentityrelationshipsdemo.manytomany.model.Course;
import com.akshay.jpaentityrelationshipsdemo.manytomany.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Integer id) {
        return courseService.getCourse(id);
    }

    @PostMapping("/")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
}
