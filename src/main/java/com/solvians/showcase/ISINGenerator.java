package com.solvians.showcase;

import java.util.concurrent.ThreadLocalRandom;
public class ISINGenerator {
    // ISIN (string, 2 random uppercase alphabets + 9 random alphanumeric characters + 1 check digit)

    public static String generateIsIn(){
        StringBuilder isin = new StringBuilder();
        for(int i=0;i<2;i++){
            ThreadLocalRandom random = ThreadLocalRandom.current();
            char ch = (char) ('A' + random.nextInt(26));
            isin.append(ch);
        }
        // 2 random alphabet added


        return isin;
    }
}
