package com.example.design.mode.create.abstract1.factory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * goodDoc公司出品，实现了了html
 * @Author ypbai
 * @create 2022/3/28 10:40
 */
public class GoodHtmlDocument implements HtmlDocument{
    @Override
    public String toHtml() {
        return "GoodHtmlDocument..toHtml";
    }

    @Override
    public void save(Path path) throws IOException {
        System.out.println("GoodHtmlDocument..." + path.toString());
    }
}
