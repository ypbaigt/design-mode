package com.example.design.mode.behavior.observer;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品信息
 */
@Data
public class Product {

    private String name;

    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
