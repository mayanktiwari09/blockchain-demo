package com.tag.math.compute.controller;

import com.tag.math.compute.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compute/")
public class ComputeController {

    @Autowired
    private ComputeService computeService;

    @GetMapping("/miner/{number}")
    public Long fib6(@PathVariable int number){
        return this.computeService.mine(number);
    }

}