package com.xpf.background.domain;

import lombok.Data;
import java.util.Date;

/**
 * 用户信息表
 * wx_user
 */
@Data
public class WxUser {
    /**
     * id
     */
    private Integer id;

    /**
     * 账号
     */
    private String user;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private String sex;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 角色
     */
    private String role;

    /**
     * 姓名
     */
    private String name;
}