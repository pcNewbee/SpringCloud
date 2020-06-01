package com.pc.springcloud.service;

import com.pc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author pc
 * @date 2020/5/25 22:25
 */
public interface PaymentService {
    //写操作
    public int create(Payment payment);
    //读
    public Payment getPaymentById(@Param("id") Long id);
}
