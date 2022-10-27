package com.example.design.mode.behavior.command;

/**
 * 具体命令B（九宫格播放）
 * @Author ypbai
 * @create 2022/4/14 11:07
 */
public class NinePalaceGridCommand implements Command{

    private NinePalaceGridRecevier recevier;

    public NinePalaceGridCommand() {
        recevier = new NinePalaceGridRecevier();
    }

    @Override
    public void execute() {
        recevier.action();
    }
}
