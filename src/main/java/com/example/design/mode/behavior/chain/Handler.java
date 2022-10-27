package com.example.design.mode.behavior.chain;

/**
 * 抽象处理行为
 * @Author ypbai
 * @create 2022/4/13 15:20
 */
public interface Handler {

    /**
     * true-成功；false-失败；null-交给下一个处理
     * @param request
     * @return
     */
    Boolean process(Request request);

}
