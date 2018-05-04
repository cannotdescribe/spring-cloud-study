package com.twilight.scs.consul.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientApplication {
    public static void main(String[] args) {
//        new SpringApplicationBuilder(ConsulClientApplication.class).web(true).run(args);
        SpringApplication.run(ConsulClientApplication.class, args);
    }
}
