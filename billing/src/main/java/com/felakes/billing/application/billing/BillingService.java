package com.felakes.billing.application.billing;

import com.felakes.billing.domain.Billing;
import com.felakes.billing.domain.exception.NotFoundBillingException;
import com.felakes.billing.domain.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;

    public Billing findById(Long id) throws NotFoundBillingException {
        return this.billingRepository.findById(id);
    }

}
