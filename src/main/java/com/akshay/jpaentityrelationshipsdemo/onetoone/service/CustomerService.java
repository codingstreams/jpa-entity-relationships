package com.akshay.jpaentityrelationshipsdemo.onetoone.service;

import com.akshay.jpaentityrelationshipsdemo.onetoone.model.Customer;
import com.akshay.jpaentityrelationshipsdemo.onetoone.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Integer customerId) {
        return customerRepository.findById(customerId).get();
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
