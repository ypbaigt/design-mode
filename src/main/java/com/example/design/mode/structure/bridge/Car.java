package com.example.design.mode.structure.bridge;

/**
 * 顶层抽象类，可有可无
 * @Author ypbai
 * @create 2022/4/8 15:08
 */
public abstract class Car {

    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();

}
