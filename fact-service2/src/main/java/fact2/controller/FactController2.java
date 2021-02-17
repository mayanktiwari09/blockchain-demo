package fact2.controller;

import fact2.service.FactService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FactController2 {

    @Autowired
    private FactService2 factService;

    @GetMapping("/fact2/{number}")
    public Long calculate(@PathVariable("number") int number) throws InterruptedException {
        System.out.println("Received fact request for :: " + number);
        long result = factService.calculateFactorial(number);
        System.out.println("Result :: " + result);
        return result;
    }

    @GetMapping("/health")
    public void health(){
        System.out.println("fact is up & healthy!");
    }
}
