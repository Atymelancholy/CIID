package org.example;
import java.util.Random;

public class DecimalKeyGenerator {
    private final int n;
    private final int w;
    private final Random random;

    public DecimalKeyGenerator(int n, int w) {
        if (n <= 0 || w <= 0) {
            throw new IllegalArgumentException("Error...");
        }
        this.n = n;
        this.w = w;
        this.random = new Random();
    }

    public String[] generateKeys() {
        String[] keys = new String[n];
        for (int i = 0; i < n; i++) {
            keys[i] = generateSingleKey();
        }
        return keys;
    }

    private String generateSingleKey() {
        StringBuilder key = new StringBuilder(w);
        for (int j = 0; j < w; j++) {
            int digit = random.nextInt(10);
            key.append(digit);
        }
        return key.toString();
    }
}
