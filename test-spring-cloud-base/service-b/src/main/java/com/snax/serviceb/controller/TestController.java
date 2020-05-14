package com.snax.serviceb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 描述
 * <br>
 * @date: 2020/5/14 17:52
 * @author: m00000061/maotianhang
 * @version: SmartCityManager V1.0
 * @since: JDK 1.8
 */
@RestController
public class TestController {
    @Resource
    private ServiceAFeignClient serviceAFeignClient;

    @RequestMapping("/call")
    public String hello() {
        String result = serviceAFeignClient.hello();
        return "b to a 访问结果 ------ " + result;
    }
}
