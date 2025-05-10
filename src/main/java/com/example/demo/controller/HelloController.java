package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.logic.Hello;

@RestController
public class HelloController {

    @Autowired
    Hello helloLogic;

    @RequestMapping("/hello")
    public String hello() {
        return helloLogic.hello();
    }
}
