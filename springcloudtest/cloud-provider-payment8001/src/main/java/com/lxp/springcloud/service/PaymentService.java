package com.lxp.springcloud.service;

import com.lxp.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PaymentService.java
 * @Description TODO
 * @createTime 2020年07月11日 02:47:00
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
