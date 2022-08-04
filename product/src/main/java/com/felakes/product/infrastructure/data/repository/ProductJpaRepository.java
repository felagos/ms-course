package com.felakes.product.infrastructure.data.repository;

import com.felakes.product.infrastructure.data.entiy.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {
}
