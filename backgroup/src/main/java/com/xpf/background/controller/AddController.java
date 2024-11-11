package com.xpf.background.controller;

import com.xpf.background.utils.AjaxResource;
import com.xpf.background.utils.Anonymity;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xpf.background.mapper.addMapper;

@RestController
public class AddController {

    @Resource
    private addMapper add;

    /**
     * 获取所有地址
     * 旅游地址
     */
    @Anonymity
    @GetMapping(value = "/getAddress")
    public AjaxResource<?> address(){
        return AjaxResource.success(add.list());
    }
}
