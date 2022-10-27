package com.example.design.mode.behavior.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 统一入口处理
 * @Author ypbai
 * @create 2022/4/13 15:45
 */
public class HandlerChain {

    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public boolean process(Request request) {
        for (Handler handler : handlers) {
            Boolean result = handler.process(request);
            //result == null时 要流转下一个处理
            if (result != null) {
                System.out.println(request.getName() + " " + (result ? "approved" : "denied") + " by " +
                        handler.getClass().getSimpleName());
                return result;
            }
        }
        throw new RuntimeException("无法处理该请求！");
    }

}
