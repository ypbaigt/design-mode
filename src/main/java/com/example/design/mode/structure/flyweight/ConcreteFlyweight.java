package com.example.design.mode.structure.flyweight;

/**
 * 具体享元角色
 * @Author ypbai
 * @create 2022/4/12 16:25
 */
public class ConcreteFlyweight implements Flyweight{

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建。");
    }

    /**
     * 非共享信息由参数传入
     * @param state
     */
    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("具体享元" + key + "被调用;");
        System.out.println("非享元信息是：" + state.getInfo());
    }
}
