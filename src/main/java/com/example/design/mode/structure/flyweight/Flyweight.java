package com.example.design.mode.structure.flyweight;

/**
 * 抽象享元角色
 * 复合享元模式时，非共享对象可由参数传入
 * @Author ypbai
 * @create 2022/4/12 16:22
 */
public interface Flyweight {

    void operation(UnsharedConcreteFlyweight state);

}
