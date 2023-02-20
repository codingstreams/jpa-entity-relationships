package com.akshay.jpaentityrelationshipsdemo.manytomany.repo;

import com.akshay.jpaentityrelationshipsdemo.manytomany.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
