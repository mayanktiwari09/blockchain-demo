package fib3.controller;

import fib3.service.FibService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FibController3 {

    @Autowired
    private FibService3 fibService;

    @GetMapping("/fib3/{number}")
    public long calculate(@PathVariable int number) throws InterruptedException {
        System.out.println("Received fib request for :: " + number);
        long result = fibService.calculateFib(number);
        System.out.println("Result :: " + result);
        return result;
    }

}
