package com.example.eruka_client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "say")
public class SayHelloController {

    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "hello world";
    }
}
