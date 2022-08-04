package com.felakes.product.domain.repository;

import com.felakes.product.domain.Product;
import com.felakes.product.domain.exception.ProductNotFoundException;

import java.util.List;

public interface ProductRepository {
    Product findById(Long id) throws ProductNotFoundException;

    List<Product> findAll();
}