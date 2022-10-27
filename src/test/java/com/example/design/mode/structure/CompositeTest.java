package com.example.design.mode.structure;

import com.example.design.mode.structure.composite.Branch;
import com.example.design.mode.structure.composite.Component;
import com.example.design.mode.structure.composite.Leaf;
import org.junit.Test;

/**
 * 组合模式
 * @Author ypbai
 * @create 2022/4/11 15:55
 */
public class CompositeTest {

    @Test
    public void test1() {
        //创建根(根和树枝是一个结构)
        Branch root = new Branch();
        //创建树枝1
        Branch branchh1 = new Branch();
        //创建3个叶子节点
        Leaf leaf1 = new Leaf("叶子1");
        Leaf leaf2 = new Leaf("叶子2");
        Leaf leaf3 = new Leaf("叶子3");
        //根下面有叶子1 和 树枝1
        root.add(leaf1);
        root.add(branchh1);
        //树枝1下面有2个叶子
        branchh1.add(leaf2);
        branchh1.add(leaf3);
        //打印树形叶子节点
        root.operation();
    }

}
