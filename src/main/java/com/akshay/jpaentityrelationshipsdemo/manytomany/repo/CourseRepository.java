package com.akshay.jpaentityrelationshipsdemo.manytomany.repo;

import com.akshay.jpaentityrelationshipsdemo.manytomany.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
