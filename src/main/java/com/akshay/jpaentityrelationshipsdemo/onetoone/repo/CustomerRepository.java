package com.akshay.jpaentityrelationshipsdemo.onetoone.repo;

import com.akshay.jpaentityrelationshipsdemo.onetoone.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
