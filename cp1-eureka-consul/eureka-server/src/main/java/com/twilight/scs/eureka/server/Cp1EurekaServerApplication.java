package com.twilight.scs.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cp1EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Cp1EurekaServerApplication.class, args);
    }
}
