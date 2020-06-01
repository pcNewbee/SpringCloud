package com.pc.springcloud.service.impl;

import com.pc.springcloud.dao.PaymentDao;
import com.pc.springcloud.entities.Payment;
import com.pc.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author pc
 * @date 2020/5/25 22:28
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
