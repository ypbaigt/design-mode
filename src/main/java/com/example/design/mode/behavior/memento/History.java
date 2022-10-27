package com.example.design.mode.behavior.memento;

import java.util.Stack;

/**
 * 备忘录栈
 */
public class History {

    Stack<BackUp> backupStack = new Stack<>();

    public void add(BackUp backUp) {
        backupStack.add(backUp);
    }

    public BackUp getLastVersion() {
        return backupStack.pop();
    }
}
