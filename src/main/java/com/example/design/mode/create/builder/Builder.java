package com.example.design.mode.create.builder;

/**
 * 对产品属性做抽象，可以有多个部件实现者
 * @Author ypbai
 * @create 2022/3/31 15:41
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildParA();

    public abstract void buildParB();

    public abstract void buildParC();

    public Product getResult() {
        return product;
    }
}
