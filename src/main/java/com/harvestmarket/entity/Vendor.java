package com.harvestmarket.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String produce;

    @ManyToOne
    @JoinColumn(name = "market_id")
    private Market market;
    }
