package com.example.design.mode.behavior;

import com.example.design.mode.behavior.strategy.DiscountContext;
import com.example.design.mode.behavior.strategy.OverDiscountStrategy;
import com.example.design.mode.behavior.strategy.UserDiscountStrategy;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 策略模式
 */
public class StrategyTest {

    @Test
    public void test1() {

        DiscountContext ctx = new DiscountContext();

        //普通会员折扣
        ctx.setStrategy(new UserDiscountStrategy());
        System.out.println(ctx.calculatePrice(new BigDecimal(105)));

        //满减折扣
        ctx.setStrategy(new OverDiscountStrategy());
        System.out.println(ctx.calculatePrice(new BigDecimal(105)));
    }

}
