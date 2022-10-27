package com.example.design.mode.structure.decorator;

/**
 * 具体构件
 * @Author ypbai
 * @create 2022/4/12 10:17
 */
public class SpanNode implements TextNode {

    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}
