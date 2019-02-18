package com.yltech.controller;

import com.yltech.user.model.UserInfo;
import com.yltech.user.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LuGuoZheng
 * @date 2018/12/29 15:21
 * @Version 1.0
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("/get")
    public List<UserInfo> home() {
        return testService.get();
    }
}
