package com.felakes.product.infrastructure.controller;

import static com.felakes.product.infrastructure.utils.Constants.API_PRODUCT;
import static com.felakes.product.infrastructure.utils.Constants.API_VERSION;

import com.felakes.product.application.ProductService;
import com.felakes.product.infrastructure.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = API_VERSION + API_PRODUCT)
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper mapper;

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id) {
        try {
            var response = this.productService.findById(id);
            var customer = this.mapper.toDto(response);

            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity findAll() {
        try {
            var response = this.productService.findAll();
            var customers = this.mapper.toDtoList(response);

            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}