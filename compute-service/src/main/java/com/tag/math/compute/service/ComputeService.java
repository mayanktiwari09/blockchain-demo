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

    @Value("${factservice.host}")
    private String factServiceHost;

    @Value("${factservice1.host}")
    private String factServiceHost1;

    @Value("${factservice2.host}")
    private String factServiceHost2;

    @Value("${factservice3.host}")
    private String factServiceHost3;

    @Value("${factservice4.host}")
    private String factServiceHost4;

    @Value("${factservice5.host}")
    private String factServiceHost5;

    @Value("${factservice6.host}")
    private String factServiceHost6;

    @Value("${factservice7.host}")
    private String factServiceHost7;

    @Value("${fibservice.host}")
    private String fibServiceHost;

    @Value("${fibservice1.host}")
    private String fibServiceHost1;

    @Value("${fibservice2.host}")
    private String fibServiceHost2;

    @Value("${fibservice3.host}")
    private String fibServiceHost3;

    @Value("${fibservice4.host}")
    private String fibServiceHost4;

    @Value("${fibservice5.host}")
    private String fibServiceHost5;

    @Value("${fibservice6.host}")
    private String fibServiceHost6;

    @Value("${fibservice7.host}")
    private String fibServiceHost7;


    public Long findFib(int number){
        String url = "http://" + fibServiceHost + "/api/fib/" + number;
        return getResponse(url);
    }

    public Long findFact(int number){
        String url =  "http://" + factServiceHost + "/api/fact/" + number;;
        return getResponse(url);
    }

    public Long findFib1(int number){
        String url = "http://" + fibServiceHost1 + "/api/fib1/" + number;
        return getResponse(url);
    }

    public Long findFib2(int number){
        String url = "http://" + fibServiceHost2 + "/api/fib2/" + number;
        return getResponse(url);
    }

    public Long findFib3(int number){
        String url = "http://" + fibServiceHost3 + "/api/fib3/" + number;
        return getResponse(url);
    }

    public Long findFib4(int number){
        String url = "http://" + fibServiceHost4 + "/api/fib4/" + number;
        return getResponse(url);
    }

    public Long findFib5(int number){
        String url = "http://" + fibServiceHost5 + "/api/fib5/" + number;
        return getResponse(url);
    }

    public Long findFib6(int number){
        String url = "http://" + fibServiceHost6 + "/api/fib6/" + number;
        return getResponse(url);
    }

    public Long findFib7(int number){
        String url = "http://" + fibServiceHost7 + "/api/fib7/" + number;
        return getResponse(url);
    }

    public Long findFact1(int number){
        String url =  "http://" + factServiceHost1 + "/api/fact1/" + number;;
        return getResponse(url);
    }

    public Long findFact2(int number){
        String url =  "http://" + factServiceHost2 + "/api/fact2/" + number;;
        return getResponse(url);
    }

    public Long findFact3(int number){
        String url =  "http://" + factServiceHost3 + "/api/fact3/" + number;;
        return getResponse(url);
    }

    public Long findFact4(int number){
        String url =  "http://" + factServiceHost4 + "/api/fact4/" + number;;
        return getResponse(url);
    }

    public Long findFact5(int number){
        String url =  "http://" + factServiceHost5 + "/api/fact5/" + number;;
        return getResponse(url);
    }

    public Long findFact6(int number){
        String url =  "http://" + factServiceHost6 + "/api/fact6/" + number;;
        return getResponse(url);
    }

    public Long findFact7(int number){
        String url =  "http://" + factServiceHost7 + "/api/fact7/" + number;;
        return getResponse(url);
    }


    private Long getResponse(String url){
        return this.restTemplate.getForObject(url, Long.class);
    }

}
