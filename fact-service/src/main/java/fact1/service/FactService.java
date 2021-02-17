package fact1.service;


import org.springframework.stereotype.Service;

import java.net.InetAddress;


@Service
public class FactService {

    public Long calculateFactorial(final int number) throws InterruptedException {
        final long result = getFact(number);
        return result;
    }

    private String getHostName(){
        try{
            return InetAddress.getLocalHost().getHostName();
        }catch(Exception e){
            return "UNKNOWN";
        }
    }

    private long getFact(int number) throws InterruptedException {
        Thread.sleep(200);
        if(number%2==0){
            Thread.sleep(10);
        }
        long fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
