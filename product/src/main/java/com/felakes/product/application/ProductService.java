package com.felakes.product.application;

import com.felakes.product.domain.Product;
import com.felakes.product.domain.exception.ProductNotFoundException;
import com.felakes.product.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id) throws ProductNotFoundException {
        return productRepository.findById(id);
    }

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

}
