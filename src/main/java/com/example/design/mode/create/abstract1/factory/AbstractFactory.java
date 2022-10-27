package com.example.design.mode.create.abstract1.factory;

/**
 * 抽象工厂 中 有多个抽象产品
 * @Author ypbai
 * @create 2022/3/28 10:18
 */
public interface AbstractFactory {

    HtmlDocument createHtml(String markdown);

    WordDocument createWord(String markdown);

    /**
     * 静态方法，客户端无需显示new
     * @param name
     * @return
     */
    static AbstractFactory createFactory(String name) {
        if ("fast".equals(name)) {
            return new FastFactory();
        } else if ("good".equals(name)) {
            return new GoodFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }
}
