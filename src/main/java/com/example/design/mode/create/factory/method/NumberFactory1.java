package com.example.design.mode.create.factory.method;

import java.math.BigDecimal;

/**
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1281319170474017
 * 静态工厂方法，是对抽象工厂的简化
 * @Author ypbai
 * @create 2022/3/25 10:30
 */
public class NumberFactory1 {

    /**
     * 省去了抽象工厂接口、工厂实现类，工厂自身实现抽象产品，同样调用者无需知道实现细节
     * @param s
     * @return
     */
    public static Number parse(String s) {
        return new BigDecimal(s);
    }

}
