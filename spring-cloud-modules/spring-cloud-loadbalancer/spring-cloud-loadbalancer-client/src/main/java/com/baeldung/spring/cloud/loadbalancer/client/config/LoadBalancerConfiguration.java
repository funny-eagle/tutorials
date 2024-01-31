package com.baeldung.spring.cloud.loadbalancer.client.config;

import com.baeldung.spring.cloud.loadbalancer.client.strategy.CustomLoadBalancer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConfiguration {
    @Bean
    public CustomLoadBalancer customLoadBalancer(){
        return new CustomLoadBalancer();
    }
}
