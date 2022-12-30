package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {

    @PostMapping("test")
    public String test(){
        return "yea";
    }

    @GetMapping("public")
    public String test3(){
        return "im public";
    }

    @GetMapping("test")
    public String test2(){
        return "yea";
    }
}
