package com.pc.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pc
 * @date 2020/5/30 13:28
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        //配置日志级别full
        return  Logger.Level.FULL;
    }
}
