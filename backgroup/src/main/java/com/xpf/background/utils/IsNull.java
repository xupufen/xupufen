package com.xpf.background.utils;

import org.springframework.stereotype.Component;

/**
 * 返回是否为空
 */
@Component
public class IsNull {
    public static boolean isNull(Object i) {
        return i == null;
    }
}
