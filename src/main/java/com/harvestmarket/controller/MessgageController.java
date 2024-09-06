package com.harvestmarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessgageController {

    @GetMapping("/hello")
    public String hello() {
        return "Test Message Springboot with Vue.js";
    }
}
