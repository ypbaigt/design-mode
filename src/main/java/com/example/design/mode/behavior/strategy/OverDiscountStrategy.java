package com.example.design.mode.behavior.strategy;

import java.math.BigDecimal;

/**
 * 满减折扣
 */
public class OverDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        return total.compareTo(new BigDecimal(100)) > 0 ? BigDecimal.valueOf(20) : BigDecimal.ZERO;
    }
}
