package com.snax.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 描述
 * <br>
 * @date: 2020/5/14 17:54
 * @author: m00000061/maotianhang
 * @version: SmartCityManager V1.0
 * @since: JDK 1.8
 */
@FeignClient("SERVICE-SNAX-A")
public interface ServiceAFeignClient {
    @RequestMapping("/hello")
    public String hello();
}
