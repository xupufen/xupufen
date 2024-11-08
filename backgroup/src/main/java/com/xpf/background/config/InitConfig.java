package com.xpf.background.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.File;

/**
 * 初始化项目进程
 */
@Slf4j
@Configuration
public class InitConfig {

    @Value("${project.upload}")
    private String upload;

    /**
     * 创建项目所需文件夹
     */
    @PostConstruct
    public void initFileUrl() {
        File file = new File(upload);
        File avatar = new File(upload + "avatar");
        File f = new File(upload + "file");
        if (!file.exists()) {
            try {
                log.info("创建开始{}",file.mkdirs());
            }catch (Exception e) {
                log.error("项目文件夹创建失败{}",e.getMessage());
            }
        }
    }
}
