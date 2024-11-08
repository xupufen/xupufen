package com.xpf.background.service.impl;

import com.xpf.background.domain.WxUser;
import com.xpf.background.mapper.WxLogin;
import com.xpf.background.service.Wx;
import com.xpf.background.utils.JsonWebToken;
import com.xpf.background.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class WxImpl implements Wx {

    @Autowired
    private WxLogin wxLogin;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private JsonWebToken jsonWebToken;

    /**
     * 生成token
     * 并且计入redis
     * @param username
     * @param password
     * @return
     */
    @Override
    public Map<String ,Object> login(String username, String password) {
        try {
            WxUser w = wxLogin.login(username,password);
            String token;
            if (w != null) {
                Map<String ,Object> map = new HashMap<>();
                map.put("name",w.getName());
                map.put("email",w.getEmail());
                map.put("user",w.getUser());
                map.put("role",w.getRole());
                map.put("loginTime",new Date());
                token = jsonWebToken.CreateToken(map);
                Map<String,Object> m = new HashMap<>();
                m.put("token",token);
                redisUtil.set("User:"+token,new Date());
                log.info("用户{}登录系统,登陆时间{}",w.getName(),new Date());
                return m;
            }
            log.error("用户{}登录失败!",username);
            return null;
        }catch (Exception e) {
            log.error("错误原因{}",e.getMessage());
            return null;
        }
    }
}
