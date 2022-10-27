package com.example.design.mode.behavior.state;

import org.springframework.util.StringUtils;

import java.util.Scanner;

/**
 * 状态模式
 */
public class MainTest {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BotContent botContent = new BotContent();
        for (; ; ) {
            System.out.print("> ");
            String input = scanner.nextLine();
            String output = botContent.chat(input);
            System.out.println(StringUtils.isEmpty(output) ? "(no reply)" : "< " + output);
        }
    }

}
