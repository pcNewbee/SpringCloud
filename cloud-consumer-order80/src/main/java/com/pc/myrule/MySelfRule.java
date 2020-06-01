package com.pc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pc
 * @date 2020/5/26 11:05
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule(); // 定义为随机
    }
}
