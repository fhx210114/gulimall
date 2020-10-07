package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients("com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemverApplication.class, args);
    }

}
