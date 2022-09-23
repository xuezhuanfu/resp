package com.jiawa.wiki.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String hello;

    @GetMapping(value = "test")
    public String helloWord(){
        return "helloword!"+hello;
    }

    @PostMapping(value = "test/post")
    public String helloWord(String param){
        return param;
    }
}
