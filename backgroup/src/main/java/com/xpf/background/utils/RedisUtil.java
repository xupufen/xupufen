package com.xpf.background.utils;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis封装
 */
@Component
@Slf4j
public class RedisUtil {

    @Resource
    private RedisTemplate<String ,Object> redisTemplate;

    @Value("${spring.data.redis.host}")
    static String host;

    @Value("${spring.data.redis.connect-timeout}")
    static int connectTimeout;

    @Value("${spring.data.redis.port}")
    static int port;

    @Value("${spring.data.redis.password}")
    static String password;

    /**
     * 判断键是否存在
     */
    public boolean isKey(String key) {
        if (key.isEmpty()){
            return false;
        }
        return Boolean.TRUE.equals(redisTemplate.hasKey(key));
    }

    /**
     *存入键值对
     */
    public boolean set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
        return true;
    }

    /**
     * 取出键值对
     */
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
