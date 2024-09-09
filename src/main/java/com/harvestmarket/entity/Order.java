package com.harvestmarket.entity;   

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User user;
    private List<OrderItem> items;
    private LocalDateTime orderDate;
    private OrderStatus status;
}

