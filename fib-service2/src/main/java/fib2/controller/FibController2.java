package fib2.controller;

import fib2.service.FibService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FibController2 {

    @Autowired
    private FibService2 fibService;

    @GetMapping("/fib2/{number}")
    public long calculate(@PathVariable int number) throws InterruptedException {
        System.out.println("Received fib request for :: " + number);
        long result = fibService.calculateFib(number);
        System.out.println("Result :: " + result);
        return result;
    }

}
