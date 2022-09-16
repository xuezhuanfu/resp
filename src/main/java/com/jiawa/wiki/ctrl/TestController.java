package com.jiawa.wiki.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "test")
    public String helloWord(){
        return "helloword!";
    }

    @PostMapping(value = "test/post")
    public String helloWord(String param){
        return param;
    }
}
