package com.lxp.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ApplicationContextConfig.java
 * @Description TODO
 * @createTime 2020年07月11日 04:04:00
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
