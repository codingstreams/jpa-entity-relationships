package com.akshay.jpaentityrelationshipsdemo.onetomany.service;

import com.akshay.jpaentityrelationshipsdemo.onetomany.model.Department;
import com.akshay.jpaentityrelationshipsdemo.onetomany.model.Employee;
import com.akshay.jpaentityrelationshipsdemo.onetomany.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department getDepartment(Integer departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
