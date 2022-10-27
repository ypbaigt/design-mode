package com.example.design.mode.behavior.state;

/**
 * 聊天机器人
 * 封装状态转换规则
 */
public class BotContent {

    //默认状态
    private State state = new DisconnectedState();

    public String chat(String input) {
        if ("hello".equals(input)) {
            state = new ConnectedState();
            return state.init();
        }
        if ("bye".equals(input)) {
            state = new DisconnectedState();
            return state.init();
        }
        //以当前上下文的状态进行回复
        return state.reply(input);
    }

}
