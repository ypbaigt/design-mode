package com.example.design.mode.structure.adapter;

import java.util.concurrent.Callable;

/**
 * 适配器
 * @Author ypbai
 * @create 2022/4/7 14:47
 */
public class RunnableAdapter implements Runnable{

    /**
     * 持有接口而非具体对象 （依赖倒置原则）
     */
    private Callable callable;

    public RunnableAdapter(Callable callable) {
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            Object result = callable.call();
            System.out.println("result:" + result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
