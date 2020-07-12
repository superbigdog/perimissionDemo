package com.lxp.springcloud.service.impl;

import com.lxp.springcloud.dao.PaymentDao;
import com.lxp.springcloud.entities.Payment;
import com.lxp.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PaymentServiceImpl.java
 * @Description TODO
 * @createTime 2020年07月11日 02:48:00
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
