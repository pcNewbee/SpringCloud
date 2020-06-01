package com.pc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pc
 * @date 2020/5/30 13:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8006.class,args);
    }
}
