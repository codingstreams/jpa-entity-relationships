package com.akshay.jpaentityrelationshipsdemo.onetomany.controller;

import com.akshay.jpaentityrelationshipsdemo.onetomany.model.Department;
import com.akshay.jpaentityrelationshipsdemo.onetomany.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Integer id){
        return departmentService.getDepartment(id);
    }

    @PostMapping("/")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
}
