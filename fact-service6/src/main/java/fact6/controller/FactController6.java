package fact6.controller;

import fact6.service.FactService6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FactController6 {

    @Autowired
    private FactService6 factService;

    @GetMapping("/fact6/{number}")
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
