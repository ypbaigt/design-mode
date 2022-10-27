package com.example.design.mode.behavior.strategy;

import java.math.BigDecimal;

/**
 * 折扣策略
 */
public interface DiscountStrategy {

    //计算折扣额度
    BigDecimal getDiscount(BigDecimal total);

}
