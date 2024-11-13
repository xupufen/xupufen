package com.xpf.background.service.impl;

import com.xpf.background.domain.WxUser;
import com.xpf.background.mapper.WxInfo;
import com.xpf.background.service.Wx;
import com.xpf.background.utils.JsonWebToken;
import com.xpf.background.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.xpf.background.utils.TimeFormat;

@Service
@Slf4j
public class WxImpl implements Wx {

    @Autowired
    private WxInfo wxInfo;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private JsonWebToken jsonWebToken;

    /**
     * 生成token
     * 并且计入redis
     */
    @Override
    public Map<String ,Object> login(String username, String password) {
        try {
            WxUser w = wxInfo.login(username,password);
            if (w != null) {
                Map<String ,Object> map = new HashMap<>();
                map.put("id",w.getId());
                map.put("name",w.getName());
                map.put("email",w.getEmail());
                map.put("user",w.getUser());
                map.put("avatar",w.getAvatar());
                map.put("role",w.getRole());
                map.put("loginTime",new Date());
                map.put("token",jsonWebToken.CreateToken(map));
                redisUtil.set(jsonWebToken.CreateToken(map),TimeFormat.formatToChinaTimeString(new Date().toString()));
                log.info("用户: {}登录系统,登陆时间: {}",w.getName(),TimeFormat.formatToChinaTimeString(new Date().toString()));
                return map;
            }
            log.error("用户{}登录失败!",username);
            return null;
        }catch (Exception e) {
            log.error("错误原因{}",e.getMessage());
            return null;
        }
    }

    @Override
    public WxUser getUser(Integer id) {
        return wxInfo.getUser(id);
    }

    @Override
    public boolean register(WxUser user) {
        return wxInfo.userRegister(user);
    }
}
