package com.snax.springcloud.service;

import com.snax.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description: 描述
 * <br>
 * @date: 2020/5/22 16:54
 * @author: m00000061/maotianhang
 * @version: SmartCityManager V1.0
 * @since: JDK 1.8
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
