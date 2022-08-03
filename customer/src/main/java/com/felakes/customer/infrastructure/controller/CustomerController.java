package com.felakes.customer.infrastructure.controller;

import static com.felakes.customer.infrastructure.utils.Constants.API_CUSTOMER;
import static com.felakes.customer.infrastructure.utils.Constants.API_VERSION;

import com.felakes.customer.application.customer.CustomerService;
import com.felakes.customer.infrastructure.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = API_VERSION + API_CUSTOMER)
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerMapper mapper;

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        try {
            var response = this.customerService.findById(id);
            var customer = this.mapper.toDto(response);

            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity findAll() {
        try {
            var response = this.customerService.findAll();
            var customers = this.mapper.toDtoList(response);

            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}