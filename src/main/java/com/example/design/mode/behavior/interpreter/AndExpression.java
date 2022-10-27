package com.example.design.mode.behavior.interpreter;

/**
 * 非终结符表达式
 * @Author ypbai
 * @create 2022/4/14 17:19
 */
public class AndExpression implements Expression{

    private Expression cityExpression;
    private Expression personExpression;

    public AndExpression(Expression city, Expression person) {
        this.cityExpression = city;
        this.personExpression = person;
    }

    @Override
    public boolean interpreter(String info) {
        String[] s = info.split("的");
        String city = s[0];
        String person = s[1];
        return cityExpression.interpreter(city) && personExpression.interpreter(person);
    }
}
