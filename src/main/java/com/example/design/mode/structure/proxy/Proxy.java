package com.example.design.mode.structure.proxy;

/**
 * 代理类
 * @Author ypbai
 * @create 2022/4/13 11:04
 */
public class Proxy implements Subject{

    /**
     * 持有真实对象的引用
     */
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预代理");
    }

    public void postRequest() {
        System.out.println("访问真实主题之前的后续代理");
    }
}
