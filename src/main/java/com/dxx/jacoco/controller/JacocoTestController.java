package com.dxx.jacoco.controller;


import com.dxx.jacoco.service.IJacocoTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("test2")
    public String test2(@RequestParam("name") String name, @RequestParam("age")Integer age) {
        return  jacocoTestService.test2(name,age);
    }

    @GetMapping("test3")
    public String test3(@RequestParam("name") String name, @RequestParam("age")Integer age) {
        return  jacocoTestService.test2(name,age);
    }
}
