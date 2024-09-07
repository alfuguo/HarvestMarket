package com.harvestmarket.repository;

import com.harvestmarket.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface MarketRepository extends JpaRepository<Market, Long>{
}
