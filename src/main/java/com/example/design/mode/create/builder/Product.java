package com.example.design.mode.create.builder;


/**
 * 具体产品
 * @Author ypbai
 * @create 2022/3/31 15:24
 */
public class Product {

    private String partA;

    private String partB;

    private String partC;

    public void show() {
        //显示产品的特性
        System.out.println(partA + "\t" + partB + "\t" + partC);
    }


    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
