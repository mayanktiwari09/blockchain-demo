package com.proxy.controller;

import com.proxy.service.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proxy/")
public class ProxyController {

    @Autowired
    private Proxy proxyService;

    @GetMapping("/fib/{number}")
    public Long fib(@PathVariable int number){
        return this.proxyService.findFib(number);
    }

    @GetMapping("/fact/{number}")
    public Long fact(@PathVariable int number){
        return this.proxyService.findFact(number);
    }

    @GetMapping("/fib1/{number}")
    public Long fib1(@PathVariable int number){
        return this.proxyService.findFib1(number);
    }

    @GetMapping("/fact1/{number}")
    public Long fact1(@PathVariable int number){
        return this.proxyService.findFact1(number);
    }

    @GetMapping("/fib2/{number}")
    public Long fib2(@PathVariable int number){
        return this.proxyService.findFib2(number);
    }

    @GetMapping("/fact2/{number}")
    public Long fact2(@PathVariable int number){
        return this.proxyService.findFact2(number);
    }

    @GetMapping("/fib3/{number}")
    public Long fib3(@PathVariable int number){
        return this.proxyService.findFib3(number);
    }

    @GetMapping("/fact3/{number}")
    public Long fact3(@PathVariable int number){
        return this.proxyService.findFact3(number);
    }

    @GetMapping("/fib4/{number}")
    public Long fib4(@PathVariable int number){
        return this.proxyService.findFib4(number);
    }

    @GetMapping("/fact4/{number}")
    public Long fact4(@PathVariable int number){
        return this.proxyService.findFact4(number);
    }

    @GetMapping("/fib5/{number}")
    public Long fib5(@PathVariable int number){
        return this.proxyService.findFib5(number);
    }

    @GetMapping("/fact5/{number}")
    public Long fact5(@PathVariable int number){
        return this.proxyService.findFact5(number);
    }

    @GetMapping("/fib6/{number}")
    public Long fib6(@PathVariable int number){
        return this.proxyService.findFib6(number);
    }

    @GetMapping("/fact6/{number}")
    public Long fact6(@PathVariable int number){
        return this.proxyService.findFact6(number);
    }

    @GetMapping("/fib7/{number}")
    public Long fib7(@PathVariable int number){
        return this.proxyService.findFib7(number);
    }

    @GetMapping("/fact7/{number}")
    public Long fact7(@PathVariable int number){
        return this.proxyService.findFact7(number);
    }

}