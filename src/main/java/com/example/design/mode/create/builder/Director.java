package com.example.design.mode.create.builder;

/**
 * 指挥者
 * @Author ypbai
 * @create 2022/3/31 15:58
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指挥者完成复杂对象的创建（组装），但不涉及每个部件实现的细节
     * @return
     */
    public Product construct() {
        //先组装A
        builder.buildParA();
        //再组装C
        builder.buildParC();
        builder.buildParB();
        return builder.getResult();
    }

}
