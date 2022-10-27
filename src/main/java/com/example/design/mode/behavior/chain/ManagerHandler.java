package com.example.design.mode.behavior.chain;


/**
 * 基层管理者（具体处理者1）
 * @Author ypbai
 * @create 2022/4/13 15:29
 */
public class ManagerHandler implements Handler{

    @Override
    public Boolean process(Request request) {
        //大于1000就没有权限处理了
        if (request.getAmount().doubleValue() > 1000) {
            return null;
        }
        //对Bob有意见
        return !"Bob".equalsIgnoreCase(request.getName());
    }
}
