package com.felakes.product.infrastructure.data.repository;

import com.felakes.product.domain.Product;
import com.felakes.product.domain.exception.ProductNotFoundException;
import com.felakes.product.domain.repository.ProductRepository;
import com.felakes.product.infrastructure.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
public class ProductDboRepository implements ProductRepository {

    @Autowired
    private ProductJpaRepository repository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public Product findById(Long id) throws ProductNotFoundException {
        var product = this.repository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("product not found"));

        return this.mapper.toDomain(product);
    }

    @Override
    public List<Product> findAll() {
        var customers = this.repository.findAll();

        return this.mapper.toDomainList(customers);
    }

}
