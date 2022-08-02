package com.felakes.customer.application.customer;

import com.felakes.customer.domain.Customer;
import com.felakes.customer.domain.exception.CustomerException;
import com.felakes.customer.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer findById(Long id) throws CustomerException {
        return customerRepository.findById(id);
    }

    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

}
