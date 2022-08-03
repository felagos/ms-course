package com.felakes.billing.application.billing;

import com.felakes.billing.domain.Billing;
import com.felakes.billing.domain.exception.CustomerException;
import com.felakes.billing.domain.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;

}
