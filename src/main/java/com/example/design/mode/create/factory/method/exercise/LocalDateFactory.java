package com.example.design.mode.create.factory.method.exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 抽象工厂 练习
 * @Author ypbai
 * @create 2022/3/25 14:00
 */
public class LocalDateFactory {

    public static LocalDate fromInt(int yyyyMMdd) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.parse(String.valueOf(yyyyMMdd), dtf);
    }

}
