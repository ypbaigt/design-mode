package com.example.design.mode.behavior.mediator;

import lombok.Data;

/**
 * 组件，参与者
 */
@Data
public class Person {

    String name;

    Integer age;

    Sex sex;

    // 要求对象的年龄
    Integer requestAge;

    //婚姻中介
    MarriageAgency marriageAgency;

    public Person(String name, Integer age, Sex sex, Integer requestAge, MarriageAgency marriageAgency) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.marriageAgency = marriageAgency;
    }

    public void findPartner() {
        marriageAgency.register(this);
    }
}

enum Sex {
    MALE, FEMALE;
}