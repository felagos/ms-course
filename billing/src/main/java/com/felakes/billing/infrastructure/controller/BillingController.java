package com.felakes.billing.infrastructure.controller;

import com.felakes.billing.domain.exception.NotFoundBillingException;
import com.felakes.billing.infrastructure.mapper.BillingMapper;
import com.felakes.billing.infrastructure.utils.Constants;
import com.felakes.billing.application.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Constants.API_VERSION + Constants.API_BILLING)
public class BillingController {

    @Autowired
    private BillingService customerService;

    @Autowired
    private BillingMapper mapper;

    public ResponseEntity findById(Long id) {
        try {
            var billing = this.customerService.findById(id);

            return new ResponseEntity(this.mapper.toDto(billing), HttpStatus.OK);

        } catch (NotFoundBillingException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}