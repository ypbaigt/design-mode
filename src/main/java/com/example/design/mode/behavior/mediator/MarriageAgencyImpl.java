package com.example.design.mode.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者实现类
 */
public class MarriageAgencyImpl implements MarriageAgency{

    List<Person> personList = new ArrayList<>();

    @Override
    public void register(Person person) {
        personList.add(person);
    }

    @Override
    public void pair(Person person) {
        for (Person person1 : personList) {
            if (person1.age.equals(person.getRequestAge()) && person1.getSex() != person.getSex()) {
                System.out.println("将" + person.getName() + "与" + person1.getName() + "送入洞房！");
                break;
            }
        }
    }
}
