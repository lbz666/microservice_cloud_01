package com.offcn.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //向容器中添加RestTemplate组件，组件可以直接调用Rest接口
    @LoadBalanced   //RestTemplate开启负载均衡
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }



}
