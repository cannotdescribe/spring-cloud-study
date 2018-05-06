package com.twilight.scs.feign.upload.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-feign-upload-server")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
