package com.example.design.mode.structure;

import com.example.design.mode.structure.flyweight.Flyweight;
import com.example.design.mode.structure.flyweight.FlyweightFactory;
import com.example.design.mode.structure.flyweight.UnsharedConcreteFlyweight;
import org.junit.Test;

/**
 * 享元模式
 * @Author ypbai
 * @create 2022/4/12 16:39
 */
public class FlyweightTest {

    @Test
    public void test1() {
        //创建并返回实例a，b
        Flyweight fly1a = FlyweightFactory.getFlyweight("a");
        Flyweight fly2a = FlyweightFactory.getFlyweight("a");
        Flyweight fly3a = FlyweightFactory.getFlyweight("a");

        Flyweight fly1b = FlyweightFactory.getFlyweight("b");
        Flyweight fly2b = FlyweightFactory.getFlyweight("b");

        //非共享对象 单独传参
        fly1a.operation(new UnsharedConcreteFlyweight("第1次调用a"));
        fly2a.operation(new UnsharedConcreteFlyweight("第2次调用a"));
        fly3a.operation(new UnsharedConcreteFlyweight("第3次调用a"));

        fly1b.operation(new UnsharedConcreteFlyweight("第1次调用b"));
        fly2b.operation(new UnsharedConcreteFlyweight("第2次调用b"));
    }
}
