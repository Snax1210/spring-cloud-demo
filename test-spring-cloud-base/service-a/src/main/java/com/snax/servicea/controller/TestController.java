package com.snax.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 描述
 * <br>
 * @date: 2020/5/14 17:49
 * @author: m00000061/maotianhang
 * @version: SmartCityManager V1.0
 * @since: JDK 1.8
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world A";
    }
}
