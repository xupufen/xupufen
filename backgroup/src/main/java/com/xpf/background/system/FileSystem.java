package com.xpf.background.system;

import com.xpf.background.utils.AjaxResource;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        file.transferTo(new File(upload+"/file/"+file.getOriginalFilename()));
        return AjaxResource.success("文件上传成功!",upload+"/file/"+file.getOriginalFilename());
    }

    /**
     * 通用文件下载
     */
    @GetMapping(value = "/fileDownload")
    public void fileDownload(HttpServletResponse response, String fileUrl) throws IOException {
        fileUtils(response, fileUrl);
    }

    @PostMapping(value = "/fileDownload")
    public void fileDownloadPost(HttpServletResponse response, String fileUrl) throws IOException {
        fileUtils(response, fileUrl);
    }

    private void fileUtils(HttpServletResponse response, String fileUrl) throws IOException {
        File file = new File(fileUrl);
        if (!file.exists()) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("{\"code\": 404, \"msg\": \"文件不存在\"}");
            return;
        }

        Path path = file.toPath();
        String mimeType = Files.probeContentType(path);
        if (mimeType == null) {
            mimeType = "application/octet-stream";
        }
        response.setContentType(mimeType);

        String fileName = file.getName();
        String encodedFileName = URLEncoder.encode(fileName, StandardCharsets.UTF_8)
                .replaceAll("\\+", "%20");
        String contentDisposition = String.format("inline; filename=\"%s\"; filename*=UTF-8''%s",
                fileName, encodedFileName);
        response.setHeader("Content-Disposition", contentDisposition);

        try (OutputStream out = response.getOutputStream()) {
            Files.copy(path, out);
        } catch (IOException e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("{\"code\": 500, \"msg\": \"" + e.getMessage() + "\"}");
        }
    }

}
