package com.xpf.background.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
@Slf4j
@ControllerAdvice
@Configuration
public class GlobalExceptionHandler extends Exception {

    @ExceptionHandler(value= Exception.class)
    @ResponseBody
    public ResponseEntity<Object> handleRuntimeException(Exception ex) {
        log.error("错误: {}",ex.getMessage());
        return ResponseEntity.ok().body(createErrorResponse(ex.getMessage()));
    }

    private Map<String, Object> createErrorResponse(String message) {
        Map<String, Object> response = new HashMap<>();
        response.put("code", 500);
        response.put("msg", message);
        return response;
    }
}
