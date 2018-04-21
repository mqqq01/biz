package com.kuaibao.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${my.name}")
    private String name;

    @RequestMapping("/hello")
    public String index(){
        return name;
    }

}
