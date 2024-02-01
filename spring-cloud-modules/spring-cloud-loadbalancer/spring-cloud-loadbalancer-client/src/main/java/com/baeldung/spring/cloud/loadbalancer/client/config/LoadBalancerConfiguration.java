package com.baeldung.spring.cloud.loadbalancer.client.config;

import com.baeldung.spring.cloud.loadbalancer.client.strategy.CustomLoadBalancer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadBalancerConfiguration {
    @Bean
    public CustomLoadBalancer customLoadBalancer(){
        return new CustomLoadBalancer();
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
