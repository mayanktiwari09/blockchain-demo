package fib6.service;


import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class FibService6 {

    public long calculateFib(final int number) throws InterruptedException {
        Thread.sleep(200);
        if(number%2==0){
            Thread.sleep(10);
        }
        return getFib(number);
    }

    // 2^N logic is intentional to simulate CPU intensive tasks
    private long getFib(int number) {
        if(number <= 0)
            return 0;
        else if(number <= 2 )
            return 1;
        return getFib(number-1) + getFib(number-2);
    }
}
