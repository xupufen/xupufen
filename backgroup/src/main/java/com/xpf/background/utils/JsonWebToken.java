package com.xpf.background.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * jwt工具类
 */
@Slf4j
@Component
public class JsonWebToken {

    /**
     * 密钥
     */
    @Value("${jwt.security.key}")
    private String key;

    /**
     * 过期时间
     */
    @Value("${jwt.security.expired}")
    private Long expired;

    @Autowired
    private TimeFormat t;

    /**
     * 生成jwt
     */
    public  String CreateToken(Map<String, Object> create) {
       try{
           Algorithm algorithm = Algorithm.HMAC256(key);
           return JWT.create()
                   .withIssuer("徐朴芬")
                   .withIssuedAt(new Date())
                   .withExpiresAt(Instant.ofEpochSecond(expired))
                   .withClaim("name", String.valueOf(create.get("name")))
                   .withClaim("email", String.valueOf(create.get("email")))
                   .withClaim("user", String.valueOf(create.get("user")))
                   .withClaim("role", String.valueOf(create.get("role")))
                   .withClaim("id", String.valueOf(create.get("id")))
                   .withClaim("loginTime",String.valueOf(create.get("loginTime")))
                   .sign(algorithm);
       }catch (Exception e){
           log.error("生成失败!{}",e.getMessage());
           return null;
       }
    }

    /**
     * 解析token
     */
    public  Map<String,Object> verifyToken(String token) {
        try{
            Map<String ,Object> map = new HashMap<>();
            Algorithm algorithm = Algorithm.HMAC256(key);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("徐朴芬")
                    .build();

            DecodedJWT jwt = verifier.verify(token);
            map.put("name",jwt.getClaim("name").asString());
            map.put("email",jwt.getClaim("email").asString());
            map.put("user",jwt.getClaim("user").asString());
            map.put("id",jwt.getClaim("id").asString());
            map.put("role",jwt.getClaim("role").asString());
            map.put("loginTime",jwt.getClaim("loginTime").asString());
            return map;
        }catch (Exception e){
            log.error("解析token失败!{}",e.getMessage());
            return null;
        }
    }
}
