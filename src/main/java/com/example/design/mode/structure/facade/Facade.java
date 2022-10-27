package com.example.design.mode.structure.facade;

/**
 * 外观
 * 高层接口-中介
 * @Author ypbai
 * @create 2022/4/12 14:41
 */
public class Facade {

    /**
     * 我们以注册公司为例，假设注册公司需要三步：
     * 1.向工商局申请公司营业执照；
     * 2.在银行开设账户；
     * 3.在税务局开设纳税号。
     * @param companyName
     * @return
     */
    public static Company openCompany(String companyName) {

        Company company = new AdminOfIndustry().register(companyName);

        String account = new Bank().openAccount(company.getId());
        String applyTaxCode = new Taxation().applyTaxCode(company.getId());

        company.setBankAccount(account);
        company.setTaxCode(applyTaxCode);

        return company;
    }

}
