package com.example.design.mode.behavior.strategy;

import java.math.BigDecimal;

public class DiscountContext {

    private DiscountStrategy discountStrategy = new UserDiscountStrategy();

    public void setStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal calculatePrice(BigDecimal total) {
        return total.subtract(discountStrategy.getDiscount(total)).setScale(2);
    }

}
