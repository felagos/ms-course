package com.felakes.product.infrastructure.data.repository;

import com.felakes.product.domain.Product;
import com.felakes.product.domain.exception.ProductNotFoundException;
import com.felakes.product.domain.repository.ProductRepository;
import com.felakes.product.infrastructure.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDboRepository implements ProductRepository {

    @Autowired
    private ProductJpaRepository repository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public Product findById(Long id) throws ProductNotFoundException {
        var customer = this.repository.findById(id).orElseThrow(() -> new ProductNotFoundException("customer not found"));

        return this.mapper.toDomain(customer);
    }

    @Override
    public List<Product> findAll() {
        var customers = this.repository.findAll();

        return this.mapper.toDomainList(customers);
    }

}
