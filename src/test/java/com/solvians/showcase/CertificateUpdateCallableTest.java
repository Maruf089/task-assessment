package com.solvians.showcase;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class CertificateUpdateCallableTest {
    @Test
    public void testCall() throws Exception{
        Callable<String> callable = new CertificateUpdateCallable();
        String res = callable.call();
        assertNotNull(res);
    }

    @Test void multipleCalls() throws Exception{
        CertificateUpdateCallable callable = new CertificateUpdateCallable();
        String res1 = callable.call();
        String res2 = callable.call();
        assertNotEquals(res1,res2);
    }
}
