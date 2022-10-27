package com.example.design.mode.create.builder;


import java.util.Map;

/**
 * 当产品实现只有一种，省去抽象建造者和指挥者
 * @Author ypbai
 * @create 2022/3/31 14:05
 */
public class URLBuilder {

    private String domain;

    private String scheme;

    private String path;

    private Map query;

    public static URLBuilder builder() {
        return new URLBuilder();
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.scheme).append("://")
                .append(domain)
                .append(path).append("?");
        query.forEach((k,v) -> {
            sb.append(k).append("=").append(v);
            sb.append("&");
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public URLBuilder domain(String domain) {
        this.domain = domain;
        return this;
    }

    public URLBuilder scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public URLBuilder path(String path) {
        this.path = path;
        return this;
    }

    public URLBuilder query(Map query) {
        this.query = query;
        return this;
    }
}
