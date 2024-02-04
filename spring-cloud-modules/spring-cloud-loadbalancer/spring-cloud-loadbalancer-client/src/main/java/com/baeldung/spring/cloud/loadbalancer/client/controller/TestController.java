package com.baeldung.spring.cloud.loadbalancer.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "echo/{str}")
    public String echo(@PathVariable String str){
        return restTemplate.getForObject("http://serviceprovider/echo/"+str, String.class);
    }
}
