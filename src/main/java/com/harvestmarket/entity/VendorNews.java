package com.harvestmarket.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendor_news")
public class VendorNews extends News {
    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;
}

