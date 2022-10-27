package com.example.design.mode.structure.bridge;

/**
 * 具象化角色
 * @Author ypbai
 * @create 2022/4/8 15:33
 */
public class HybridEngine implements Engine{

    @Override
    public void start() {
        System.out.println("start Hybrid engine...");
    }
}
