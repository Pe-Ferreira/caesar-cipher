package com.brazuga.caesar_cipher.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DecryptServiceTest {

    private DecryptService decryptService;
    private final int CRYPTIC_KEY = 23;

    public DecryptServiceTest() {
        this.decryptService = new DecryptService();
    }

    @Test
    public void testDecrypt() {
        String input = "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!";
        String expectedOutput = "FIRST LEGION ATTACK EAST FLANK!";

        assertEquals(decryptService.decrypt(input, CRYPTIC_KEY), expectedOutput);
    }
}