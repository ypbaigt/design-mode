package com.example.design.mode.behavior;

import com.example.design.mode.behavior.chain.*;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 责任链模式
 * @Author ypbai
 * @create 2022/4/13 16:06
 */
public class ChainTest {

    @Test
    public void test1() {
        HandlerChain chain = new HandlerChain();

        //要按照业务逻辑顺序构造责任链
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new BossHandler());

        //处理请求
        chain.process(new Request("zhangsan", new BigDecimal(500)));
        chain.process(new Request("bob", new BigDecimal(500)));
        chain.process(new Request("lisi", new BigDecimal(8000)));
        chain.process(new Request("lydia", new BigDecimal(8000)));
        chain.process(new Request("王五", new BigDecimal(1000000)));
    }

}
