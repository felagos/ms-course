package com.felakes.infrastructure.mapper;

import com.felakes.domain.Customer;
import com.felakes.infrastructure.data.entiy.CustomerEntity;
import com.felakes.infrastructure.dto.CustomerDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toDomain(CustomerEntity customer);

    CustomerDto toDto(Customer customer);

    List<Customer> toDomainList(List<CustomerEntity> entities);

    List<CustomerDto> toDtoList(List<Customer> entities);

}
