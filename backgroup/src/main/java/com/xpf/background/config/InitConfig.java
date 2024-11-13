package com.xpf.background.config;

import com.xpf.background.mapper.init;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private init init;

    /**
     * 创建项目所需文件夹
     */
    @PostConstruct
    public void initFileUrl() {
        File file = new File(upload);
        File f = new File(upload + "/file");
        if (!file.exists() || !f.exists()) {
            try {
                log.info("创建开始{}",file.mkdirs());
                log.info("创建开始{}",f.mkdirs());
            }catch (Exception e) {
                log.error("项目文件夹创建失败{}",e.getMessage());
            }
        }
    }

    @PostConstruct
    public void initTable() {
        if (!init.initProject().isEmpty()){
            log.info("表存在，允许执行业务，项目启动.......");
        }else {
            log.error("MySQL业务表不存在，终止业务");
            System.exit(0);
        }
    }
}
