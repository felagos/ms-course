package com.felakes.billing.infrastructure.data.repository;

import com.felakes.billing.domain.Billing;
import com.felakes.billing.domain.exception.NotFoundBillingException;
import com.felakes.billing.domain.repository.BillingRepository;
import com.felakes.billing.infrastructure.mapper.BillingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingDboRepository implements BillingRepository {

    @Autowired
    private BillingJpaRepository repository;

    @Autowired
    private BillingMapper mapper;

    @Override
    public Billing findById(Long id) throws NotFoundBillingException {
        var billing = this.repository.findById(id).orElseThrow(() -> new NotFoundBillingException("billing not found"));

        return this.mapper.toDomain(billing);
    }
}
