package com.akshay.jpaentityrelationshipsdemo.onetoone.controller;

import com.akshay.jpaentityrelationshipsdemo.onetoone.model.Customer;
import com.akshay.jpaentityrelationshipsdemo.onetoone.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Integer id) {
        return customerService.getCustomer(id);
    }

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
    }
}
