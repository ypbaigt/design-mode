package com.example.design.mode.behavior.memento;

/**
 * 一款编辑器
 */
public class Document {

    //不破坏封装前提，将对象属性私有
    // 当前书写内容
    private String content;

    public BackUp save() {
        return new BackUp(content);
    }

    public void resume(BackUp backUp) {
        content = backUp.content;
    }

    public void change(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}
