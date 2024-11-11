package com.xpf.background.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 匿名注解
 * 允许匿名访问
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface Anonymity {
    boolean isAnonymity() default true;
}
