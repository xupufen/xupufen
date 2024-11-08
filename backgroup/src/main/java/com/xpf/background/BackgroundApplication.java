package com.xpf.background;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class BackgroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackgroundApplication.class, args);
        log.info("基于spring boot的旅游打开小程序后端启动");
    }
}
