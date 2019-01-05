package com.yltech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;


// 开启Feigh负载均衡
@EnableFeignClients
// 向服务中心注册
@EnableDiscoveryClient //@EnableEurekaClient
@SpringBootApplication
@RestController
public class MgrsiteControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MgrsiteControllerApplication.class, args);
    }

}