package com.example.design.mode.structure.facade;

/**
 * 工商注册
 * @Author ypbai
 * @create 2022/4/12 14:30
 */
public class AdminOfIndustry {

    public Company register(String name) {
        Company company = new Company();
        company.setName(name);
        company.setId("12345678");
        return company;
    }

}
