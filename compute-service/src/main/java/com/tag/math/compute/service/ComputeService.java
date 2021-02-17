package com.tag.math.compute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.stream.IntStream;

@Service
public class ComputeService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${factservice6.host}")
    private String factServiceHost6;

    @Value("${factservice7.host}")
    private String factServiceHost7;

    @Value("${fibservice6.host}")
    private String fibServiceHost6;

    @Value("${fibservice7.host}")
    private String fibServiceHost7;


    public Long mine(int number){
        String url = "http://" + fibServiceHost6 + "/api/fib6/" + number;
        String url2 = "http://" + fibServiceHost7 + "/api/fib7/" + number;
        String url3 =  "http://" + factServiceHost6 + "/api/fact6/" + number;
        String url4 =  "http://" + factServiceHost7 + "/api/fact7/" + number;
        Long result = getResponse(url);
        Long result2 = getResponse(url2);
        Long result3 = getResponse(url3);
        Long result4 = getResponse(url4);

        return result + result2 + result3 + result4;
    }

    private Long getResponse(String url){
        return this.restTemplate.getForObject(url, Long.class);
    }

}
