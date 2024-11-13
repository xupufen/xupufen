package com.xpf.background.system;

import com.xpf.background.utils.AjaxResource;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件上传下载
 * 静态资源获取
 */
@RestController
@RequestMapping(value = "/static")
public class FileSystem {

    @Value("${project.upload}")
    private String upload;

    /**
     * 文件通用上传
     */
    @PostMapping(value = "/fileUp")
    public AjaxResource<?> fileUp(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return AjaxResource.error("文件不为空!");
        }

        file.transferTo(new File(upload+"/"+file.getOriginalFilename()));
        return AjaxResource.success("文件上传成功!",upload+"/"+file.getOriginalFilename());
    }

    /**
     * 通用文件下载
     */
    @PostMapping(value = "/fileDownload")
    public void fileDownload(HttpServletResponse response, String fileUrl) throws IOException {
        File file = new File(fileUrl);
        if (!file.exists()) {
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("{\"code\": 500, \"msg\": \"文件不存在\"}");
            return;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-Length", String.valueOf(file.length()));

        try (ServletOutputStream out = response.getOutputStream();
             FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("\"code\": \"500,\" msg:\" " + e.getMessage());
        }
    }

}
