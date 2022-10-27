package com.example.design.mode.behavior.state;

/**
 * 状态接口
 * 如QQ聊天有几种状态，上线、离线、忙碌、断开，不同状态下的行为表现不同
 */
public interface State {

    //初始化
    String init();

    //回复
    String reply(String input);

}
