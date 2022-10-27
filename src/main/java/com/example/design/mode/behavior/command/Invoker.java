package com.example.design.mode.behavior.command;

/**
 * 调用者（遥控器）
 * @Author ypbai
 * @create 2022/4/14 11:27
 */
public class Invoker {

    private Command command;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("遥控器执行命令..");
        command.execute();
    }

}
