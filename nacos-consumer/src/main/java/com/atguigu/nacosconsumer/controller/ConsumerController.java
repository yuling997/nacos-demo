package com.atguigu.nacosconsumer.controller;

import com.atguigu.nacosconsumer.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("hi")
    public String hi(){
        String hello = this.providerFeign.hello();
        return "hi provider!"+"======="+hello;
    }
}
