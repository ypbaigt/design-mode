package com.example.design.mode.structure.bridge;

/**
 * 修正的抽象类，定义额外操作
 * @Author ypbai
 * @create 2022/4/8 15:21
 */
public abstract class RefinedCar extends Car{

    public RefinedCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        this.engine.start();
        System.out.println("Drive ".concat(getBrand().concat(" car...")));
    }

    public abstract String getBrand();
}
