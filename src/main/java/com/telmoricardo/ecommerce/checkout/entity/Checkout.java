package com.telmoricardo.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Builder
@Data
@Entity
public class Checkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private Status status;

    public enum Status {
        CREATED,
        APROVED
    }
}
