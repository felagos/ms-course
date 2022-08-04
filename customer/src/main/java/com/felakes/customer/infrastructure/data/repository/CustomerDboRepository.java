package com.felakes.customer.infrastructure.data.repository;

import com.felakes.customer.domain.exception.CustomerException;
import com.felakes.customer.infrastructure.mapper.CustomerMapper;
import com.felakes.customer.domain.Customer;
import com.felakes.customer.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDboRepository implements CustomerRepository {

    @Autowired
    private CustomerJpaRepository repository;

    @Autowired
    private CustomerMapper mapper;

    @Override
    public Customer findById(Long id) throws CustomerException {
        var customer = this.repository.findById(id).orElseThrow(() -> new CustomerException("customer not found"));

        return this.mapper.toDomain(customer);
    }

    @Override
    public List<Customer> findAll() {
        var customers = this.repository.findAll();

        return this.mapper.toDomainList(customers);
    }

}
