package com.example.design.mode.create.builder;

/**
 * 具体建造者（实现零件）
 * @Author ypbai
 * @create 2022/3/31 15:51
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildParA() {
        product.setPartA("A师傅建造PartA");
    }

    @Override
    public void buildParB() {
        product.setPartB("A师傅建造PartB");
    }

    @Override
    public void buildParC() {
        product.setPartC("A师傅建造PartC");
    }
}
