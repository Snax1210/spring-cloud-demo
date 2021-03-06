package com.snax.springcloud.controller;

import com.snax.springcloud.entities.CommonResult;
import com.snax.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.snax.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @description: 描述
 * <br>
 * @date: 2020/5/22 16:56
 * @author: snax
 * @version: SmartCityManager V1.0
 * @since: JDK 1.8
 */
@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*********插入结果：{}", result);
        if (result > 0)
        {
            return new CommonResult<>(200, "插入数据库成功,serverPort:" + serverPort, result);
        }
        else
        {
            return new CommonResult<>(444, "插入数据库失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        log.info("************查询结果：{}", payment);

        if (payment != null)
        {
            return new CommonResult<>(200, "查询成功,serverPort:" + serverPort, payment);
        }
        else
        {
            return new CommonResult<>(444, "没有对应记录查询id：" + id);
        }
    }
}
