package com.harvestmarket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Admin extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Market> approvedMarkets = new ArrayList<>();
    @OneToMany(mappedBy = "postedBy", cascade = CascadeType.ALL)
    private List<News> postedNews = new ArrayList<>();

}