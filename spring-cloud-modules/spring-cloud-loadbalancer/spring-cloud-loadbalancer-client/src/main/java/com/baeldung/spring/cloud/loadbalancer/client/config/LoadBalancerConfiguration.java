package com.baeldung.spring.cloud.loadbalancer.client.config;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.loadbalancer.NacosLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

public class LoadBalancerConfiguration {

    @Resource
    NacosDiscoveryProperties nacosDiscoveryProperties;

    @Bean
    public NacosLoadBalancer nacosLoadBalancer(Environment environment, LoadBalancerClientFactory loadBalancerClientFactory){
        String serviceId = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
        System.out.println("创建 NacosLoadBalancer， serviceId="+serviceId);
        return new NacosLoadBalancer(loadBalancerClientFactory.getLazyProvider(serviceId, ServiceInstanceListSupplier.class), serviceId, nacosDiscoveryProperties);
    }


}
