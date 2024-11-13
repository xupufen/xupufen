package com.xpf.background.mapper;

import com.xpf.background.domain.WxUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WxInfo {

    /**
     * 登录
     * @param user
     * @param password
     * @return WxUser
     */
    WxUser login(@Param("user") String user, @Param("password") String password);

    /**
     * 获取用户详细信息
     */
    WxUser getUser(@Param("id") Integer id);

    /**
     * 用户注册
     */
    boolean userRegister(WxUser user);
}
