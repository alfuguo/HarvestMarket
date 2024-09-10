package com.harvestmarket.entity;

import java.util.*;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Admin extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "approvedBy", cascade = CascadeType.ALL)
    private List<Market> approvedMarkets = new ArrayList<>();
    @OneToMany(mappedBy = "postedBy", cascade = CascadeType.ALL)
    private List<News> postedNews = new ArrayList<>();

}