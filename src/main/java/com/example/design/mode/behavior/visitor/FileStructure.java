package com.example.design.mode.behavior.visitor;

import java.io.File;
import java.util.List;

public class FileStructure {

    //根目录
    private File path;

    public FileStructure(File path) {
        this.path = path;
    }

    public void handle(Visitor visitor) {
        scan(this.path, visitor);
    }


    private void scan(File file, Visitor visitor) {
        if (file.isDirectory()) {
            //让访问者处理文件夹
            visitor.visitorDir(file);
            for (File sub : file.listFiles()) {
                //递归访问子文件夹
                scan(sub, visitor);
            }
        } else if (file.isFile()) {
            //让访问者访问文件
            visitor.visitorFile(file);
        }
    }

    /**
     * 如果不使用访问者模式，在算法内部，操作写死了
     * 如果要添加实现如 扫描删除.class文件 这样的功能 就没有办法复用算法结构体
     */
    /*void scan(File dir, List<File> collector) {
        for (File file : dir.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                collector.add(file);
            } else if (file.isDir()) {
                // 递归调用:
                scan(file, collector);
            }
        }
    }*/
}
