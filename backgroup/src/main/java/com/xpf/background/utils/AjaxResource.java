package com.xpf.background.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class AjaxResource<T> extends HashMap<String, Object> {
    private Long code;
    private String msg;
    private T data;


    public AjaxResource() {
        this.code = 200L;
        this.msg = "操作成功";
        this.data = null;
    }

    public static <T> AjaxResource<T> success() {
        return new AjaxResource<>();
    }

    public static <T> AjaxResource<T> success(String msg) {
        AjaxResource<T> r = new AjaxResource<>();
        r.setMsg(msg);
        return r;
    }

    public static <T> AjaxResource<T> success(T data) {
        AjaxResource<T> r = new AjaxResource<>();
        r.setData(data);
        return r;
    }

    public static <T> AjaxResource<T> success(String msg, T data) {
        AjaxResource<T> r = new AjaxResource<>();
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static <T> AjaxResource<T> error(String msg) {
        AjaxResource<T> r = new AjaxResource<>();
        r.setCode(500L);
        r.setMsg(msg);
        return r;
    }

    public static <T> AjaxResource<T> error(String msg, T data) {
        AjaxResource<T> r = new AjaxResource<>();
        r.setCode(500L);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
