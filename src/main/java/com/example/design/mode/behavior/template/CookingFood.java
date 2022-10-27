package com.example.design.mode.behavior.template;

public class CookingFood extends Cooking {


    @Override
    protected void step1() {
        System.out.println("放西红柿鸡蛋");
    }

    @Override
    protected void step2() {
        System.out.println("放盐");
    }
}
