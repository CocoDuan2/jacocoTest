package com.dxx.jacoco.controller;


import com.dxx.jacoco.service.IJacocoTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class JacocoTestController {

    @Resource
    IJacocoTestService jacocoTestService;


    @GetMapping("test1")
    public String test1(String name) {

        return  jacocoTestService.test1(name);
    }
}
