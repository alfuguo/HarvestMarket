package com.harvestmarket.controller;

import com.harvestmarket.entity.Market;
import com.harvestmarket.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market")
public class MarketController {
    @Autowired
    private MarketService marketService;

    @PostMapping("/add")
    public Market addMarket(@RequestBody Market market) {
        return marketService.saveMarket(market);
    }
}
