package com.ly.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("test")
    public String test(){
        return "jenkins成功";
    }
}
