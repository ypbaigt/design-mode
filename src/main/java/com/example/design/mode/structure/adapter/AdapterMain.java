package com.example.design.mode.structure.adapter;

import java.util.concurrent.Callable;

/**
 * @Author ypbai
 * @create 2022/4/7 14:41
 */
public class AdapterMain {

    public static void main(String[] args) {
        //适配者接口
        Callable<Long> callable = new Task(5000L);
        //Thread构造函数可以接收runnable接口，但不接收callable接口，
        //创建RunnableAdapter适配器类，实现runnable接口，内部调用适配者接口方法，完成转换。
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
    }

}
