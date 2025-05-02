package com.solvians.showcase;

import java.time.LocalDate;

public class CertificateUpdate {

    // TODO: implement me.
    private final int timestamp;
    private final String isin;
    private final double bidPrice;
    private final String bidSize;
    private final double askPrice;
    private final int askSize;
    private final LocalDate maturityDate;

    public CertificateUpdate(int timestamp, String isin, double bidPrice, String bidSize, double askPrice, int askSize, LocalDate maturityDate) {
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


}
