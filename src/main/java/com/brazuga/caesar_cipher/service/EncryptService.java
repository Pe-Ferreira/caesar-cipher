package com.brazuga.caesar_cipher.service;

public class EncryptService {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String input, int key) {
        String encryptedAlphabet = ALPHABET.substring(key) + ALPHABET.substring(0, key);
        String output = "";

        for(int i = 0; i < input.length(); i++) {
            if (isPartOfTheAlphabet(Character.toUpperCase(input.charAt(i)))) {
                int charIndex = ALPHABET.indexOf(Character.toUpperCase(input.charAt(i)));
                output = output + encryptedAlphabet.charAt(charIndex);
            } else {
                output = output + input.charAt(i);
            }
        }

        return output;
    }

    public boolean isPartOfTheAlphabet(Character ch) {
        return ALPHABET.contains(ch.toString());
    }
}
