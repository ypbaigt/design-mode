package com.example.design.mode.structure.bridge;

/**
 * 扩展类
 * @Author ypbai
 * @create 2022/4/8 15:28
 */
public class BossCar extends RefinedCar{

    public BossCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Boss";
    }
}
