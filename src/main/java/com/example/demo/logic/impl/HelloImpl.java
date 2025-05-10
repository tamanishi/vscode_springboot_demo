package com.example.demo.logic.impl;

import org.springframework.stereotype.Component;

import com.example.demo.logic.Hello;

@Component
public class HelloImpl implements Hello {

    @Override
    public String hello() {
        return "Hello, World!";
    }

}
