package com.felakes.customer.domain.repository;

import com.felakes.customer.domain.Customer;

public interface CustomerRepository {
    Customer findById(Long id);
}