package com.example.design.mode.behavior.observer;

/**
 * 管理员
 */
public class Admin implements ProductObserver {
    @Override
    public void onPublished(Product product) {
        System.out.println("admin接收到商品信息变更" + product);
    }
}
