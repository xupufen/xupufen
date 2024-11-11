package com.xpf.background.domain;

import lombok.Data;

@Data
public class Address {
    /**
     * id
     */
    private int id;

    /**
     * 省份
     */
    private String address;

    /**
     * 邮政编码
     */
    private String code;

    /**
     * 旅游景点
     */
    private String info;

    /**
     * 市区
     */
    private String city;
}
