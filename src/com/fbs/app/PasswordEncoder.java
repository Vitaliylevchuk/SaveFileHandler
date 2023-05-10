package com.fbs.app;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordEncoder {
    public static String encodeToHash(String password) throws NoSuchAlgorithmException {

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] hash = messageDigest.digest(password.getBytes());
        String encodedHash = Base64.getEncoder().encodeToString(hash);

        return encodedHash;
    }
}
