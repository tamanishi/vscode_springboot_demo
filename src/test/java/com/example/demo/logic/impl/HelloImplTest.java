package com.example.demo.logic.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloImplTest {

    private HelloImpl helloImpl;

    @BeforeEach
    void setUp() {
        helloImpl = new HelloImpl();
    }

    @Test
    void helloReturnsExpectedMessage() {
        String expected = "Hello, World!";
        String actual = helloImpl.hello();
        assertEquals(expected, actual);
    }
}
