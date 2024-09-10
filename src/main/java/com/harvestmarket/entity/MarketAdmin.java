package com.harvestmarket.entity;

import java.util.*;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MarketAdmin extends User {
    @OneToOne
    @JoinColumn(name = "market_id")
    private Market managedMarket;

    @OneToMany(mappedBy = "marketAdmin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vendor> approvedVendors = new ArrayList<>();

    @OneToMany(mappedBy = "marketAdmin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MarketNews> postedNews = new ArrayList<>();

    private String role = "ROLE_MARKET_ADMIN";
}
