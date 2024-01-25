package com.spring.virtual.threads.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {
    @GetMapping("/thread")
    public String getThreadName() {
        return Thread.currentThread().toString();
    }
}
