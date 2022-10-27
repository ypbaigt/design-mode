package com.example.design.mode.behavior.command;

/**
 * 接收者A（换台）
 * @Author ypbai
 * @create 2022/4/14 11:09
 */
public class ChangeChannelRecevier {

    private Integer num;

    public ChangeChannelRecevier(Integer num) {
        this.num = num;
    }

    public void action() {
        System.out.println("换第" + num + "号台。");
    }

}
