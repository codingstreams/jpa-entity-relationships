package com.akshay.jpaentityrelationshipsdemo.repo;

import com.akshay.jpaentityrelationshipsdemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
