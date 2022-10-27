package com.example.design.mode.behavior;

import com.example.design.mode.behavior.state.BotContent;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Scanner;

/**
 * 状态模式
 * 需要用main方法测试，junit Test不支持scanner.nextLine() 读写;
 */
public class StateTest {

    @Test
    public void test1() {
        Scanner scanner = new Scanner(System.in);
        BotContent botContent = new BotContent();
        for (; ; ) {
            System.out.println("> ");
            String input = scanner.nextLine();
            String output = botContent.chat(input);
            System.out.println(StringUtils.isEmpty(output) ? "(no reply)" : output);
        }
    }

    @Test
    public void test2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> ");
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
