package com.example.design.mode.structure.decorator;

/**
 * 抽象装饰
 * @Author ypbai
 * @create 2022/4/12 10:20
 */
public abstract class NodeDecorator implements TextNode{

    /**
     * final修饰，target经构造函数赋值后，其引用不会再变
     */
    protected final TextNode target;

    public NodeDecorator(TextNode target) {
        this.target = target;
    }

    @Override
    public void setText(String text) {
        this.target.setText(text);
    }

}
