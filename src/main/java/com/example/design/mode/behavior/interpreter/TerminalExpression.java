package com.example.design.mode.behavior.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式
 * @Author ypbai
 * @create 2022/4/14 17:10
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpreter(String info) {
        return set.contains(info);
    }
}
