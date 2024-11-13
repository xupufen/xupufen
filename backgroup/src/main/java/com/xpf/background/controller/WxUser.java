package com.xpf.background.controller;

import com.xpf.background.service.Wx;
import com.xpf.background.utils.AjaxResource;
import com.xpf.background.vo.LoginObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@CrossOrigin(origins = "*")
@RestController
public class WxUser {

    @Autowired
    private Wx w;

    /**
     * 用户登录
     * @param obj
     * @return Map
     */
    @PostMapping(value = "/login")
    public AjaxResource<?> login(@RequestBody LoginObject obj){
        if (obj != null){
            Map<String,Object> m = w.login(obj.getUser(), obj.getPassword());
            return m==null?AjaxResource.error("登陆失败!"):AjaxResource.success("登陆成功",m.get("token"));
        }
        return AjaxResource.error("参数错误");
    }

    /**
     * 用户注册
     * @param user
     * @return boolean
     */
    @PostMapping(value = "/register")
    public AjaxResource<?> register(@RequestBody com.xpf.background.domain.WxUser user){
        return w.register(user)?AjaxResource.success("用户注册成功"):AjaxResource.error("用户注册失败");
    }

    /**
     * 获取用户信息
     * @param id
     * @return WxUser
     */
    @GetMapping(value = "info")
    public AjaxResource<?> info(Integer id){
        return AjaxResource.success(w.getUser(id));
    }
}
