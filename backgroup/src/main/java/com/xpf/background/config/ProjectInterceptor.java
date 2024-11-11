package com.xpf.background.config;

import com.xpf.background.utils.Anonymity;
import com.xpf.background.utils.JsonWebToken;
import com.xpf.background.utils.RedisUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Method;


@Slf4j
@Component
public class ProjectInterceptor implements HandlerInterceptor {

    @Resource
    private JsonWebToken jsonWebToken;

    @Resource
    private RedisUtil r;

    @Override
    public boolean preHandle(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) throws Exception {
        try {
            if (handler instanceof HandlerMethod handlerMethod) {
                Method method = handlerMethod.getMethod();
                Anonymity anonymity = method.getAnnotation(Anonymity.class);
                if (anonymity != null && anonymity.isAnonymity()) {
                    return true;
                }
            }
            if (request.getHeader("Authorization") == null || request.getHeader("Authorization").isEmpty()) {
                return isNotAnonymity(response);
            }

            if (jsonWebToken.verifyToken(request.getHeader("Authorization")) == null) {
                return isNotAnonymity(response);
            } else {
                return r.isKey(request.getHeader("Authorization"));
            }
        }catch (Exception e){
            log.error("请求拦截器处捕获错误: {}",e.getMessage());
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            response.getWriter().write("""
                {
                    "code":500,
                    "msg":"系统错误"
                }""");
            return false;
        }
    }

    private boolean isNotAnonymity(HttpServletResponse res) throws IOException {
        res.setCharacterEncoding("UTF-8");
        res.setContentType("application/json");
        res.getWriter().write("""
                {
                    "code":500,
                    "msg":"身份验证失败，禁止访问系统资源"
                }""");
        return false;
    }
}
