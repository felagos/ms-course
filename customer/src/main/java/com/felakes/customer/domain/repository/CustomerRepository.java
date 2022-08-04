package com.felakes.domain.repository;

import com.felakes.domain.Customer;
import com.felakes.domain.exception.CustomerException;

import java.util.List;

public interface CustomerRepository {
    Customer findById(Long id) throws CustomerException;

    List<Customer> findAll();
}