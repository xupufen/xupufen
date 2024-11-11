package com.xpf.background.config;

import com.xpf.background.utils.AjaxResource;
import com.xpf.background.utils.Anonymity;
import com.xpf.background.utils.JsonWebToken;
import com.xpf.background.utils.RedisUtil;
import jakarta.annotation.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

@Slf4j
@Component
public class ProjectInterceptor implements HandlerInterceptor {

    @Resource
    private JsonWebToken jsonWebToken;

    @Resource
    private RedisUtil r;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public boolean preHandle(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) throws Exception {
        if (handler instanceof HandlerMethod handlerMethod) {
            Method method = handlerMethod.getMethod();
            Anonymity anonymity = AnnotationUtils.findAnnotation(method, Anonymity.class);
            if (anonymity != null) {
                return anonymity.isAnonymity();
            }

            Class<?> beanType = handlerMethod.getBeanType();
            anonymity = AnnotationUtils.findAnnotation(beanType, Anonymity.class);
            if (anonymity != null) {
                return anonymity.isAnonymity();
            }
        }

        String authorizationHeader = request.getHeader("Authorization");
        if (authorizationHeader == null) {
            return sendErrorResponse(response, "未携带身份参数，禁止访问");
        }

        Map<String, Object> m = jsonWebToken.verifyToken(authorizationHeader);
        if (m == null) {
            return sendErrorResponse(response, "无效的身份参数，禁止访问");
        } else {
            if(r.isKey(request.getHeader("Authorization"))){
                return true;
            }else {
                return sendErrorResponse(response,"身份验证失败,禁止访问系统资源");
            }
        }
    }

    private boolean sendErrorResponse(HttpServletResponse response, String message) throws IOException {
       try {
           response.setContentType("application/json");
           response.setCharacterEncoding("utf-8");
           objectMapper.writeValue(response.getWriter(), AjaxResource.success(500L, message));
           return false;
       }catch (Exception e){
           log.error(e.getMessage());
           return false;
       }
    }
}
