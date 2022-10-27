package com.example.design.mode.structure.flyweight;

/**
 * 非享元角色（非共享对象）
 * @Author ypbai
 * @create 2022/4/12 16:21
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

}
