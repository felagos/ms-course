package com.felakes.product.infrastructure.mapper;

import com.felakes.product.domain.Product;
import com.felakes.product.infrastructure.data.entiy.ProductEntity;
import com.felakes.product.infrastructure.dto.ProductDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toDomain(ProductEntity customer);

    ProductDto toDto(Product product);

    List<Product> toDomainList(List<ProductEntity> entities);

    List<ProductDto> toDtoList(List<Product> entities);

}
