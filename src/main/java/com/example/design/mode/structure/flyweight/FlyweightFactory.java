package com.example.design.mode.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色（带有缓存功能）
 * @Author ypbai
 * @create 2022/4/12 16:33
 */
public class FlyweightFactory {

    private static final Map<String, Flyweight> flyweightMap = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已存在，成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key, flyweight);
        }
        return flyweight;
    }

}
