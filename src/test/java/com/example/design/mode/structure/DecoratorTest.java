package com.example.design.mode.structure;

import com.example.design.mode.structure.decorator.BoldDecorator;
import com.example.design.mode.structure.decorator.DelDecorator;
import com.example.design.mode.structure.decorator.SpanNode;
import com.example.design.mode.structure.decorator.TextNode;
import org.junit.Test;

/**
 * 装饰器模式
 * @Author ypbai
 * @create 2022/4/12 10:54
 */
public class DecoratorTest {

    @Test
    public void test1() {
        //原始对象
        TextNode spanNode = new SpanNode();
        //增强1
        TextNode boldNode = new BoldDecorator(new SpanNode());
        //装饰类的不同组合，达到任意增强效果
        TextNode delNode = new DelDecorator(new BoldDecorator(new SpanNode()));

        spanNode.setText("Hello");
        boldNode.setText("加粗");
        delNode.setText("删除");

        System.out.println(spanNode.getText());
        System.out.println(boldNode.getText());
        System.out.println(delNode.getText());
    }

}
