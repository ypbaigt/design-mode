package com.example.design.mode.behavior;

import com.example.design.mode.behavior.command.ChangeChannelCommand;
import com.example.design.mode.behavior.command.Command;
import com.example.design.mode.behavior.command.Invoker;
import com.example.design.mode.behavior.command.NinePalaceGridCommand;
import org.junit.Test;

/**
 * 命令模式
 * @Author ypbai
 * @create 2022/4/14 11:32
 */
public class CommandTest {

    @Test
    public void test1() {

        //拿到遥控器
        Invoker ir = new Invoker();

        //用户要换中央1台
        Command command = new ChangeChannelCommand(1);
        ir.setCommand(command);
        //遥控器发送指令
        ir.call();

        //用户要九宫格播放
        Command command1 = new NinePalaceGridCommand();
        ir.setCommand(command1);
        //遥控器发送指令
        ir.call();
    }

}
