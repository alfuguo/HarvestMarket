package com.harvestmarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class VendorNews extends News {
    private Vendor vendor;
}

