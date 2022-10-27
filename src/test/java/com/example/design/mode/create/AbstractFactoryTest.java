package com.example.design.mode.create;

import com.example.design.mode.create.abstract1.factory.AbstractFactory;
import com.example.design.mode.create.abstract1.factory.FastFactory;
import com.example.design.mode.create.abstract1.factory.HtmlDocument;
import com.example.design.mode.create.abstract1.factory.WordDocument;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * 抽象工厂
 * @Author ypbai
 * @create 2022/3/28 10:56
 */
public class AbstractFactoryTest {

    /**
     * 有fast和good两家公司实现抽象工厂，new哪个就使用哪家公司产品
     * 实现将markdown文本转换成html或word保存
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {

        AbstractFactory fastFactory = new FastFactory();

        HtmlDocument html = fastFactory.createHtml("#Hello");
        html.save(Paths.get("d://javatest//fast.html"));

        WordDocument word = fastFactory.createWord("#Hello");
        word.save(Paths.get("d://javatest//fast.html"));
    }

    @Test
    public void test2() throws IOException {

        AbstractFactory fastFactory = AbstractFactory.createFactory("good");

        HtmlDocument html = fastFactory.createHtml("#Hello");
        html.save(Paths.get("d://javatest//fast.html"));

        WordDocument word = fastFactory.createWord("#Hello");
        word.save(Paths.get("d://javatest//fast.html"));
    }

}
