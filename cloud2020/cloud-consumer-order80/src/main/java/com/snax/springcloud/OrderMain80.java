package com.snax.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: 描述
 * <br>
 * @date: 2020/5/22 17:36
 * @author: snax
 * @version: SmartCityManager V1.0
 * @since: JDK 1.8
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderMain80.class, args);
    }
}
