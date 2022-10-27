package com.example.design.mode.create.factory.method;

import java.math.BigDecimal;

/**
 * 抽象产品
 * @Author ypbai
 * @create 2022/3/25 10:32
 */
public class NumberFactoryImpl implements NumberFactory{

    @Override
    /**
     * Number ->抽象产品
     */
    public Number parse(String s) {
        //具体产品实现
        return new BigDecimal(s);
    }
}
