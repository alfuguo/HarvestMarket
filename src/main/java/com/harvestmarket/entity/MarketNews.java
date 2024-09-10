package com.harvestmarket.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "market_news")
public class MarketNews extends News {
    @ManyToOne
    @JoinColumn(name = "market_admin_id")
    private MarketAdmin marketAdmin;
}