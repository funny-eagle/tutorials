//package com.baeldung.spring.cloud.loadbalancer.client.loadbalancer;
//
//import org.springframework.cloud.client.DefaultServiceInstance;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.loadbalancer.DefaultResponse;
//import org.springframework.cloud.client.loadbalancer.Request;
//import org.springframework.cloud.client.loadbalancer.Response;
//import org.springframework.cloud.loadbalancer.core.ReactorServiceInstanceLoadBalancer;
//import reactor.core.publisher.Mono;
//
//public class CustomLoadBalancer implements ReactorServiceInstanceLoadBalancer {
//    @Override
//    public Mono<Response<ServiceInstance>> choose(Request request) {
//        int port;
//        if (request.hashCode() % 2 != 1) {
//            port = 8081;
//        } else {
//            port = 8080;
//        }
//        Response<ServiceInstance> response = new DefaultResponse(
//                new DefaultServiceInstance("service-provider", "service-provider", "localhost", port, false));
//
//        return Mono.just(response);
//    }
//}
