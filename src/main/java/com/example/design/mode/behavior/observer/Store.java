package com.example.design.mode.behavior.observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商场
 */
public class Store {

    private List<ProductObserver> observerList = new ArrayList<>();
    private Map<String, Product> products = new HashMap<>();

    //注册观察者
    public void addObserver(ProductObserver observer) {
        observerList.add(observer);
    }

    //移除观察者
    public void removeObserver(ProductObserver observer) {
        observerList.remove(observer);
    }

    //新增商品
    public void addProduct(String name, double price) {
        Product product = new Product(name, new BigDecimal(price));
        products.put(product.getName(), product);
        //通知所有观察者
        observerList.forEach(o -> o.onPublished(product));
    }

    //商品变价
    public void setProductPrice(String name, double price) {
        Product product = products.get(name);
        product.setPrice(new BigDecimal(price));
        observerList.forEach(o -> o.onPublished(product));
    }
}
