package com.example.design.mode.create.abstract1.factory;

/**
 * GoodDoc 公司来生产抽象工厂产品
 * @Author ypbai
 * @create 2022/3/28 10:47
 */
public class GoodFactory implements AbstractFactory{

    @Override
    public HtmlDocument createHtml(String markdown) {
        return new GoodHtmlDocument();
    }

    @Override
    public WordDocument createWord(String markdown) {
        return new GoodWordDocument();
    }
}
