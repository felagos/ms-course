package com.felakes.customer.domain.repository;

import com.felakes.customer.domain.exception.CustomerException;
import com.felakes.customer.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer findById(Long id) throws CustomerException;

    List<Customer> findAll();
}