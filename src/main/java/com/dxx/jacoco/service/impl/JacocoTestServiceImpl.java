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

    @Override
    public String test2(String name, Integer age) {
        String s = "JacocoTest2 测试姓名:" + name + "年龄:" + age;
        return s;
    }

    @Override
    public String test5(String name, Integer age) {

        System.out.println(name);
        return "hahahah";
    }

    @Override
    public String test3(String name, Integer age) {
        System.out.println("hahahahahah");
        System.out.println("dsjakdjskaldjklas");
        System.out.println("djskdjksl");
        return "test3333";
    }

    @Override
    public String test4(String name, Integer age) {
        return "test4444";
    }

    @Override
    public String test6(String name, Integer age) {
        return "543543";
    }

    @Override
    public String test7(String name, Integer age) {
        return "test777";
    }
}
