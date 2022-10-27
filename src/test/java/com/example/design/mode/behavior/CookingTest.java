package com.example.design.mode.behavior;

import com.example.design.mode.behavior.template.Cooking;
import com.example.design.mode.behavior.template.CookingFood;
import org.junit.Test;

/**
 * 模板方法模式
 */
public class CookingTest {

    @Test
    public void test1() {
        Cooking cooking = new CookingFood();
        cooking.cook();
    }

}
