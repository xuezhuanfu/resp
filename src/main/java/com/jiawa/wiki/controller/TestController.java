package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.User;
import com.jiawa.wiki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String hello;

    @Autowired
    private UserService userService;

    @GetMapping(value = "test")
    public String helloWord(){
        return "helloword!"+hello;
    }

    @PostMapping(value = "test/post")
    public String helloWord(String param){
        return param;
    }

    @GetMapping(value = "testList")
    public List<User> testList(){
        return userService.test();
    }

    @GetMapping(value = "testDemoList")
    public List<User> testDemoList(){
        return userService.testDemo();
    }
}
