package com.example.design.mode.behavior.chain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 请求体
 * @Author ypbai
 * @create 2022/4/13 15:18
 */
@Data
public class Request {

    private String name;

    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }
}
