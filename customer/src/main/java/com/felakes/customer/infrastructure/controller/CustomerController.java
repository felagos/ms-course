package com.felakes.customer.infrastructure.controller;

import static com.felakes.customer.infrastructure.utils.Constants.API_CUSTOMER;
import static com.felakes.customer.infrastructure.utils.Constants.API_VERSION;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = API_VERSION + API_CUSTOMER)
public class CustomerController {

}