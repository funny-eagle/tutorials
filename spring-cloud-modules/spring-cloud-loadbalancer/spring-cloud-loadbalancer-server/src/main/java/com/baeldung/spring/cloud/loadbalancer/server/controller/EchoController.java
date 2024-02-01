package com.baeldung.spring.cloud.loadbalancer.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        System.out.println("Hello, Nacos");
        return "Hello Nacos Discovery " + string;
    }
}