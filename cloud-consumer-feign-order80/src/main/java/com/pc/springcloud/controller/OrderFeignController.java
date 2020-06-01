package com.pc.springcloud.controller;

import com.pc.springcloud.entities.CommonResult;
import com.pc.springcloud.entities.Payment;
import com.pc.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author pc
 * @date 2020/5/30 13:28
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value="/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")  Long id) {
        return  paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //openfeign-ribbon 客户端默认等待1S
        return  paymentFeignService.paymentFeignTimeout();
    }
}
