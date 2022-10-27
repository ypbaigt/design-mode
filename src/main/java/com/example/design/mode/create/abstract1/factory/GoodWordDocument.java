package com.example.design.mode.create.abstract1.factory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * goodDoc公司出品，实现了word
 * @Author ypbai
 * @create 2022/3/28 10:43
 */
public class GoodWordDocument implements WordDocument {
    @Override
    public void save(Path path) throws IOException {
        System.out.println("GoodWordDocument," + path);
    }
}
