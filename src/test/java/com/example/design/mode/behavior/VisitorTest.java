package com.example.design.mode.behavior;

import com.example.design.mode.behavior.visitor.ClassFileVisitor;
import com.example.design.mode.behavior.visitor.FileStructure;
import com.example.design.mode.behavior.visitor.JavaFileVisitor;
import org.junit.Test;

import java.io.File;

/**
 * 访问者模式
 */
public class VisitorTest {

    /**
     * 扫描java文件
     */
    @Test
    public void test1() {
        FileStructure fileStructure = new FileStructure(new File("."));
        fileStructure.handle(new JavaFileVisitor());
    }

    /**
     * 清理class文件
     */
    @Test
    public void test2() {
        FileStructure fileStructure = new FileStructure(new File("."));
        fileStructure.handle(new ClassFileVisitor());
    }
}
