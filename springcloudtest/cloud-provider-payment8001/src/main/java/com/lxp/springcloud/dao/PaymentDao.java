package com.lxp.springcloud.dao;

import com.lxp.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PaymentDao.java
 * @Description TODO
 * @createTime 2020年07月11日 02:32:00
 */
@Repository
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
