package com.dxx.jacoco.service.impl;


import com.dxx.jacoco.service.IJacocoTestService;
import org.springframework.stereotype.Service;

@Service
public class JacocoTestServiceImpl implements IJacocoTestService {

    @Override
    public String test1(String name) {
        String s = "JacocoTest1 测试姓名:" + name;
        return s;
    }
}
