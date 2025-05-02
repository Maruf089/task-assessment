package com.solvians.showcase;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public App(String threads, String quotes) {
        int threadsTot = Integer.parseInt(threads);
        int quotesTot = Integer.parseInt(quotes);

        CertificateUpdateGenerator certificateUpdateGenerator =
                new CertificateUpdateGenerator(threadsTot,quotesTot);

        List<CertificateUpdate> updateList = certificateUpdateGenerator.updateList();
        System.out.println("List Size : " + updateList.size());
        updateList.forEach(System.out::println);

        System.out.println("thread : " + threads );

    }

    public static void main(String[] args) {
//        ISINGenerator.generateIsIn();
 //       ISINGenerator.generateIsIn(“DE123456789”);

        if (args.length >= 2) {
        int threads = Integer.parseInt(args[0]);
            int quotes = Integer.parseInt(args[1]);

            CertificateUpdateGenerator certificateUpdateGenerator = new CertificateUpdateGenerator(threads, quotes);
            certificateUpdateGenerator.generateQuotes();
        }
        throw new RuntimeException("Expect at least number of threads and number of quotes. But got: " + args);
    }
}
