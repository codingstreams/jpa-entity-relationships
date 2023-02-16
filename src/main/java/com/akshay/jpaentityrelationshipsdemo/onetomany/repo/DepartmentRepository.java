package com.akshay.jpaentityrelationshipsdemo.onetomany.repo;

import com.akshay.jpaentityrelationshipsdemo.onetomany.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
