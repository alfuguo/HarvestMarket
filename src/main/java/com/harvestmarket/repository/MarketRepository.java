package com.harvestmarket.repository;

import com.harvestmarket.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market, Long>{
}
