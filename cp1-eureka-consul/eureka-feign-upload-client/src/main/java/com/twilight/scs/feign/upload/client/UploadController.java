package com.twilight.scs.feign.upload.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;

@RestController
public class UploadController {

    @Autowired
    DcClient dcClient;

    @Autowired
    private UploadService uploadService;

    @GetMapping("/consumer")
    public String consumer(){
        return dcClient.consumer();
    }

    @PostMapping("/upload")
    public void upload(@RequestPart(value ="file") MultipartFile multipartFile){
        uploadService.handleFileUpload(multipartFile);
    }
}
