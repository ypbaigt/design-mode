package com.example.design.mode.create.abstract1.factory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * 抽象产品
 * @Author ypbai
 * @create 2022/3/28 10:20
 */
public interface WordDocument {
    void save(Path path) throws IOException;
}
