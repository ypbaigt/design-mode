package com.example.design.mode.structure.composite;

/**
 * 叶节点对象
 * @Author ypbai
 * @create 2022/4/11 15:33
 */
public class Leaf implements Component{

    private String name;
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + "被访问。");
    }
}
