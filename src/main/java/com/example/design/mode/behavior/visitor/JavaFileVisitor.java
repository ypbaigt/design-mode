package com.example.design.mode.behavior.visitor;

import java.io.File;

public class JavaFileVisitor implements Visitor {
    @Override
    public void visitorDir(File dir) {
        System.out.println("visitor dir:" + dir);
    }

    @Override
    public void visitorFile(File file) {
        if (file.getName().endsWith(".java")) {
            System.out.println("found java file" + file);
        }
    }
}
