package com.baeldung.spring.cloud.loadbalancer.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    private final RestTemplate restTemplate;

    @Autowired
    public TestController(RestTemplate template){
        this.restTemplate = template;
    }

    @GetMapping(value = "echo/{str}")
    public String echo(@PathVariable String str){
        return restTemplate.getForObject("http://service-provider/echo/"+str, String.class);
    }
}
