package com.example.design.mode.structure.adapter;

import java.util.concurrent.Callable;

/**
 * 适配者
 * @Author ypbai
 * @create 2022/4/7 14:37
 */
public class Task implements Callable<Long> {

    private long num;

    public Task(long num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long r = 0;
        for (int i = 0; i < num; i++) {
            r += i;
            if (i % 100 == 0) {
                System.out.println(r);
            }
        }
        return r;
    }

}
