package com.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
public class ProxyApplication {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder
                .setConnectTimeout(Duration.ofSeconds(1000))
                .setReadTimeout(Duration.ofSeconds(1000))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProxyApplication.class, args);
    }

}