package com.twilight.scs.eureka.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Cp1EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Cp1EurekaClientApplication.class, args);
    }
}
