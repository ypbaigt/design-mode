package com.example.design.mode.behavior.chain;

/**
 * 中层管理者（具体处理者2）
 * @Author ypbai
 * @create 2022/4/13 15:31
 */
public class DirectorHandler implements Handler {

    @Override
    public Boolean process(Request request) {
        //大于10000就没有权限处理了
        if (request.getAmount().doubleValue() > 10000) {
            return null;
        }
        //lydia才批
        return "lydia".equalsIgnoreCase(request.getName());
    }
}
