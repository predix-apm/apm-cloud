package com.ge.apm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApmEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApmEurekaApplication.class, args);
    }
}
