package com.example.design.mode.structure;

import com.example.design.mode.structure.bridge.BossCar;
import com.example.design.mode.structure.bridge.Engine;
import com.example.design.mode.structure.bridge.HybridEngine;
import com.example.design.mode.structure.bridge.RefinedCar;
import org.junit.Test;

/**
 * 桥接
 * @Author ypbai
 * @create 2022/4/8 15:37
 */
public class BridgeTest {

    @Test
    public void test1() {
        //选择一个发动机（混动）
        Engine hybridEngine = new HybridEngine();
        //供Boss车型使用
        RefinedCar car = new BossCar(hybridEngine);
        //组装完成
        car.drive();

        System.out.println("=============增加核发动机汽车====================");

        hybridEngine = new SunEngine();
        car = new BossCar(hybridEngine);
        car.drive();
    }

}

/**
 * 增加一个核发动机
 */
class SunEngine implements Engine {

    @Override
    public void start() {
        System.out.println("start sun engine");
    }
}