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

//        System.out.println("isin : " + isin);

        for(int i=0;i<9;i++){
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int bound = random.nextInt(26);
            if(bound<9){
                //consider it number
                isin.append(random.nextInt(10));
            }else {
                //consider it Alphabet
                char ch = (char) ('A' + random.nextInt(26));
                isin.append(ch);
            }
//            System.out.println("isin : " + isin);
        }
        // 9 random number/alphabet addded

//        System.out.println("isin final: " + isin);


        int checkDigit = checkDigit("DE123456789");
        isin.append(checkDigit);

        return isin.toString();
    }

    public static int checkDigit(String isin){
        StringBuilder isInWithCheckDigit = new StringBuilder();
        for(char ch : isin.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                // number - no change
                isInWithCheckDigit.append(ch);
            } else if (ch>='A' && ch<='Z') {
                // alphabet - 'A' - 'A' 0 + 10
                isInWithCheckDigit.append(ch-'A'+10);
            }
        }

//        System.out.println("isInWithCheckDigit : " + isInWithCheckDigit);

        // claculate sum
        String reversedIsInWithCheckDigit = isInWithCheckDigit.reverse().toString();
        int sum = 0 , rightmost = 0;
        for(int i=0;i<reversedIsInWithCheckDigit.length();i++){
            char ch = reversedIsInWithCheckDigit.charAt(i);
            int digit = Character.getNumericValue(ch);

            if(rightmost % 2 == 0){
                digit *= 2;
            }
            while (digit > 0){
                sum = sum + digit % 10;
                digit /= 10;
            }
            rightmost++;
        }
//        System.out.println("sum : " + sum);

//        System.out.println("isInWithCheckDigit : " + isInWithCheckDigit);

        int lastDigit = sum % 10;
        int checkbit = 10 - lastDigit;
        if(checkbit==10) checkbit = 0;

        return checkbit;
    }
}
