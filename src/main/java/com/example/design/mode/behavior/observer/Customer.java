package com.example.design.mode.behavior.observer;

/**
 * 消费者
 */
public class Customer implements ProductObserver {

    @Override
    public void onPublished(Product product) {
        System.out.println("消费者接收到商品信息变更：" + product);
    }
}
