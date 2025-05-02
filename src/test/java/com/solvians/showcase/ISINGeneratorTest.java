package com.solvians.showcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ISINGeneratorTest {
    @Test
    public void testISINLength(){
        String isin = ISINGenerator.generateIsIn();
        assertNotNull(isin);
        assertEquals(12,isin.length());
    }

    @Test
    public void testCheckDigit(){
        assertEquals(6, ISINGenerator.checkDigit("DE123456789"));
    }

    @Test
    public void testISINStructure() {
        String isin = ISINGenerator.generateIsIn();
        // First 2 characters should be letters
        assertTrue(Character.isLetter(isin.charAt(0)));
        assertTrue(Character.isLetter(isin.charAt(1)));
        // Last character should be a digit
        assertTrue(Character.isDigit(isin.charAt(isin.length() - 1)));
    }
}
