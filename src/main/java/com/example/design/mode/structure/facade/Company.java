package com.example.design.mode.structure.facade;

import lombok.Data;

/**
 * 开公司
 * @Author ypbai
 * @create 2022/4/12 14:32
 */
@Data
public class Company {

    /**
     * 公司ID
     */
    private String id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 银行账户
     */
    private String bankAccount;

    /**
     * 纳税识别号
     */
    private String taxCode;
}
