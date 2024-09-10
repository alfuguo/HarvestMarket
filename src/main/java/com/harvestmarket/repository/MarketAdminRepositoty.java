package com.harvestmarket.repository;   

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harvestmarket.entity.MarketAdmin;

@Repository
public interface MarketAdminRepositoty extends JpaRepository<MarketAdmin, Long> {
    
}

