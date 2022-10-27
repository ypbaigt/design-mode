package com.example.design.mode.behavior.template;

public abstract class Cooking {

    protected abstract void step1();

    protected abstract void step2();

    public final void cook() {
        System.out.println("做饭开始。。。");
        step1();
        step2();
        System.out.println("做饭结束。。。");
    }
}
