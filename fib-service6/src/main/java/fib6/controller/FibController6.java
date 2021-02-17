package fib6.controller;

import fib6.service.FibService6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FibController6 {

    @Autowired
    private FibService6 fibService;

    @GetMapping("/fib6/{number}")
    public long calculate(@PathVariable int number) throws InterruptedException {
        System.out.println("Received fib request for :: " + number);
        long result = fibService.calculateFib(number);
        System.out.println("Result :: " + result);
        return result;
    }

}
