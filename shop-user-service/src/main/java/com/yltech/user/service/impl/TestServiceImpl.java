package com.yltech.user.service.impl;

import com.yltech.user.service.ITestService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuGuoZheng
 * @date 2018/12/29 15:30
 * @Version 1.0
 * @description
 */
@RestController
public class TestServiceImpl implements ITestService {

    @Override
    public String get() {
        return "Hello SpringCloud";
    }
}
