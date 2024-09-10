package com.harvestmarket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Vendor extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @Column(columnDefinition = "TEXT")
    private String pageContent;

    @ElementCollection
    @CollectionTable(name = "vendor_produce", joinColumns = @JoinColumn(name = "vendor_id"))
    @Column(name = "produce")
    private List<String> produceList = new ArrayList<>();

    @OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VendorNews> vendorNews = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "market_admin_id")
    private MarketAdmin marketAdmin;

    private String role = "ROLE_VENDOR";

}
