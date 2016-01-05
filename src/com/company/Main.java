package com.company;

public class Main {

    public static void main(String[] args) {

        final String strToEncrypt = "test test test123";
        final String strPssword = "this is a key";
        AES.setKey(strPssword);

        AES.encrypt(strToEncrypt.trim());

        System.out.println("String to Encrypt: " + strToEncrypt);
        System.out.println("Encrypted: " + AES.getEncryptedString());

        final String strToDecrypt = AES.getEncryptedString();
        AES.decrypt(strToDecrypt.trim());

        System.out.println("String To Decrypt : " + strToDecrypt);
        System.out.println("Decrypted : " + AES.getDecryptedString());
    }
}
