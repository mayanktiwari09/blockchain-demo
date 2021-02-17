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

    @GetMapping("/callMiner/{number}")
    public Long fib6(@PathVariable int number){
        return this.proxyService.callMiner(number);
    }

}