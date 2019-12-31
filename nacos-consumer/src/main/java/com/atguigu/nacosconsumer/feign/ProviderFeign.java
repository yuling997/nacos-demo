package com.atguigu.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-provider")
public interface ProviderFeign {

    @GetMapping("hello")
    public String hello();
}
