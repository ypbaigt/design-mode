package com.example.design.mode.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 中间构件，有子节点
 * @Author ypbai
 * @create 2022/4/11 15:40
 */
public class Branch implements Component{

    private List<Component> list = new ArrayList<>();

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public Component get(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component component : list) {
            System.out.println("===========");
            component.operation();
        }
    }
}
