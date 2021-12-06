package com.zr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengyy
 * @date 2021/12/6 17:49
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Jenkins";
    }
}
