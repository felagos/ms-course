package com.felakes.customer.infrastructure.mapper;

import com.felakes.customer.domain.Customer;
import com.felakes.customer.infrastructure.data.entiy.CustomerEntity;
import com.felakes.customer.infrastructure.dto.CustomerDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toDomain(CustomerEntity customer);

    CustomerDto toDto(Customer customer);

    List<Customer> toDomainList(List<CustomerEntity> entities);

    List<CustomerDto> toDtoList(List<Customer> entities);

}
