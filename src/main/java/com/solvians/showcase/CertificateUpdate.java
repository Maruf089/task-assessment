package com.solvians.showcase;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class CertificateUpdate {

    // TODO: implement me.
    private final long timestamp;
    private final String isin;
    private final double bidPrice;
    private final int bidSize;
    private final double askPrice;
    private final int askSize;
    private final LocalDate maturityDate;

    public CertificateUpdate(long timestamp, String isin, double bidPrice, int bidSize, double askPrice, int askSize, LocalDate maturityDate) {
        this.timestamp = timestamp;
        this.isin = isin;
        this.bidPrice = bidPrice;
        this.bidSize = bidSize;
        this.askPrice = askPrice;
        this.askSize = askSize;
        this.maturityDate = maturityDate;
    }

    @Override
    public String toString(){
        String res = String.format("%d,%s,%.2f,%d,%.2f,%d,%s",
                timestamp,isin,bidPrice,bidSize,askPrice,askSize,maturityDate);
        return res;
    }

    public static CertificateUpdate geneRandomCertificate(){
        ThreadLocalRandom random = ThreadLocalRandom.current();
        // provided long
        long timestamp =  System.currentTimeMillis();
        String isIn = ISINGenerator.generateIsIn();

        double bidPrice = random.nextDouble(100.00, 200.00);
        System.out.println("bidPrice : " + bidPrice);

        int bidSize = random.nextInt(1000,5000);

        double askPrice = random.nextDouble(100.00, 200.00);

        int askSize = random.nextInt(1000,10000);

        LocalDate maturityDate = LocalDate.now().plusYears(2);

        return new CertificateUpdate(timestamp,isIn,bidPrice,bidSize,askPrice,askSize,maturityDate);
    }


}
