package com.example.design.mode.structure;

import com.example.design.mode.structure.proxy.Proxy;
import org.junit.Test;

/**
 * 代理模式
 * @Author ypbai
 * @create 2022/4/13 11:10
 */
public class ProxyTest {

    @Test
    public void test1() {
        //通过代理对象访问真实请求
        Proxy proxy = new Proxy();
        proxy.request();
    }

}
