package com.example.design.mode.structure.decorator;

/**
 * 具体装饰
 * @Author ypbai
 * @create 2022/4/12 10:27
 */
public class BoldDecorator extends NodeDecorator {

    public BoldDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }
}
