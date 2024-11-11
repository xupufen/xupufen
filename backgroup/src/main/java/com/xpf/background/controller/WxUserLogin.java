package com.xpf.background.controller;

import com.xpf.background.service.Wx;
import com.xpf.background.utils.AjaxResource;
import com.xpf.background.vo.LoginObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@CrossOrigin(origins = "*")
@RestController
public class WxUserLogin {

    @Autowired
    private Wx w;

    @PostMapping(value = "/login")
    public AjaxResource<?> login(@RequestBody LoginObject obj){
        if (obj != null){
            Map<String,Object> m = w.login(obj.getUser(), obj.getPassword());
            return m==null?AjaxResource.error("登陆失败!"):AjaxResource.success("登陆成功",m.get("token"));
        }
        return AjaxResource.error("参数错误");
    }
}
