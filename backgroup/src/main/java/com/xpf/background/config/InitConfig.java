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

    @PostConstruct
    public void initFileUrl() {
        File file = new File(upload);
        if (!file.exists()) {
            try {
                if (file.mkdirs()) {
                    log.info("项目文件夹创建成功");
                } else {
                    log.error("项目文件夹创建失败");
                }
            } catch (Exception e) {
                log.error("项目文件夹创建失败: {}", e.getMessage(), e);
            }
        }
    }
}
