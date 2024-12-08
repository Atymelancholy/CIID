package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int w = 5;
        DecimalKeyGenerator generator = new DecimalKeyGenerator(n, w);

        String[] keys = generator.generateKeys();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
