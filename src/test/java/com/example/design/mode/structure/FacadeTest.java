package com.example.design.mode.structure;

import cn.hutool.core.bean.BeanUtil;
import com.example.design.mode.structure.facade.Company;
import com.example.design.mode.structure.facade.Facade;
import org.junit.Test;

/**
 * 外观模式
 * @Author ypbai
 * @create 2022/4/12 14:54
 */
public class FacadeTest {

    @Test
    public void test1() {
        //client不关心开公司细节，相当于找了中介，给中介资料，细节由中介去办
        Company company = Facade.openCompany("to伟");
        System.out.println(BeanUtil.beanToMap(company));
    }


}
