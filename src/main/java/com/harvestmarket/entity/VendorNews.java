package com.harvestmarket.entity;

import jakarta.persistence.*;   

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class VendorNews extends News {
    private Vendor vendor;
}

