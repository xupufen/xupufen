package com.xpf.background.service;

import com.xpf.background.domain.WxUser;

import java.util.Map;

public interface Wx {
    Map<String,Object> login(String username, String password);

    WxUser getUser(Integer id);

    boolean register(WxUser user);
}
