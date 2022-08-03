package com.felakes.billing.infrastructure.data.repository;

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

}
