package com.xpf.background.vo;

import lombok.Data;

/**
 * 登陆对象
 */
@Data
public class LoginObject {
    private String user;
    private String password;
    private String code;
    private String uuid;
}
