package com.solvians.showcase;

import java.time.LocalDate;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class CertificateUpdateCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        // provided long
        long timestamp =  System.currentTimeMillis();
        String isIn = ISINGenerator.generateIsIn();

        double bidPrice = random.nextDouble(100.00, 200.00);
//        System.out.println("bidPrice : " + bidPrice);

        int bidSize = random.nextInt(1000,5000);

        double askPrice = random.nextDouble(100.00, 200.00);

        int askSize = random.nextInt(1000,10000);

        LocalDate maturityDate = LocalDate.now().plusYears(2);
        String res = String.format("%d,%s,%.2f,%d,%.2f,%d",
                timestamp,isIn,bidPrice,bidSize,askPrice,askSize);

        return res;
    }
}
