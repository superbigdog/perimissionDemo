package com.lxp.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PaymentMain8001.java
 * @Description TODO
 * @createTime 2020年07月11日 02:04:00
 */
@SpringBootApplication
@MapperScan("com.lxp.springcloud.dao")
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
