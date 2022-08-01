package com.felakes.customer.infrastructure.data.repository;

import com.felakes.customer.infrastructure.data.entiy.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Long> {
}
