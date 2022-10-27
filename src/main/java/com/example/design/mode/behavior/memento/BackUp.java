package com.example.design.mode.behavior.memento;

/**
 * 备忘录类
 */
public class BackUp implements Memento{

    String content;

    public BackUp(String content) {
        this.content = content;
    }

}
