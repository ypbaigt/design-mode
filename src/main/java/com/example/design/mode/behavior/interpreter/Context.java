package com.example.design.mode.behavior.interpreter;

/**
 * 环境角色
 * @Author ypbai
 * @create 2022/4/14 17:27
 */
public class Context {

    private String[] citys = {"郑州", "广州"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private Expression cityPerson;

    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String info) {
        boolean ok = cityPerson.interpreter(info);
        if (ok) {
            System.out.println("您是" + info + "，乘车免费。");
        } else {
            System.out.println(info + "您不免费。");
        }
    }
}
