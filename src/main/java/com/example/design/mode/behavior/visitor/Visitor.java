package com.example.design.mode.behavior.visitor;

import java.io.File;

/**
 * 定义访问接口，即访问者能干的事
 */
public interface Visitor {

    void visitorDir(File dir);

    void visitorFile(File file);

}
