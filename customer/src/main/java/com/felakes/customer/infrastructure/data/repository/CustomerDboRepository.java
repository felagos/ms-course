package com.felakes.customer.infrastructure.data.repository;

import com.felakes.customer.domain.Customer;
import com.felakes.customer.domain.repository.CustomerRepository;
import com.felakes.customer.infrastructure.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDboRepository implements CustomerRepository {

    @Autowired
    private CustomerJpaRepository repository;

    @Autowired
    private CustomerMapper mapper;

    @Override
    public Customer findById(Long id) {
        return null;
    }

}
