package com.felakes.billing.infrastructure.controller;

import com.felakes.billing.infrastructure.mapper.BillingMapper;
import com.felakes.billing.infrastructure.utils.Constants;
import com.felakes.billing.application.billing.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Constants.API_VERSION + Constants.API_BILLING)
public class BillingController {

    @Autowired
    private BillingService customerService;

    @Autowired
    private BillingMapper mapper;

}