package com.example.design.mode.behavior.mediator;

import org.junit.Test;

/**
 * 中介者模式
 */
public class MediatorTest {

    @Test
    public void test1() {

        //定义中介者
        MarriageAgency marriageAgency = new MarriageAgencyImpl();

        //参与嘉宾
        Person Giao桑 = new Person("Giao桑", 18, Sex.MALE, 18, marriageAgency);
        Person 杨幂 = new Person("杨幂", 18, Sex.FEMALE, 20, marriageAgency);
        Person 杨颖 = new Person("杨颖", 30, Sex.FEMALE, 30, marriageAgency);
        Person 杨过 = new Person("杨过", 40, Sex.MALE, 45, marriageAgency);

        //注册到中介者
        marriageAgency.register(Giao桑);
        marriageAgency.register(杨幂);
        marriageAgency.register(杨颖);
        marriageAgency.register(杨过);

        //传入请求者，进行配对
        marriageAgency.pair(Giao桑);
    }

}
