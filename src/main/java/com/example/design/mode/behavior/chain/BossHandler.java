package com.example.design.mode.behavior.chain;

/**
 * 大老板（具体处理者角色3）
 * @Author ypbai
 * @create 2022/4/13 15:31
 */
public class BossHandler implements Handler {

    @Override
    public Boolean process(Request request) {
        return true;
    }
}
