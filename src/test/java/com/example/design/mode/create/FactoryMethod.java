package com.example.design.mode.create;

import com.example.design.mode.create.factory.method.exercise.LocalDateFactory;
import com.example.design.mode.create.factory.method.NumberFactory;
import com.example.design.mode.create.factory.method.NumberFactory1;
import org.junit.Test;

import java.time.LocalDate;

/**
 * 工厂方法，静态工厂
 * @Author ypbai
 * @create 2022/3/25 10:50
 */
public class FactoryMethod {

    /**
     * 工厂模式
     * 在客户端中，只跟抽象产品Number和抽象工厂NumberFactory打交道，不关心抽象工厂的实现以及具体产品的实现
     */
    @Test
    public void test1() {
        NumberFactory factory = NumberFactory.getFactory();
        Number result = factory.parse("123.456");
        System.out.println(result);
    }

    /**
     * 静态工厂模式
     */
    @Test
    public void test2() {
        Number result = NumberFactory1.parse("123.456");
        System.out.println(result);
    }

    @Test
    public void exercise() {
        LocalDate localDate = LocalDateFactory.fromInt(20220325);
        System.out.println(localDate.toString());
    }

}
