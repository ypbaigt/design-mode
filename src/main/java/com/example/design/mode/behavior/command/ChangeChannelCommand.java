package com.example.design.mode.behavior.command;

/**
 * 具体命令A（换台）
 * @Author ypbai
 * @create 2022/4/14 11:07
 */
public class ChangeChannelCommand implements Command{

    private ChangeChannelRecevier recevier;

    public ChangeChannelCommand(Integer num) {
        recevier = new ChangeChannelRecevier(num);
    }

    @Override
    public void execute() {
        recevier.action();
    }
}
