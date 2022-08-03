package com.felakes.billing.infrastructure.mapper;

import com.felakes.billing.domain.Billing;
import com.felakes.billing.infrastructure.data.entiy.BillingEntity;
import com.felakes.billing.infrastructure.dto.BillingDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BillingMapper {

    Billing toDomain(BillingEntity customer);

    BillingDto toDto(Billing billing);

    List<Billing> toDomainList(List<BillingEntity> entities);

    List<BillingDto> toDtoList(List<Billing> entities);

}
