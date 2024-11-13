package com.xpf.background.controller;

import com.xpf.background.service.Wx;
import com.xpf.background.utils.AjaxResource;
import com.xpf.background.vo.LoginObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static com.xpf.background.utils.AjaxResource.toAjax;

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
    public Map<String,Object> login(@RequestBody LoginObject obj){
        Map<String ,Object> map = new HashMap<>();
        if (obj != null){
            map.put("code",200L);
            map.put("msg","登陆成功");
            map.put("data",w.login(obj.getUser(), obj.getPassword()));
            map.put("token",w.login(obj.getUser(), obj.getPassword()).get("token"));
            return toAjax(map);
        }
        map.put("code",400);
        map.put("msg","登陆失败!");
        return toAjax(map);
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
    @GetMapping(value = "/info")
    public AjaxResource<?> info(Integer id){
        return AjaxResource.success(w.getUser(id));
    }
}
