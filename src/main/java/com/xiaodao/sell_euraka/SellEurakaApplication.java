package com.xiaodao.sell_euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SellEurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellEurakaApplication.class, args);
    }
}
