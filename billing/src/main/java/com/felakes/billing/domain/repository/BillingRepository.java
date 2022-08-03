package com.felakes.billing.domain.repository;

import com.felakes.billing.domain.Billing;
import com.felakes.billing.domain.exception.NotFoundBillingException;

public interface BillingRepository {

    public Billing findById(Long id) throws NotFoundBillingException;

}