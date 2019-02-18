package com.yltech.user.service;

import com.yltech.user.model.UserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author LuGuoZheng
 * @date 2018/12/29 15:30
 * @Version 1.0
 * @description
 */
@FeignClient("shop-user-service")
public interface ITestService {

    @GetMapping("/hi")
    List<UserInfo> get();
}

