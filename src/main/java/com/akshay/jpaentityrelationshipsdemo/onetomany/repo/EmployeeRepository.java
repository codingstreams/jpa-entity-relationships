package com.akshay.jpaentityrelationshipsdemo.onetomany.repo;

import com.akshay.jpaentityrelationshipsdemo.onetomany.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
