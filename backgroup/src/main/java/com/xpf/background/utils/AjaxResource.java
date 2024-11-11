package com.xpf.background.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;


@Setter
@Getter
@ToString
public class AjaxResource<T>{
    private Long code;
    private String msg;
    private T data;

    public static <T> AjaxResource<?> success(String msg) {
        return new AjaxResource<>(200L,msg,null);
    }

    public static <T> AjaxResource<?> success(T data) {
        return new AjaxResource<>(200L,"操作成功",data);
    }

    public static <T> AjaxResource<?> success(String msg, T data) {
        return new AjaxResource<>(200L,msg, data);
    }

    public static <T> AjaxResource<?> success(Long code, String msg) {
        return new AjaxResource<>(code, msg);
    }

    public static <T> AjaxResource<?> success(Long code, String msg, T data) {
        return new AjaxResource<>(code, msg, data);
    }

    public static <T> AjaxResource<?> error(String msg) {
        return new AjaxResource<>(500L,msg,null);
    }

    public static <T> AjaxResource<?> error(T data) {
        return new AjaxResource<>(200L,"操作失败!",data);
    }

    public static <T> AjaxResource<?> error(String msg, T data) {
        return new AjaxResource<>(500L,msg, data);
    }

    public static <T> AjaxResource<?> error(Long code, String msg) {
        return new AjaxResource<>(code, msg,null);
    }

    public static <T> AjaxResource<?> error(Long code, String msg, T data) {
        return new AjaxResource<>(code, msg, data);
    }

    public AjaxResource(Long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public AjaxResource(Long code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
