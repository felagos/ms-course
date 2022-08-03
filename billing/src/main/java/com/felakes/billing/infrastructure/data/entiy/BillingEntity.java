package com.felakes.billing.infrastructure.data.entiy;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "billings")
public class BillingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    private String number;

    private String detail;

    private Double amount;

}