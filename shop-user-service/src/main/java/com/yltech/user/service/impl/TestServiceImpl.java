package com.yltech.user.service.impl;

import com.yltech.user.mapper.UserMapper;
import com.yltech.user.model.UserInfo;
import com.yltech.user.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LuGuoZheng
 * @date 2018/12/29 15:30
 * @Version 1.0
 * @description
 */
@RestController
public class TestServiceImpl implements ITestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> get() {
        return userMapper.list();
    }
}
