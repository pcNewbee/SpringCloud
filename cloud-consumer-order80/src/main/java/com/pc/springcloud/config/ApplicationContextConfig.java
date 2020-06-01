package com.pc.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author pc
 * @date 2020/5/26 11:22
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }
}
