package com.xpf.background.service;

import java.util.Map;

public interface Wx {
    Map<String,Object> login(String username, String password);
}
