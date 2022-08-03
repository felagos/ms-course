package com.felakes.billing.infrastructure.data.repository;

import com.felakes.billing.infrastructure.data.entiy.BillingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingJpaRepository extends JpaRepository<BillingEntity, Long> {
}
