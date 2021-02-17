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

    public Long findFib(int number){
        String url = "http://" + computeServiceHost + "/api/compute/fib/" + number;
        return getResponse(url);
    }

    public Long findFib1(int number){
        String url = "http://" + computeServiceHost + "/api/compute/fib1/" + number;
        return getResponse(url);
    }

    public Long findFib2(int number){
        String url = "http://" + computeServiceHost + "/api/compute/fib2/" + number;
        return getResponse(url);
    }

    public Long findFib3(int number){
        String url = "http://" + computeServiceHost + "/api/compute/fib3/" + number;
        return getResponse(url);
    }

    public Long findFib4(int number){
        String url = "http://" + computeServiceHost + "/api/compute/fib4/" + number;
        return getResponse(url);
    }

    public Long findFib5(int number){
        String url = "http://" + computeServiceHost + "/api/compute/fib5/" + number;
        return getResponse(url);
    }

    public Long findFib6(int number){
        String url = "http://" + computeServiceHost + "/api/compute/fib6/" + number;
        return getResponse(url);
    }

    public Long findFib7(int number){
        String url = "http://" + computeServiceHost + "/api/compute/fib7/" + number;
        return getResponse(url);
    }

    public Long findFact(int number){
        String url =  "http://" + computeServiceHost + "/api/compute/fact/" + number;;
        return getResponse(url);
    }

    public Long findFact1(int number){
        String url =  "http://" + computeServiceHost + "/api/compute/fact1/" + number;;
        return getResponse(url);
    }

    public Long findFact2(int number){
        String url =  "http://" + computeServiceHost + "/api/compute/fact2/" + number;;
        return getResponse(url);
    }

    public Long findFact3(int number){
        String url =  "http://" + computeServiceHost + "/api/compute/fact3/" + number;;
        return getResponse(url);
    }

    public Long findFact4(int number){
        String url =  "http://" + computeServiceHost + "/api/compute/fact4/" + number;;
        return getResponse(url);
    }

    public Long findFact5(int number){
        String url =  "http://" + computeServiceHost + "/api/compute/fact5/" + number;;
        return getResponse(url);
    }

    public Long findFact6(int number){
        String url =  "http://" + computeServiceHost + "/api/compute/fact6/" + number;;
        return getResponse(url);
    }

    public Long findFact7(int number){
        String url =  "http://" + computeServiceHost + "/api/compute/fact7/" + number;;
        return getResponse(url);
    }

    private Long getResponse(String url){
        return this.restTemplate.getForObject(url, Long.class);
    }

}
