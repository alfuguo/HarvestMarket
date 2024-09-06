package com.harvestmarket.service;

import com.harvestmarket.entity.Market;
import com.harvestmarket.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketService {
    @Autowired
    private MarketRepository marketRepository;

    public Market saveMarket(Market market) {
        return marketRepository.save(market);
    }


}
