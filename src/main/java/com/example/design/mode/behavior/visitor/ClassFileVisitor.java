package com.example.design.mode.behavior.visitor;

import java.io.File;

public class ClassFileVisitor implements Visitor {
    @Override
    public void visitorDir(File dir) {
    }

    @Override
    public void visitorFile(File file) {
        if (file.getName().endsWith(".class")) {
            System.out.println("Will clean class file" + file);
        }
    }
}
