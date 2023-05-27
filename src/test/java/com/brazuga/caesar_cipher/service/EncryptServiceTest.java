package com.brazuga.caesar_cipher.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EncryptServiceTest {

    private EncryptService encryptService;
    private final int CRYPTIC_KEY = 23;

    public EncryptServiceTest() {
        this.encryptService = new EncryptService();
    }

    @Test
    public void testEncrypt() {
        String input = "FIRST LEGION ATTACK EAST FLANK!";
        String expectedOutput = "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!";

        assertEquals(encryptService.encrypt(input, CRYPTIC_KEY), expectedOutput);
    }
}