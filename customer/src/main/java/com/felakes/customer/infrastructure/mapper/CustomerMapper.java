package com.felakes.customer.infrastructure.mapper;

import com.felakes.customer.domain.Customer;
import com.felakes.customer.infrastructure.data.entiy.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toDomain(CustomerEntity customer);

}
