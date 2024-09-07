package org.example.encryption;

import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class KeyPair {
    public static void main(String[] args) throws Exception {
        java.security.KeyPair keyPair = generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        System.out.println("Public key:" + Base64.getEncoder().encodeToString(publicKey.getEncoded()));
        System.out.println("Private key:" + Base64.getEncoder().encodeToString(privateKey.getEncoded()));
    }

    public static java.security.KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        return keyPairGenerator.generateKeyPair();
    }

}