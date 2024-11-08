package com.xpf.background.mapper;

import com.xpf.background.domain.WxUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WxLogin {

    /**
     * 登录
     * @param user
     * @param password
     * @return WxUser
     */
    WxUser login(@Param("user") String user, @Param("password") String password);
}
