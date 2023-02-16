package com.akshay.jpaentityrelationshipsdemo.onetomany.service;


import com.akshay.jpaentityrelationshipsdemo.onetomany.model.Employee;
import com.akshay.jpaentityrelationshipsdemo.onetomany.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Integer employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    public void deleteEmployee(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
