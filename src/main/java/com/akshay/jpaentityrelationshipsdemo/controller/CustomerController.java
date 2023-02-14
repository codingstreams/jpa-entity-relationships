package com.akshay.jpaentityrelationshipsdemo.controller;

import com.akshay.jpaentityrelationshipsdemo.model.Customer;
import com.akshay.jpaentityrelationshipsdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Integer id){
        return customerService.getCustomer(id);
    }

    @PutMapping("/")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PatchMapping("/")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
    }
}
