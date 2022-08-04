package com.felakes.infrastructure.data.repository;

import com.felakes.infrastructure.data.entiy.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Long> {
}
