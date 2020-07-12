package com.lxp.springcloud.controller;

import com.lxp.springcloud.entities.CommonResult;
import com.lxp.springcloud.entities.Payment;
import com.lxp.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PaymentController.java
 * @Description TODO
 * @createTime 2020年07月11日 02:50:00
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果：" + result);
        if(result > 0){
            return new CommonResult(200, "插入数据库成功", result);
        }else{
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public Payment getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("******插入结果：" + result);
//        if(result != null){
//            return new CommonResult(200, "获取数据成功", result);
//        }else{
//            return new CommonResult(444, "获取数据失败", null);
//        }
        return result;
    }
}
