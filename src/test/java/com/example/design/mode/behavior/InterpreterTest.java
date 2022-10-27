package com.example.design.mode.behavior;

import com.example.design.mode.behavior.interpreter.Context;
import org.junit.Test;

/**
 * 解释器模式
 * @Author ypbai
 * @create 2022/4/15 9:52
 */
public class InterpreterTest {

    @Test
    public void test1() {
        Context bus = new Context();
        bus.freeRide("郑州的老人");
        bus.freeRide("郑州的儿童");
        bus.freeRide("郑州的成人");
        bus.freeRide("广州的老人");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }

}
