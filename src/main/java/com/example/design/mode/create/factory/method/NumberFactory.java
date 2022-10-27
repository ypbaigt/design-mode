package com.example.design.mode.create.factory.method;

/**
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1281319170474017
 * 抽象工厂
 * @Author ypbai
 * @create 2022/3/25 10:30
 */
public interface NumberFactory {

    //工厂实现
    NumberFactory impl = new NumberFactoryImpl();

    Number parse(String s);

    static NumberFactory getFactory() {
        return impl;
    }

}
