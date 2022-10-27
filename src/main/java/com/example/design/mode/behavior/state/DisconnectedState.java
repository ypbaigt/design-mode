package com.example.design.mode.behavior.state;

/**
 * 断开连接时状态
 */
public class DisconnectedState implements State {
    @Override
    public String init() {
        return "Bye!";
    }

    @Override
    public String reply(String input) {
        return "";
    }
}
