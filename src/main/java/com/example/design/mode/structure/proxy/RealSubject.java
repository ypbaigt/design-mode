package com.example.design.mode.structure.proxy;

/**
 * 真实主题
 * @Author ypbai
 * @create 2022/4/13 10:58
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
