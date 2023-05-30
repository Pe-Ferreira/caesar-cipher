package com.brazuga.caesar_cipher.service;

public class DecryptService {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String decrypt(String input, int key) {
        String encryptedAlphabet = ALPHABET.substring(key) + ALPHABET.substring(0, key);
        String output = "";

        for(int i = 0; i < input.length(); i++) {
            if (isPartOfTheAlphabet(Character.toUpperCase(input.charAt(i)))) {
                int charIndex = encryptedAlphabet.indexOf(Character.toUpperCase(input.charAt(i)));
                output = output + ALPHABET.charAt(charIndex);
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
