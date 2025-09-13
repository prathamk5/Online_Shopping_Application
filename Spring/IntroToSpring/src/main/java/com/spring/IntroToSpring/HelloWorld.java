package com.spring.IntroToSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String hello(){
        return "Hello World. Lets Start SpringBoot";
    }
}
