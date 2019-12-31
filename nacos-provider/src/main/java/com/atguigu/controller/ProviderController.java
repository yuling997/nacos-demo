package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope   //动态加载配置
public class ProviderController {

    @Value("${myName}")
    private String name;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${redis.url}")
    private String redisUrl;

    @GetMapping("hello")
    public String hello(){
        return "hello " + name+"\tredis-url= "+redisUrl+"\tjdbc-url= "+jdbcUrl;
    }
}
