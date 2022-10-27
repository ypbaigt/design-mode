package com.example.design.mode.create;

import com.example.design.mode.create.builder.*;
import org.assertj.core.util.Maps;
import org.junit.Test;

/**
 * 建造者（生成器）
 * @Author ypbai
 * @create 2022/3/31 14:38
 */
public class BuilderTest {

    @Test
    public void test1() {
        String url = URLBuilder.builder()
                .domain("www.baidu.com")
                .scheme("https")
                .path("/")
                .query(Maps.newHashMap("name", "zhangsan"))
                .build();
        //https://www.baidu.com/?name=zhangsan
        System.out.println(url);
    }

    @Test
    public void test2() {
        //选择一个部件具体实现者
        Builder builder = new ConcreteBuilder();
        //将各个实现好的部件传给指挥者
        Director director = new Director(builder);
        //指挥者拿部件来组装，不同组装顺序可能带来不同的结果
        Product product = director.construct();
        //成品展示
        product.show();
    }
}
