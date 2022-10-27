package com.example.design.mode.behavior;

import com.example.design.mode.behavior.observer.Admin;
import com.example.design.mode.behavior.observer.Customer;
import com.example.design.mode.behavior.observer.Store;
import org.junit.Test;

/**
 * 观察者模式
 */
public class ObserverTest {

    @Test
    public void test1() {
        //observer
        Customer customer = new Customer();
        Admin admin = new Admin();

        //store
        Store store = new Store();
        store.addObserver(customer);
        store.addObserver(admin);

        //触发
        store.addProduct("辣条", 1);
        store.setProductPrice("辣条", 0.05);
    }

}
