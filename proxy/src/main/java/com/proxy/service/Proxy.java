package com.proxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.stream.IntStream;

@Service
public class Proxy {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${computeservice.host}")
    private String computeServiceHost;

    public Long callMiner(int number){
        String url = "http://" + computeServiceHost + "/api/compute/miner/" + number;
        return getResponse(url);
    }

    private Long getResponse(String url){
        return this.restTemplate.getForObject(url, Long.class);
    }

}
