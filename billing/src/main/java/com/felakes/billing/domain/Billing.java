package com.felakes.billing.domain;

import lombok.Data;

@Data
public class Billing {

    private Long id;
    private Long customerId;
    private String number;
    private String detail;
    private Double amount;
}
